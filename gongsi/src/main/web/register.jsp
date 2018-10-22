<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/19 0019
  Time: 17:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title>Title</title>
</head>
<style type="text/css">
    body{
        background: url("img/bg.jpg") no-repeat fixed;
        /* set background tensile */
        background-size: 100% 100%;
        -moz-background-size: 100% 100%;
        margin: 0;
        padding: 0;
    }

    #content{
        background-color: rgba(255, 255, 255, 0.95);
        width: 420px;
        height: 300px;
        border: 1px solid #000000;
        border-radius: 6px;
        padding: 10px;
        margin-top: 15%;
        margin-left: auto;
        margin-right: auto;
        display: block;
    }

    .login-header{
        width: 100%;
        height: 48px;
        margin-bottom: 20px;
        border-bottom: 1px solid #dcdcdc;
    }

    .login-header img{
        width: 120px;
        margin-left: auto;
        margin-right: auto;
        display: block;
    }

    .login-input-box{
        margin-top: 12px;
        width: 100%;
        margin-left: auto;
        margin-right: auto;
        display: inline-block;
    }

    .login-input-box input{
        width: 340px;
        height: 32px;
        margin-left: 18px;
        border: 1px solid #dcdcdc;
        border-radius: 4px;
        padding-left: 42px;
    }

    .login-input-box input:hover{
        border: 1px solid #ff7d0a;
    }

    .login-input-box input:after{
        border: 1px solid #ff7d0a;
    }

    .login-input-box .icon{
        width: 24px;
        height: 24px;
        margin: 6px 4px 6px 24px;
        background-color: #ff7d0a;
        display: inline-block;
        position: absolute;
        border-right: 1px solid #dcdcdc;
    }

    .login-input-box .icon.icon-user{
        background: url("img/ren.png");
    }

    .login-input-box .icon.icon-password{
        background: url("img/suo.png");
    }

    .remember-box{
        width: auto;
        height: auto;
        margin-left: 18px;
        margin-top: 12px;
        font-size: 12px;
        color: #6a6765;
    }

    .login-button-box{
        margin-top: 12px;
        width: 100%;
        margin-left: auto;
        margin-right: auto;
        display: inline-block;
    }

    .login-button-box button{
        background-color: #ff7d0a;
        color: #ffffff;
        font-size: 16px;
        width: 386px;
        height: 40px;
        margin-left: 18px;
        border: 1px solid #ff7d0a;
        border-radius: 4px;
    }

    .login-button-box button:hover{
        background-color: #ee7204;
    }

    .login-button-box button:active{
        background-color: #ee7204;
    }

    .logon-box{
        margin-top: 20px;
        text-align: center;
    }

    .logon-box a{
        margin: 30px;
        color: #4a4744;
        font-size: 13px;
        text-decoration: none;
    }

    .logon-box a:hover{
        color: #ff7d0a;
    }

    .logon-box a:active{
        color: #ee7204;
    }
</style>
<body>
<form action="/register" method="post">
    <div id="content">
        <div class="login-header">
            <img src="img/BILI.jpg">
        </div>
        <form>
            <div class="login-input-box">
                <span class="icon icon-user"></span>
                <input type="text" name="u_name" placeholder="Please enter your email/phone">
            </div>
            <div class="login-input-box">
                <span class="icon icon-password"></span>
                <input type="password" name="u_pass" placeholder="Please enter your password">
            </div>
        </form>
        <div class="remember-box">
            <label>
                <input type="checkbox">&nbsp;Remember Me
            </label>
        </div>
        <div class="login-button-box">
            <button type="submit">register</button>
        </div>
        <div class="logon-box">
            <a href="index.jsp">login</a>
        </div>
        <h3 style="color: tomato">${error}</h3>
    </div>
</form>
</body>
</html>

