<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/22 0022
  Time: 16:02
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
<form action="/updateemp" method="post">
<div>
    <table  width="800" align="center">
        <tr>

            <td align="center"><p><h1>员工个人信息</h1></p>
            </td>
            <td >
                <img src="img/111.jpg" width="130" height="130" alt="图片" align="right">
            </td>
        </tr>
    </table>
    <table  align="center" width="800" border="1" cellpadding="5">

        <hr width="700" align="left">
        <tr>
            <td>姓名：</td>
            <td width="100" height="50"><input name="e_name" value="${employee.e_name}"></td>
            <td>职位：</td>
            <td width="100" height="50"><input name="e_job" value="${employee.e_job}"></td>
            <td>基本工资：</td>
            <td width="100" height="50"><input name="e_sal" value="${employee.e_sal}"></td>
        </tr>
        <tr>
            <td>性别：</td>
            <td width="100" height="50"><input  name="e_sex" value="${employee.e_sex}"></td>
            <td>民族：</td>
            <td width="100" height="50"><input name="e_nation" value="${employee.e_nation}"></td>
            <td>生日：</td>
            <td width="100" height="50"><input  name="e_birthday" value="${employee.e_birthday}"></td>
        </tr>
        <tr>
            <td>电话：</td>
            <td width="100" height="50"><input name="e_phone" value="${employee.e_phone}"></td>
            <td>学历：</td>
            <td width="100" height="50"><input  name="e_education" value="${employee.e_education}"></td>
            <td>地址：</td>
            <td width="100" height="50"><input name="e_address" value="${employee.e_address}"></td>
        </tr>
        <tr>
            <td>电子邮箱：</td>
            <td height="50"><input  name="e_email" value="${employee.e_email}"></td>
        </tr>
        <tr>
            <td>年龄：</td>
            <td height="50"><input  name="e_age" value="${employee.e_age}"></td>
        </tr>
        <tr>
            <td>账号:</td>
            <td height="50"><input  name="e_identity" value="${employee.e_identity}"></td>
        </tr>
    </table>
    <hr width="800" align="center">
    <table align="center" width="800" border="1" cellpadding="5">
        <tr>
            <td>密码</td>
            <td height="50"><input  name="e_pass" value="${employee.e_pass}"></td>
        </tr>
        <tr>
            <td>游客ID：</td>
            <td height="50"><input  name="e_uid" value="${employee.e_uid}"></td>
        </tr>
        <tr>
            <td>职位ID：</td>
            <td height="50"><input  name="e_pid" value="${employee.e_pid}"></td>
        </tr>
        <tr>
            <td>状态：</td>
            <td height="50"><input  name="e_state" value="${employee.e_state}" readonly="readonly"></td>
        </tr>
        <tr>
            <td>入职时间：</td>
            <td height="50"><input  name="e_jointime" value="${employee.e_jointime}" readonly="readonly"></td>
        </tr>

        <tr>
            <td>员工ID：</td>
            <td height="50"><input  name="e_id" value="${employee.e_id}" readonly="readonly"></td>
        </tr>
    </table>
</div>
    <input type="submit" value="修改">
</form>
</body>
</html>

