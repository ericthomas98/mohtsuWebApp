package com.mohtsu.mohtsuwebapp;

import java.io.*;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "HelloServlet", urlPatterns = "/hello")

public class HelloServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        System.out.println("The post request has been made to /hello");
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("The get request has been made to /hello");
        response.setContentType("text/html");

         response.getWriter().println("<h1>Heya (P)</h1>");
         response.getWriter().println("<p> this is the website! </p>");
    }

}