package com;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

@WebServlet(value = "/", name = "TestServlet")
public class TestServlet extends HttpServlet {

    private ArrayList<String> nameList = new ArrayList<>(Arrays.asList("String", "Kolia", "Ilona", "Vandam"));

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("nameList", nameList);


        if (req.getParameter("id") != null && req.getParameter("id").equals("add")) {
            String name = req.getParameter("fName");
            add(name);
        } else if (req.getParameter("id") != null && req.getParameter("id").equals("delete")) {
            String name = req.getParameter("fName");
            delete(name);
        } else if (req.getParameter("id") != null && req.getParameter("id").equals("go")) {
            myRedirect(req, resp);
            return;
        }
        req.getRequestDispatcher("hello.jsp").forward(req, resp);

    }

    private void myRedirect(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        resp.sendRedirect("/test2");
    }

    private void delete(String name) {
        System.out.println("delete");
//        for (String string : nameList) {
//            if (string.equals(name)) {
        nameList.remove(name);
//            }

    }

    private void add(String name) {
        System.out.println("add");
        nameList.add(name);
    }
}
