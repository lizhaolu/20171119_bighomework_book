<%--
  Created by IntelliJ IDEA.
  User: superzhaolu
  Date: 2017/11/24
  Time: 11:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="lib/bootstrap-3.3.7-dist/js/bootstrap.min.js" rel="stylesheet">
    <link href="lib/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
    <script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>
<div class="row clearfix">
    <div class="col-md-12 column">
        <img alt="140x140" src="标题栏2.jpg" class="img-rounded" />
    </div>
</div>
<h3>
    以下是你的信息，你可以修改后提交
</h3>
<form action="updateuser.action" method="post">
    <table>
        <tr>
            <td>用户名</td>
            <td><input type="text" name="username" value="${sessionScope.user.username}"></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="text" name="password" value="${sessionScope.user.password}"></td>
        </tr>
        <tr>
            <td>简介</td>
            <td><input type="text" name="summary" value="${sessionScope.user.summary}"></td>
        </tr>
        <tr>
            <td>性别</td>
            <td><input type="text" name="sex" value="${sessionScope.user.sex}"></td>
        </tr>
        <tr>
            <td><button type="submit">修改</button></td>
        </tr>
    </table>
</form>

</body>
</html>
