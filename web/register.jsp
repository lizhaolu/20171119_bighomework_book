<%--
  Created by IntelliJ IDEA.
  User: superzhaolu
  Date: 2017/11/20
  Time: 21:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
    <link href="lib/bootstrap-3.3.7-dist/js/bootstrap.min.js" rel="stylesheet">
    <link href="lib/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
    <script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <s:head/>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <img alt="140x140" src="标题栏2.jpg" class="img-rounded" />
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <form role="form" action="registerAction.action" method="post">
                <s:fielderror name="err"/>
                <div class="form-group">
                    <label for="name">用户名</label>
                    <input type="text" class="form-control" id="name" placeholder="请输入用户名" name="username">
                </div>
                <div class="form-group">
                    <label for="exampleInputPassword1">密码</label>
                    <input type="password" class="form-control" id="exampleInputPassword1" name="password"/>
                </div>

                    <div class="form-group">
                        <label for="name">个人介绍</label>
                        <textarea class="form-control" rows="3" name="summary"></textarea>
                    </div>

                <div class="form-group">
                <label for="name">性别</label>
                <select class="form-control" name="sex">
                    <option name="sex" value="男">男</option>
                    <option name="sex" value="女">女</option>
                </select>
                </div>

                <%--<div class="form-group">--%>
                    <%--<label for="name">验证码</label>--%>
                    <%--<td><input type="text" name="check_code"> &nbsp;--%>
                        <%--<img src="servlet/CheckCodeServlet"></td>--%>
                <%--</div>--%>
                <button type="submit" class="btn btn-default">提交</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>
