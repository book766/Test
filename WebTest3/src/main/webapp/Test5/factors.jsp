<%@ page language="java" contentType="text/html; charset=utf-8"%>
<html>
<head>
    <title>输入数字</title>
</head>
<body>
<div>
    <form action="${pageContext.request.contextPath}/Test5/result.jsp" method="post">
        <table>
            <tr><td>正整数：<input type="text" name="number" ></td></tr>
            <tr><td><input type="submit" value="提交" align="center"></td></tr>
        </table>
    </form>
</div>
</body>
</html>
