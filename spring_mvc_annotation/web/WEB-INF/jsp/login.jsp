<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆页</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/login" method="post">
    ${msg}<br/>
    登录名:<input name="name" type="text" /> <br/>
    密码:<input name="pass" type="password"><br/>
    <input type="submit" value="登录">

</form>
</body>
</html>
