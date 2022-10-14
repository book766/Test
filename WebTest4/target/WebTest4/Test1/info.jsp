<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>信息显示</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
    <%
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String[] singerlist = request.getParameterValues("singer");
    %>

    <div>
        歌名：${param.song}
        <br/>
        歌手：
        <c:forEach var="name" items="<%=singerlist%>">
            ${name}&nbsp;
        </c:forEach>
    </div>
</body>
</html>
