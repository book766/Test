<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改用户信息</title>
</head>
<body>
    <div>
        <form action="${pageContext.request.contextPath}/Test4/showinfo.jsp" method="post">
            <jsp:include page="../input.jsp" />
        </form>
    </div>
</body>
</html>
