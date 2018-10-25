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
<form action="/addinvite?reid=${resume1.r_id}" method="post">
<div>
    <table  width="800" align="center">
        <tr>

            <td align="center"><p><h1>游客简历</h1></p>
            </td>
            <td >
                <img src="img/BILI.jpg" width="130" height="130" alt="图片" align="right">
            </td>
        </tr>
    </table>
    <table  align="center" width="800" border="1" cellpadding="5">

        <hr width="700" align="left">
        <tr>
            <td>姓名：</td>
            <td width="100" height="50">${resume1.r_name}</td>
            <td>性别：</td>
            <td width="100" height="50">${resume1.r_sex}</td>
            <td>民族：</td>
            <td width="100" height="50">${resume1.r_nation}</td>
        </tr>
        <tr>
            <td>出生年月：</td>
            <td width="100" height="50">${resume1.r_birthday}</td>

            <td>联系电话：</td>
            <td width="100" height="50">${resume1.r_phone}</td>
            <td>工作经验：</td>
            <td width="100" height="50">${resume1.r_workyear}</td>
        </tr>
        <tr>
            <td>学历：</td>
            <td width="100" height="50">${resume1.r_education}</td>

            <td>专业：</td>
            <td width="100" height="50">${resume1.r_professinal}</td>
            <td>毕业学校：</td>
            <td width="100" height="50">${resume1.r_school}</td>
        </tr>
        <tr>
            <td>住址：</td>
            <td height="50">${resume1.r_address}</td>
        </tr>
        <tr>
            <td>电子邮箱：</td>
            <td height="50">${resume1.r_email}</td>
        </tr>
        <tr>
            <td>爱好:</td>
            <td height="50">${resume1.r_hobbies}</td>
        </tr>
    </table>
    <hr width="800" align="center">
    <table align="center" width="800" border="1" cellpadding="5">
        <tr>
            <td>目标职位</td>
            <td height="50">${resume1.r_target}</td>
        </tr>
        <tr>
            <td>目标行业：</td>
            <td height="50">${resume1.r_rid}</td>
        </tr>
    </table>
    <input type="submit" value="发送面试">
</div>

</form>
</body>
</html>

