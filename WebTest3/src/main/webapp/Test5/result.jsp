<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>计算结果</title>
</head>
<body>
    <jsp:useBean id="thenum" class="pojo.Number"></jsp:useBean>
    <jsp:setProperty name="thenum" property="num" param="number"/>

    <%
        List<Integer> factors = thenum.getfactors(thenum.getNum());
    %>

    <div>
        ${thenum.num}的全部因子：<br/>
        <c:forEach var="factor" items="<%=factors%>">
            ${factor}
        </c:forEach>
    </div>
</body>
</html>
