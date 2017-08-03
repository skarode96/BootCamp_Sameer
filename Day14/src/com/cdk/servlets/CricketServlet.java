package com.cdk.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.ConcurrentHashMap;

public class CricketServlet extends javax.servlet.http.HttpServlet {
    ConcurrentHashMap<String,String> scoreMap = null;
    public void init(){

        scoreMap.put("England","Score : 330/3 , Status : Lost");
        scoreMap.put("India","Score : 310/2 , Status : Win");


    }

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html");
        String country = request.getParameter("country");
        String match_type = request.getParameter("match_type");

        PrintWriter printWriter = response.getWriter();
        printWriter.write("Team "+ country + "Match type "+ match_type +"Status of match : " + scoreMap.get(country) );
    }

    @Override
    public void destroy() {
        scoreMap.clear();
        scoreMap = null;
    }
}
