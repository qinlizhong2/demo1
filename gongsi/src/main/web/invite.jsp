<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/24 0024
  Time: 17:42
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
    <form action="/passInvite?id=${invite1.i_id}" method="post">
<h3 style="color: black">经过我司HR的初步筛选，认为你与我们的职位要求很匹配，现诚挚邀请你来我司面试。
    </h3>
<h3 style="color: black">请你准时出席，如时间上有变化也请尽快与我们联系。</h3>
<h3 style="color: black">BILIBILI诚邀您的加入</h3>
<h3 style="color: black">面试时间:明天上午10:00</h3>
<h3 style="color: black">面试地点：上海市浦东新区五星路706弄万科御河企业公馆17号楼</h3>
<h3 style="color: black">联 系 人：乔小姐</h3>
<h3 style="color: black">联系方式：021-50903666</h3>
        <input type="submit" value="同意">
    </form>
</div>
</body>
</html>

