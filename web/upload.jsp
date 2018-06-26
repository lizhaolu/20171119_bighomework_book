<%--
  Created by IntelliJ IDEA.
  User: idea
  Date: 2017/10/23
  Time: 15:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>上传</title>
    <link href="lib/bootstrap-3.3.7-dist/js/bootstrap.min.js" rel="stylesheet">
    <link href="lib/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
    <script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <img alt="140x140" src="标题栏2.jpg" />
        <div class="col-md-12 column">
            <h3 class="text-center">
                这个页面是上传图片的++
            </h3>
            <dl>
                <dt>
                    请注意
                </dt>
                <dd>
                  图片上传只允许上传与金州勇士有关的图片
                </dd>
                <dt>
                    请注意
                </dt>
                <dd>
                    图片格式只支持.jpg .jpeg .png
                </dd>
            </dl>
            <s:form action="uploadAction" method="POST" enctype="multipart/form-data">
            <table>
                <tr>
                    <td><font color="black">图片主题</font></td>
                    <td><input type="text" name="title"></td>
                </tr>
                <tr>
                    <td><font color="black">选择图片1</font></td>
                    <td><input type="file" name="upload"></td>
                </tr>
                <tr>
                    <td><font color="black">选择图片2</font></td>
                    <td><input type="file" name="upload"></td>
                </tr>
                <tr>
                    <td><font color="black">选择图片3</font></td>
                    <td><input type="file" name="upload"></td>
                </tr>
                <tr><td><s:submit value="上传"/></td></tr>
            </table>
            </s:form>
        </div>
    </div>
</div>
    <%--<s:form action="uploadAction" method="POST" enctype="multipart/form-data">--%>
        <%--<font color="black">文章主题</font><input type="file" name="title">--%>
        <%--<s:textfield label="文章主题" name="title"/>--%>
        <%--<s:file label="选择文件1" name="upload"/>--%>
        <%--<s:file label="选择文件2" name="upload"/>--%>
        <%--<s:file label="选择文件3" name="upload"/>--%>
        <%--<s:submit value="上传"/>--%>
    <%--</s:form>--%>
</body>
</html>