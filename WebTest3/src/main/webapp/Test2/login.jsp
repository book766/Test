<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>
    <%
        Cookie[] list = request.getCookies();

        for(Cookie cookie : list) {  //获取自动登录cookie
            if (cookie.getName().equals("autologin")) {
                request.setAttribute("user", cookie.getValue());
                request.getRequestDispatcher("/Test2/welcome.jsp").forward(request, response); //自动登录
            }
        }
    %>

    <div>
        <form action="${pageContext.request.contextPath}/login" method="post">
            <table>
                <tr>
                    <td>用户名：<input type="text" name="username" ></td>
                </tr>
                <tr>
                    <td>自动登录：<input type="checkbox" name="login" ></td>
                </tr>
                <tr>
                    <td><input type="submit" value="提交" align="center"></td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>
