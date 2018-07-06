package com.dao.impl;

import com.configuration.ConnectionConfig;
import com.dao.UserDao;
import com.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private ConnectionConfig dataSourceConfig; //look to DataSourceConfig class bean id='dataSource' definition


    private Connection connection;

    @PostConstruct
    public void init() {
        connection = dataSourceConfig.createConnection();
    }

    @Override
    public List<User> userList() {
        final String QUERY_SQL = "SELECT * FROM user_test";

        PreparedStatement ps = null;
        ResultSet rs = null;

        List<User> userList = new ArrayList<>();
        try {
            ps = connection.prepareStatement(QUERY_SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                User user = new User();
                user.setId(Long.parseLong(rs.getString(1)));
                user.setName(rs.getString(2));
               user.setAge(rs.getInt(3));
                userList.add(user);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                rs.close();
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        System.out.println(userList.size());

        return userList;
    }

    @Override
    public User getById(long id) {


        return null;
    }
}
