package com.cdk.servlets;

import javax.jms.Session;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

public class LoginServlet extends javax.servlet.http.HttpServlet {
    HashMap<String,String> userDatabase = null;
    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    public void init() throws ServletException {
        userDatabase = new HashMap<>();
        userDatabase.put("Sameer","123");
        userDatabase.put("admin","admin");
    }

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        PrintWriter pw = response.getWriter();
        HttpSession session = request.getSession();

        response.setContentType("text/html");
        if(!userDatabase.containsKey(userName)){
            pw.write("username not found! Do signup");
        }
        else if (password.equals(userDatabase.get(userName))){
            pw.write("Login succesful");
            session.setAttribute("Login_Status",true);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/services.html");
            requestDispatcher.forward(request,response);
        }
        else {
            pw.write("You have entered wrong password ! Try again");
        }

    }


    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        PrintWriter pw = response.getWriter();
        HttpSession session = request.getSession();

        response.setContentType("text/html");
        if(!userDatabase.containsKey(userName)){
            pw.write("username not found! Do signup");
        }
        else if (password.equals(userDatabase.get(userName))){
            pw.write("Login succesful");
            session.setAttribute("Login_Status",true);
        }
        else {
            pw.write("You have entered wrong password ! Try again");
        }

    }
}
