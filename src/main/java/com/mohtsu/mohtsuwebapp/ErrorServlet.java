package com.mohtsu.mohtsuwebapp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import jakarta.validation.constraints.Null;

import java.io.IOException;

@WebServlet(name = "com.mohtsu.mohtsuwebapp.ErrorServlet", urlPatterns = "/exception")
public class ErrorServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        throw new NullPointerException();
    }
}
