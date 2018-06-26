<%--
  Created by IntelliJ IDEA.
  User: idea
  Date: 2017/10/23
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>上传成功</title>
    <link href="lib/bootstrap-3.3.7-dist/js/bootstrap.min.js" rel="stylesheet">
    <link href="lib/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
    <script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="carousel slide" id="carousel-391737">
                <ol class="carousel-indicators">
                    <li class="active" data-slide-to="0" data-target="#carousel-391737">
                    </li>
                    <li data-slide-to="1" data-target="#carousel-391737">
                    </li>
                    <li data-slide-to="2" data-target="#carousel-391737">
                    </li>
                </ol>
                <div class="carousel-inner">
                    <div class="item active">
                        <img alt="" src="水花.jpeg" />
                        <div class="carousel-caption">
                            <h4>
                               欢迎你访问本网站来下载图片
                            </h4>
                            <p>
                               我们尽可能的为你找到你心仪的图片
                            </p>
                        </div>
                    </div>
                    <div class="item">
                        <img alt="" src="奥布莱恩杯.jpeg" />
                        <div class="carousel-caption">
                            <h4>
                                欢迎你访问本网站来下载图片
                            </h4>
                            <p>
                                我们尽可能的为你找到你心仪的图片
                            </p>
                        </div>
                    </div>
                    <div class="item">
                        <img alt="" src="库里标志.jpeg" />
                        <div class="carousel-caption">
                            <h4>
                                欢迎你访问本网站来下载图片
                            </h4>
                            <p>
                                我们尽可能的为你找到你心仪的图片
                            </p>
                        </div>
                    </div>
                </div> <a class="left carousel-control" href="#carousel-391737" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a> <a class="right carousel-control" href="#carousel-391737" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
            </div>
            <div class="alert alert-dismissable alert-info">
                <button type="button" class="close" data-dismiss="alert" aria-hidden="true">×</button>
                <h4>
                    点击链接即可下载图片
                </h4> <strong>欢迎${sessionScope.user.username}下载</strong><br/>
                <a href="FindByUsername.action?" class="alert-link">查看个人信息</a>
            </div>
            <div class="row clearfix">
                <div class="col-md-8 column">
                    <div class="row clearfix">
                        <s:iterator value="paths" var="path">
                        文件名:<a href="downloadAction.action?inputPath=${requestScope.savePath}<s:property
                        value="#path.getSaveFileName()"/>&downFileName=<s:property value="#path.getUploadFileName()"/>">
                        <s:property value="#path.getUploadFileName()"/></a><br>
                        </s:iterator>
                    </div>
                </div>
                <div class="col-md-4 column">
                    <h3>
                        你登陆所用的账号
                    </h3>
                    <ul class="list-group">
                        <li class="list-group-item">用户名</li>
                        <li class="list-group-item">${sessionScope.user.username}</li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>
        </div>
    </div>
</div>

<%--<s:iterator value="paths" var="path">--%>
    <%--&lt;%&ndash;文件名：<a href="downloadAction.action?inputPath=${savePath}<s:property value="#path.getSaveFileName()"/>&downFileName=<s:property value="#path.getUploadFileName()"/>&contentType=<s:property value="#path.getUploadContentType()"/>">&ndash;%&gt;--%>
    <%--文件名<a href="downloadAction.action?inputPath=${requestScope.savePath}<s:property--%>
        <%--value="#path.getSaveFileName()"/>&downFileName=<s:property value="#path.getUploadFileName()"/>">--%>
    <%--<s:property value="#path.getUploadFileName()"/></a><br>--%>
<%--</s:iterator>--%>


</body>
</html>
