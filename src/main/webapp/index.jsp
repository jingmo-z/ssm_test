<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>index</h1>
<form method="post" action="${pageContext.request.contextPath}/save">
    用户名<input type="text" name="username">
    密码<input type="text" name="password">
    <input type="submit" value="提交">
</form>
<hr/>
<a href="${pageContext.request.contextPath}/findAll">查询所有</a>
<a href="img/001935-1615911575642b.jpg">img</a>
</body>
</html>
