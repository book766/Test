<%@ page import="pojo.Book" %>
<%@ page import="pojo.BookDB" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>购买页面</title>
</head>
<body>
    <%
        List<Book> books;

        String id = request.getParameter("bookid");
        if(id == null){
            response.sendRedirect(request.getContextPath() + "/Test1/listBooks.jsp");
        }

        books = (List) session.getAttribute("books");
        if(books == null){
            books = new ArrayList<>();
            session.setAttribute("books",books);
        }

        books.add(BookDB.GetBookById(id));

        Cookie cookie = new Cookie("username", "张三");
        cookie.setMaxAge(60);
        cookie.setPath("/");
        response.addCookie(cookie);

        response.sendRedirect(request.getContextPath() + "/Test1/cart.jsp");
    %>
</body>
</html>
