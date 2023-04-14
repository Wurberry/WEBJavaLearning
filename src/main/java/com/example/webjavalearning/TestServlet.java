package com.example.webjavalearning;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import testSession.Cart;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "TestServlet", value = "/TestServlet")
public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        String user = (String) session.getAttribute("current_user");

        if(user == null){
            // response для анониманого пользователя
            // авторизация или регистрация
            // установка имени для сессии
        }  else {
            // response для авторизованного
        }

//        Cart cart = (Cart) session.getAttribute("cart");
//
//        String name = request.getParameter("name");
//        int quantity = Integer.parseInt(request.getParameter("quantity"));
//
//        if(cart == null) {
//            cart = new Cart();
//            cart.setName(name);
//            cart.setQuantity(quantity);
//        }
//
//        session.setAttribute("cart", cart);
//
//        getServletContext().getRequestDispatcher("/showCart.jsp").forward(request, response);

//        PrintWriter printWriter = response.getWriter();

//        printWriter.println("<html>");
//        printWriter.println("<h1> Your count is: " + "</h1>");
//        printWriter.println("<html>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
