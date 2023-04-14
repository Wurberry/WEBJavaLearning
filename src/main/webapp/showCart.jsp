<%--
  Created by IntelliJ IDEA.
  User: danye
  Date: 03.04.2023
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cart View</title>
</head>
<body>

    <%@ page import="testSession.Cart" %>

    <% Cart cart = (Cart) session.getAttribute("cart"); %>

    <p>Name</p>
    <%= cart.getName()%>

    <p>Quantity</p>
    <%= cart.getQuantity()%>

</body>
</html>
