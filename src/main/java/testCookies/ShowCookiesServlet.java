package testCookies;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ShowCookiesServlet", value = "/ShowCookiesServlet")
public class ShowCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();

        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");

        for (Cookie cookie : cookies) {
            printWriter.println("<h1>" + cookie.getName() + " : " + cookie.getValue() + "</h1>");
        }

        printWriter.println("</html>");


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
