<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>json</title>
    <script src="${pageContext.request.contextPath}/js/jquery-2.2.4.min.js"></script>
</head>
<body>

<form>
    登陆名:<input type="text" name="name" id="name"><br/>
    密码:<input type="password" name="pass" id="pass"><br/>
    <input type="button" value="测试" onclick="testJson()">
</form>
</body>
<script>

    function testJson(){
        var name = $("#name").val();
        var pass = $("#pass").val();

        $.ajax({
            // headers: {
            //     'Accept': 'application/json',
            //     'Content-Type': 'application/json'
            // },
            url:"${pageContext.request.contextPath}/testJson",
            type:"post",
            data:JSON.stringify({name:name,pass:pass}),
            contentType:"application/json;charset=UTF-8",
            dataType:"json", //响应格式为json
            success:function (data) {

                console.log(data);
            }
        });
    }

</script>
</html>
