<%--
  Created by IntelliJ IDEA.
  User: superzhaolu
  Date: 2017/10/11
  Time: 19:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<s:i18n name="nuc.sw.I18n.login">
    <html>
    <head>
        <title><s:text name="title"/></title>
        <base href="<%=basePath%>">
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
                <h3 class="text-center text-info">
                    欢迎用户登陆
                </h3>
            </div>
        </div>
        <div class="row clearfix">
            <div class="col-md-6 column">
                <div class="carousel slide" id="carousel-516867">
                    <ol class="carousel-indicators">
                        <li class="active" data-slide-to="0" data-target="#carousel-516867">
                        </li>
                        <li data-slide-to="1" data-target="#carousel-516867">
                        </li>
                        <li data-slide-to="2" data-target="#carousel-516867">
                        </li>
                    </ol>
                    <div class="carousel-inner">
                        <div class="item active">
                            <img alt="" src="lock in.jpeg" />
                            <div class="carousel-caption">
                                <h4>
                                    lock in!!!
                                </h4>
                            </div>
                        </div>
                        <div class="item">
                            <img alt="" src="克莱.jpg" />
                            <div class="carousel-caption">
                                <h4>
                                    克莱-汤普森（Klay Thompson）
                                </h4>
                            </div>
                        </div>
                        <div class="item">
                            <img alt="" src="curry2.jpg" />
                            <div class="carousel-caption">
                                <h4>
                                    斯蒂芬-库里（Stephen Curry）
                                </h4>
                            </div>
                        </div>
                    </div> <a class="left carousel-control" href="#carousel-516867" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a> <a class="right carousel-control" href="#carousel-516867" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
                </div>
            </div>
            <div class="col-md-6 column">

            <s:fielderror name="err"/>
                    <s:form action="loginAction" method="POST">
                        <table>
                            <tr><td><s:text name="user"/></td> <td><input type="text" name="username"></td></tr>
                            <tr><td><s:text name="password"/></td><td><input type="password" name="password"></td></tr>
                            <tr>
                                <td><s:text name="code"/></td><td><input type="text" name="code" maxlength="4" class="chknumber_input"></td>
                            <%--<td><s:textfield key="code" name="code" maxlength="4" class="chknumber_input"/></td>--%>
                            </tr>
                            <tr><td><s:text name="refresh"/></td>
                                <td><img src="randomCode.action" onclick="this.src='randomCode?'+ Math.random()" title="点击图片刷新验证码"/></td>
                            </tr>
                            <s:submit key="submit"/>
                        </table>
                    </s:form>
                    <a href="loginAction?request_locale=zh_CN"><s:text name="language.zh"/></a>
                    <a href="loginAction?request_locale=en_US"><s:text name="language.en"/></a>
                    </body>
                    </html>
            </div>
        </div>
    </div>
    <%--<s:fielderror name="err"></s:fielderror>--%>
    <%--<s:form action="loginAction" method="POST">--%>
        <%--<s:textfield  name="username" key="user"/>--%>
        <%--<s:password name="password" key="password"/>--%>
        <%--<s:submit key="submit"/>--%>
    <%--</s:form>--%>
    <%--<a href="loginAction?request_locale=zh_CN"><s:text name="language.zh"/></a>--%>
    <%--<a href="loginAction?request_locale=en_US"><s:text name="language.en"/></a>--%>
    <%--</body>--%>
    <%--</html>--%>
</s:i18n>
