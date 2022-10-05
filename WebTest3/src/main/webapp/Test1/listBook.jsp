<%@ page import="pojo.Book" %>
<%@ page import="java.util.Map" %>
<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>图书页面</title>
</head>
<body>
    <%
        Map list = Book.booklist();
    %>

    <div>
        <c:url var="prefix" value="purchase.jsp" />
        本站提供的图书有：<br/>
        <c:forEach var="book" items="<%=list%>">
            ${book.value}<a href="${prefix}?bookid=${book.key}">点击购买</a><br />
        </c:forEach>
    </div>
</body>
</html>
