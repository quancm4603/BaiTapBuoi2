package com.quancm.baitapbuoi2.servlet;

import com.quancm.baitapbuoi2.dao.UserDao;
import com.quancm.baitapbuoi2.model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private UserDao userDao;

    @Override
    public void init() throws ServletException {
        userDao = new UserDao();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        if (session != null && session.getAttribute("username") != null){
            response.sendRedirect("/");
        }else {
            request.getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        try {
            if (userDao.validate(user)) {
                HttpSession session = request.getSession();
                session.setAttribute("username", username);
                System.out.println(userDao.validate(user));
                response.sendRedirect("/");
            } else {
//                session = request.getSession();
                request.setAttribute("status", "Wrong username or password");
                request.getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}