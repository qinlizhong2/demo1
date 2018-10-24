<%@ page import="com.iotek.model.Recruit" %>
<%@ page import="java.util.List" %>
<%@ page import="com.iotek.model.Resume" %><%--
  Created by IntelliJ IDEA.
  User: 11929
  Date: 2018/10/18
  Time: 11:16
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
    <title>江西科益-致力打造业内最领先的IT解决方案提供商</title>
    <link href="../../css/main.css" rel="stylesheet" type="text/css"/>
    <link href="../../css/common.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div class="main">
<div class="headerWrap">
    <div class="headerWrap2">
        <div class="headerInner">
            <div class="logo">  <img src="../../img/logo8.png"  alt="江西科益-致力打造业内最领先的IT解决方案提供商"/> </div>
            <div class="headRight">
                <div></div>
                <div class="headTopLink">
                    <span><a href="http://mail.jx-keyi.com/" target="_blank">企业邮箱</a></span> |
                    <span><a href="http://oa.jx-keyi.com" target="_blank">OA系统</a></span> |
                    <span><a href="/yuangong/login.html" target="_blank">员工登录</a></span>  |
                    <span><a href="/itsm/login.html" target="_blank">ITSM平台</a></span>
                </div>
                <div class="topTel"><img src="../../img/hotTel.jpg"  alt="客服热线"/></div>
            </div>
        </div>
    </div>
</div>

    <div class="navWrap">
        <div class="navInner">
            <ul>
                <li class=" active">
                    <div class="nav_aBg">
                        <div class="nav_aBg2"><a href="../../addDep.jsp" class="first_A ">添加部门</a><span class="first_aBg">添加部门</span></div>
                    </div>
                </li>

                <li class=" active">
                    <div class="nav_aBg">
                        <div class="nav_aBg2"><a href="../../addResume.jsp" class="first_A ">填写简历</a><span class="first_aBg">填写简历</span></div>
                    </div>
                </li>
                <li class=" active">
                    <div class="nav_aBg">
                        <div class="nav_aBg2"><a href="/Showresume" class="first_A ">我的简历</a><span class="first_aBg">我的简历</span></div>
                    </div>
                </li>


            </ul>
        </div>




    </div>
</div>



<div align="center">
<%
    List<Recruit> recruitList = (List<Recruit>) request.getAttribute("recruitList");
    if (recruitList!=null){
%>
<table border="1" cellspacing="0" >
    <tr>
        <td>职位名称</td>
        <td>学历要求</td>
        <td>薪资</td>
        <td>工作年限</td>
        <td>投递简历</td>
    </tr>
    <%
        for (int i = 0; i < recruitList.size(); i++) {
    %>
    <tr>
        <td><%=recruitList.get(i).getZ_name()%></td>
        <td><%=recruitList.get(i).getZ_education()%></td>
        <td><%=recruitList.get(i).getZ_salary()%></td>
        <td><%=recruitList.get(i).getZ_year()%></td>
        <td><a href="/"><input type="button" value="投递简历"></a> </td>
    </tr>
    <%
        }
    %>
</table>
<%
    }
%>

<%
    if(request.getAttribute("totalPages")!=null){
        int totalPages = (int) request.getAttribute("totalPages");
        if (totalPages!=0){
            for (int i = 0; i <totalPages; i++) {
%>
<a href="/showRecruit?currentPage=<%=i+1%>"><%=i+1%></a>
<%
            }
        }
    }
%>
</div>


<div align="center">
<%
    List<Resume> resumeList = (List<Resume>) request.getAttribute("resumeList");
    if (resumeList!=null){
%>
<table border="1" cellspacing="0" align="center">
    <tr>
        <td>简历号</td>
        <td>姓名</td>
        <td>性别</td>
        <td>民族</td>
        <td>生日</td>
        <td>电话</td>
        <td>工作年限</td>
        <td>学历</td>
        <td>专业</td>
        <td>毕业学校</td>
        <td>住址</td>
        <td>邮箱</td>
        <td>爱好</td>
        <td>目标工作</td>
        <td>更改简历</td>
    </tr>
    <%
        for (int i = 0; i < resumeList.size(); i++) {
    %>
    <tr>
        <td><%=resumeList.get(i).getR_id()%></td>
        <td><%=resumeList.get(i).getR_name()%></td>
        <td><%=resumeList.get(i).getR_sex()%></td>
        <td><%=resumeList.get(i).getR_nation()%></td>
        <td><%=resumeList.get(i).getR_birthday()%></td>
        <td><%=resumeList.get(i).getR_phone()%></td>
        <td><%=resumeList.get(i).getR_workyear()%></td>
        <td><%=resumeList.get(i).getR_education()%></td>
        <td><%=resumeList.get(i).getR_professinal()%></td>
        <td><%=resumeList.get(i).getR_school()%></td>
        <td><%=resumeList.get(i).getR_address()%></td>
        <td><%=resumeList.get(i).getR_email()%></td>
        <td><%=resumeList.get(i).getR_hobbies()%></td>
        <td><%=resumeList.get(i).getR_target()%></td>
        <td><a href="/toupdateresume?id=<%=resumeList.get(i).getR_id()%>"><input type="button" value="更改简历"></a> </td>
    </tr>
    <%
        }
    %>
</table>
<%
    }
%>
</div>
</body>
</html>
