
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
    <form action="${pageContext.request.contextPath}/user/some.do" method="post">
        <table>
            <td>姓名:<label>
                <input type="text" name="name">
            </label></td>
            <td>年龄:<label>

                <input type="text" name="age">
            </label></td>
            <br/>
        </table>
        <button type="submit">提交</button>
    </form>
</body>
</html>
