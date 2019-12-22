<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理主页</title>
</head>
<body>
当前用户信息:${user.name}
<a href="${pageContext.request.contextPath}/logout">退出</a>

</body>
</html>
