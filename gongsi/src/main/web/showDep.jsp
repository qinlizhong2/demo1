<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/26 0026
  Time: 14:59
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
    <script src="/js/jquery1.7.js"></script>
    <script type="text/javascript">

            var  lists=[];
            <c:forEach var="i" items="${departmentList}" >
            lists.push('${i.d_name}');
            </c:forEach>


                <c:forEach var="i" items="${departmentList}">
                lists["${i.d_name}"]=[];

                <c:forEach var="j" items="${positionList}">
                <c:if test="${j.p_did==i.d_id}">
                lists["${i.d_name}"].push('${j.p_name}');
                </c:if>
                </c:forEach>
                </c:forEach>

            <c:forEach var="i" items="${departmentList}">
            <c:forEach var="j" items="${positionList}">
            <c:forEach var="z" items="${employeeList}">

            <c:if test="${j.p_did==i.d_id}">
            lists["${i.d_name}"]["${j.p_name}"]=[];
            <c:if test="${z.e_pid==j.p_id}">
            lists["${i.d_name}"]["${j.p_name}"].push('${z.e_name}');
            </c:if>
            </c:if>
            </c:forEach>
            </c:forEach>
            </c:forEach>


            $(function(){
                var pp='<option value="请选择部门">请选择部门</option>';
                $("#province").append(pp);
                for (var provinceMe in lists){
                    $("#province").append('<option value='+provinceMe+'>'+provinceMe+'</option>');
                }
            })
            function provinceSelect(cc){
                $("#city").empty();
                $("#region").empty();
                var cityMe = '<option value="请选择职位">请选择职位</option>';
                $("#city").append(cityMe);
                var provinceMe = $(cc).val();
                for (var i=0;i<lists[provinceMe].length;i++){
                    $("#city").append('<option value='+lists[provinceMe][i]+'>'+lists[provinceMe][i]+'</option>');
                }
            }
            function citySelect(region){
                $("#region").empty();
                var regionMe = '<option value="请选择员工">请选择员工</option>';
                $("#region").append(regionMe);
                var provinceHe =$("#province").val();
                var cityHe =$(region).val();
                for (var i =0;i<lists[provinceHe][cityHe].length;i++){
                    $("#region").append('<option value='+lists[provinceHe][cityHe][i]+'>'+lists[provinceHe][cityHe][i]+'</option>');

                }
            }
    </script>
</head>
<body onload="init()">

<select id="province" onchange="provinceSelect(this);"></select>
<select id="city" onchange="citySelect(this);"></select>
<select id="region"></select>

</body>
</html>

