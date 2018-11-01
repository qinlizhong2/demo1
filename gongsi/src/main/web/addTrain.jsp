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
<form action="/addTrain" method="post">
<div align="center">
    <table  width="400" align="center">
        <tr>
            <td align="center"><p><h2>添加培训</h2></p>
            </td>
            <td >
                <img src="img/BILI.jpg" width="130" height="130" alt="图片" align="right">
            </td>
        </tr>
    </table>
    <table  align="center" width="300" border="1" cellpadding="2">
        <hr width="300" align="left">
        <tr>
            <td>主题：</td>
            <td width="100" height="50"><input  name="tr_topic"></td>
            <td>具体内容：</td>
            <td width="100" height="50"><input  name="tr_content"></td>
            <td>培训地点：</td>
            <td width="100" height="50"><input  name="tr_place"></td>
        </tr>
        <tr>
            <td>开始时间：</td>
            <td width="100" height="50"><input  name="tr_starttime"></td>
            <td>结束时间：</td>
            <td width="100" height="50"><input  name="tr_endtime"></td>

        </tr>
    </table>

    <select id="dep" name="tr_object">
        <option>----请选择培训人员----</option>
        <c:forEach var="item" items="${employeeList}">
            <option value="${item.e_name}">${item.e_name}</option>
        </c:forEach>

    </select>
    <input type="submit" value="添加"><a href="/return2">返回</a>
</div>
</form>
<h3 style="color: tomato">${msg}</h3>
</body>
</html>

