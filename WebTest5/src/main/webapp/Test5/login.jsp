<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>登录</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/5.1.1/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.staticfile.org/twitter-bootstrap/5.1.1/js/bootstrap.bundle.min.js"></script>
    <script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
</head>
<body>
    <div class="container w-25 p-5 my-5 border" id="login">
        <h3 align="center">管理系统</h3>

        <form action="${pageContext.request.contextPath}/user/login" method="post">
            <div class="mb-3 mt-3">
                <label for="text" class="form-label">用户名:</label>
                <input type="text" class="form-control" id="text" placeholder="用户名" name="user_name">
            </div>
            <div class="mb-3">
                <label for="pwd" class="form-label">密码:</label>
                <input type="password" class="form-control" id="pwd" placeholder="密码" name="user_password">
            </div>
            <div class="form-check">
                <input class="form-check-input" type="checkbox" name="remember" id="flexCheckDefault">
                <label class="form-check-label" for="flexCheckDefault">
                    记住我
                </label>
            </div>
            <div style="text-align:center">
                <button type="submit" class="btn btn-info" onclick="check()">登录</button>
            </div>
        </form>

        <div>
            <p align="center" text="${message}"></p>
        </div>
    </div>

    <script>
        //检查用户名或密码是否为空
        $(document).ready(function() {
            $("button").click(function () {
                let username = $("input[name='user_name']").val();
                let userpassword = $("input[name='user_password']").val();

                if(username == ""){
                    alert("用户名为空");
                    return false;
                }
                if(userpassword == ""){
                    alert("密码为空！");
                    return false;
                }
            });
        });
    </script>
</body>
</html>
