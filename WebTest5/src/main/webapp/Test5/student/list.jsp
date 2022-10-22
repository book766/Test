<%@ page import="Test5.javabean.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>班级信息</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/5.1.1/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.staticfile.org/twitter-bootstrap/5.1.1/js/bootstrap.bundle.min.js"></script>
</head>
<body>
    <jsp:include page="../common/nav.jsp"></jsp:include>

    <div class="container mt-3 text-center">
        <p class="h1">班级信息</p>

         <div align="center">
            <c:if test="${pageContext.session.getAttribute(\"user\").user_role == \"admin\"}">
                <!-- 管理员功能 -->
                <!-- 增加 -->
                <a href="${pageContext.request.contextPath}/student/toinsertinfo" class="btn btn-info" role="button">增加</a>
            </c:if>
            <!-- 刷新 -->
            <a href="${pageContext.request.contextPath}/student/list" class="btn btn-info" role="button">刷新</a>
        </div>
        <!-- 查询 -->
        <form action="${pageContext.request.contextPath}/student/search" method="get">
            <div class="input-group col-xs-3">
                <input type="text" name="id" class="form-control col-xs-3"placeholder="输入学生学号"/>
                <span class="input-group-btn">
                       <button class="btn btn-info btn-search">查找</button>
                </span>
            </div>
        </form>

        <table class="table table-hover">
            <thead>
                <tr>
                    <th>学生学号</th>
                    <th>学生姓名</th>
                    <th>学生性别</th>
                    <th>学生地址</th>
                    <th>学生手机号</th>
                    <c:if test="${pageContext.session.getAttribute(\"user\").user_role == \"admin\"}">
                        <th colspan="2">操作</th>
                    </c:if>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="s" items="${list}">
                    <tr>
                        <td>${s.stud_id}</td>
                        <td>${s.stud_name}</td>
                        <td>${s.stud_gender}</td>
                        <td>${s.stud_address}</td>
                        <td>${s.stud_phone}</td>
                        <c:if test="${pageContext.session.getAttribute(\"user\").user_role == \"admin\"}">
                            <!-- 管理员功能 -->
                            <!-- 修改 -->
                            <td>
                                <a href="${pageContext.request.contextPath}/student/toupdate?id=${s.stud_id}" class="btn btn-primary" role="button">修改</a>
                            </td>
                            <!-- 删除 -->
                            <td>
                                <a href="${pageContext.request.contextPath}/student/delete?id=${s.stud_id}" class="btn btn-danger" role="button" onclick="del()">删除</a>
                            </td>
                        </c:if>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>

    <script>
        function del() {
            if(confirm("是否要删除")){
                alert("已删除");
                return true;
            }else {
                alert("已取消");
                return false;
            }
        }
    </script>
</body>
</html>
