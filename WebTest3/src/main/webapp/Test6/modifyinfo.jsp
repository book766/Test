<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改用户信息</title>
</head>
<body>
    <div>
        <form action="${pageContext.request.contextPath}/Test6/showinfo.jsp" method="post">
            <table>
                <tr><td>用户名：<input type="text" name="username" ></td></tr>
                <tr><td>密码：<input type="password" name="userpassword" ></td></tr>
                <tr><td><input type="submit" value="提交" align="center"></td></tr>
            </table>
        </form>
    </div>
</body>
</html>
