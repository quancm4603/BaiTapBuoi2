package com.quancm.baitapbuoi2.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CheckLogin", urlPatterns = "/check-login")
public class CheckLogin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        if (session != null && session.getAttribute("username") != null){
            request.setAttribute("status", "Đăng nhập thành công");
            getServletContext().getRequestDispatcher("/check-login.jsp").forward(request, response);
        }else {
            request.setAttribute("status", "Đăng nhập thất bại");
            getServletContext().getRequestDispatcher("/check-login.jsp").forward(request, response);
        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}