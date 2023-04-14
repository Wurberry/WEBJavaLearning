package testCookies;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.text.CollationKey;

@WebServlet(name = "SetCookiesServlet", value = "/SetCookiesServlet")
public class SetCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookieId = new Cookie("user_id", "123");
        cookieId.setMaxAge(24 * 60 * 60);
        response.addCookie(cookieId);

        Cookie cookieName = new Cookie("user_name", request.getParameter("name"));
        cookieName.setMaxAge(24 * 60 * 60);
        response.addCookie(cookieName);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
