<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>信息输入</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
    <%
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
    %>

    <div>
        <form action="${pageContext.request.contextPath}/Test1/info.jsp" method="post" accept-charset="UTF-8">
            <h1>信息采集</h1>
            歌名：
            <input type="text" name="song" >
            <br/>
            歌手：
            <input type="checkbox" name="singer" value="那英"/>那英
            <input type="checkbox" name="singer" value="王菲"/>王菲
            <br/>
            <input type="submit" value="提交" align="center">
        </form>
    </div>
</body>
</html>
