<%--
  Created by IntelliJ IDEA.
  User: superzhaolu
  Date: 2017/11/26
  Time: 19:25
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
    恭喜你修改成功
</h3>
<div class="panel-body">
    用户名
</div>
<div class="panel-footer">
    ${sessionScope.user.username}
</div>
<div class="panel-body">
    密码
</div>
<div class="panel-footer">
    ${sessionScope.user.password}
</div>
<div class="panel-body">
    简介
</div>
<div class="panel-footer">
    ${sessionScope.user.summary}
</div>
<div class="panel-body">
    性别
</div>
<div class="panel-footer">
    ${sessionScope.user.sex}
</div>
<a href="show.action">回到下载页面</a>
</body>
</html>
