package com;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

@WebServlet(value = "/test2", name = "TestServlet2")
public class TestServlet2 extends HttpServlet {

    private ArrayList<String> nameList = new ArrayList<>(Arrays.asList("String", "Kolia", "Ilona", "Vandam"));

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("hello2.jsp").forward(req, resp);
    }


}
