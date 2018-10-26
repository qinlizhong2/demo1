<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/25 0025
  Time: 15:29
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
<body>
<div align="center">
<h3 style="color: black">恭喜您，您已通过我司面试，成为我们大家庭中的一员，望即日来本司报道，以下为您作为本司的一些信息希望妥善保存
</h3>
<h3 style="color: black">您的员工账号：${employee1.e_identity}</h3>
<h3 style="color: black">您的登录密码：${employee1.e_pass}</h3>
<h3 style="color: black">您的职位是：${employee1.e_job}</h3>
<h3 style="color: black">您暂定的薪资为：${employee1.e_sal}</h3>
<a href="/return1">返回</a>
</div>
</body>
</html>

