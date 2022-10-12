<%@ page import="pojo.Book" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>购物车页面</title>
</head>
<body>
    <%
        PrintWriter print = response.getWriter();
        List<Book> list = (List)session.getAttribute("books");

        if(list == null){
            print.println("没有购买物品");
            response.setHeader("Refresh", "2;URL="+ request.getContextPath() +"/Test1/listBook.jsp");
        }
    %>

    <div>
        <c:set var="sessionname" value="books"/>
        <c:if test="${pageContext.session.getAttribute(sessionname) != null }">
            ${cookie.username.value}，您购买的图书有：<br/>
            <c:forEach var="book" items="<%=list%>">
                ${book.name}<br/>
            </c:forEach>
        </c:if>
    </div>
</body>
</html>
