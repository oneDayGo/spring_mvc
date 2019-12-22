<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>课程列表</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/deleteCourse" method="post">
        <table>
            <tr>
                <td>选择</td>
                <td>课程名</td>
            </tr>
            <tr>
                <td><input name="ids" value="1" type="checkbox"></td>
                <td>java程序设计</td>
            </tr>
            <tr>
                <td><input name="ids" value="2" type="checkbox"></td>
                <td>数据库</td>
            </tr>
            <tr>
                <td><input name="ids" value="3" type="checkbox"></td>
                <td>应用开发</td>
            </tr>
        </table>
        <input type="submit" value="删除">
    </form>
</body>
</html>
