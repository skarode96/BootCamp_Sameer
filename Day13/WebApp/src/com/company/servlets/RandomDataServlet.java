package com.company.servlets;

import javax.servlet.http.*;
import javax.servlet.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class RandomDataServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();
        printWriter.write("<p> Random Integer : " + Math.random() * 100 + "</p>");
        printWriter.write("<p> Date and Time : " + dateFormat.format(date) + "</p>");

    }
}
