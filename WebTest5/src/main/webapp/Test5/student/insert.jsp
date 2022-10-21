<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>增加信息</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/5.1.1/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.staticfile.org/twitter-bootstrap/5.1.1/js/bootstrap.bundle.min.js"></script>
</head>
<body>
    <div class="container mt-3 w-50">
        <div align="center">
            <h3 >增加学生信息</h3>
        </div>

        <form action="${pageContext.request.contextPath}/student/insert" method="post">
            <div class="form-floating mb-3 mt-3">
                <input type="text" class="form-control" id="text" placeholder="学生姓名" name="stud_name">
                <label for="text" class="form-label">学生姓名</label>
            </div>
            <div class="form-floating mb-3 mt-3">
                <input type="text" class="form-control" id="text" placeholder="学生性别" name="stud_gender">
                <label for="text" class="form-label">学生性别</label>
            </div>
            <div class="form-floating mb-3 mt-3">
                <input type="text" class="form-control" id="text" placeholder="学生地址" name="stud_address">
                <label for="text" class="form-label">学生地址</label>
            </div>
            <div class="form-floating mb-3 mt-3">
                <input type="text" class="form-control" id="text" placeholder="学生手机号" name="stud_phone">
                <label for="text" class="form-label">学生手机号</label>
            </div>
            <div class="mb-3 mt-3" align="center">
                <button type="submit" class="btn btn-info ">提交</button>
                <button type="reset" class="btn btn-info ">重置</button>
            </div>
        </form>
    </div>

    <div align="center">
        <a href="${pageContext.request.contextPath}/student/list" class="btn btn-info" role="button">返回首页</a>
    </div>
</body>
</html>
