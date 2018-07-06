package com;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/")
public class FirstAnnotationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");

        if (req.getParameter("id") != null && req.getParameter("id").equals("Add")) {
            System.out.println("if add");
            addData(req, resp);
        } else if (req.getParameter("id") != null && req.getParameter("id").equals("Delete")) {
            System.out.println("if del");
            deleteData(req, resp);
        } else if (req.getParameter("id") != null && req.getParameter("id").equals("Ref")) {
            System.out.println("if del");
            refData(req, resp);
        } else {

            req.setAttribute("name", "bestJavaTeam in annotation servlet and I get you " + firstName + " - " + lastName);
            req.getRequestDispatcher("servlets_jsp/hello.jsp").forward(req, resp);
        }
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");

        req.setAttribute("name", "Post method " + firstName + " - " + lastName);
        req.getRequestDispatcher("servlets_jsp/hello.jsp").forward(req, resp);
    }

    private void addData(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("add");
        req.setAttribute("name", "ADD DATA");
        req.getRequestDispatcher("servlets_jsp/hello.jsp").forward(req, resp);
    }

    private void deleteData(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("delete");
        String name = "DELETE";
        req.setAttribute("name", name);
        req.getRequestDispatcher("servlets_jsp/hello.jsp").forward(req, resp);
    }

    private void refData(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("in ref");
        resp.sendRedirect("/SecondServlet");

    }
}
