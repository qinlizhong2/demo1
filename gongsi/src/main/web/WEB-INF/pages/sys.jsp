<%@ page import="com.iotek.model.Recruit" %>
<%@ page import="java.util.List" %>
<%@ page import="com.iotek.model.Resume" %>
<%@ page import="com.iotek.model.Invite" %><%--
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
                        <div class="nav_aBg2"><a href="/showResume1" class="first_A ">查看未读简历</a><span class="first_aBg">填写简历</span></div>
                    </div>
                </li>
                <li class=" active">
                    <div class="nav_aBg">
                        <div class="nav_aBg2"><a href="/showResume2" class="first_A ">查看已读简历</a><span class="first_aBg">我的简历</span></div>
                    </div>
                </li>
                <li class=" active">
                    <div class="nav_aBg">
                        <div class="nav_aBg2"><a href="/showInvite1" class="first_A ">已同意面试人员</a><span class="first_aBg">已同意面试人员</span></div>
                    </div>
                </li>
                <li class=" active">
                    <div class="nav_aBg">
                        <div class="nav_aBg2"><a href="/toaddpos" class="first_A ">添加部门</a><span class="first_aBg">添加部门</span></div>
                    </div>
                </li>

            </ul>
        </div>




    </div>
</div>

<div align="center">
    <%
        List<Invite> inviteList = (List<Invite>) request.getAttribute("inviteList");
        if (inviteList!=null){
    %>
    <table border="1" cellspacing="0" >
        <tr>
            <td>面试编号</td>
            <td>用户ID</td>
            <td>招聘ID</td>
            <td>简历ID</td>
            <td>发送offer</td>
        </tr>
        <%
            for (int i = 0; i < inviteList.size(); i++) {
        %>
        <tr>
            <td><%=inviteList.get(i).getI_id()%></td>
            <td><%=inviteList.get(i).getI_uid()%></td>
            <td><%=inviteList.get(i).getI_rid()%></td>
            <td><%=inviteList.get(i).getI_reid()%></td>
            <td><a href="/sendoffer?id=<%=inviteList.get(i).getI_id()%>"><input type="button" value="发送offer"></a> </td>
        </tr>
        <%
            }
        %>
    </table>
    <%
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
        <td>工作年限</td>
        <td>学历</td>
        <td>专业</td>
        <td>毕业学校</td>
        <td>目标工作</td>
        <td>查看详细</td>
    </tr>
    <%
        for (int i = 0; i < resumeList.size(); i++) {
    %>
    <tr>
        <td><%=resumeList.get(i).getR_id()%></td>
        <td><%=resumeList.get(i).getR_name()%></td>
        <td><%=resumeList.get(i).getR_workyear()%></td>
        <td><%=resumeList.get(i).getR_education()%></td>
        <td><%=resumeList.get(i).getR_professinal()%></td>
        <td><%=resumeList.get(i).getR_school()%></td>
        <td><%=resumeList.get(i).getR_target()%></td>
        <td><a href="/toSysresume?reid=<%=resumeList.get(i).getR_id()%>"><input type="button" value="查看简历详情"></a> </td>
    </tr>
    <%
        }
    %>
</table>
<%
    }
%>


    <div align="center">
        <%
            List<Resume> resumeList1 = (List<Resume>) request.getAttribute("resumeList1");
            if (resumeList1!=null){
        %>
        <table border="1" cellspacing="0" align="center">
            <tr>
                <td>简历号</td>
                <td>姓名</td>
                <td>工作年限</td>
                <td>学历</td>
                <td>专业</td>
                <td>毕业学校</td>
                <td>目标工作</td>
                <td>查看详细</td>
            </tr>
            <%
                for (int i = 0; i < resumeList1.size(); i++) {
            %>
            <tr>
                <td><%=resumeList1.get(i).getR_id()%></td>
                <td><%=resumeList1.get(i).getR_name()%></td>
                <td><%=resumeList1.get(i).getR_workyear()%></td>
                <td><%=resumeList1.get(i).getR_education()%></td>
                <td><%=resumeList1.get(i).getR_professinal()%></td>
                <td><%=resumeList1.get(i).getR_school()%></td>
                <td><%=resumeList1.get(i).getR_target()%></td>
                <td><a href="/toSysresume?reid=<%=resumeList1.get(i).getR_id()%>"><input type="button" value="查看简历详情"></a> </td>
            </tr>
            <%
                }
            %>
        </table>
        <%
            }
        %>
        <h3 style="color: tomato">${msg}</h3>
</div>
</body>
</html>
