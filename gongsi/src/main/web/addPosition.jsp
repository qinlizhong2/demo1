<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<form action="/savepos" method="post">
<div align="center">
    <table  width="400" align="center">
        <tr>
            <td align="center"><p><h2>添加职位</h2></p>
            </td>
            <td >
                <img src="img/BILI.jpg" width="130" height="130" alt="图片" align="right">
            </td>
        </tr>
    </table>
    <table  align="center" width="300" border="1" cellpadding="2">
        <hr width="300" align="left">
        <tr>
            <td>职位名称：</td>
            <td width="100" height="50"><input  name="p_name"></td>
        </tr>
    </table>

    <select id="dep" name="p_did">
        <option>----请选择部门----</option>
        <c:forEach var="item" items="${departmentList}">
            <option value="${item.d_id}">${item.d_name}</option>
        </c:forEach>

    </select>
    <input type="submit" value="添加"><a href="/return2">返回</a>
</div>
</form>
<h3 style="color: tomato">${msg}</h3>
</body>
</html>

