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

            var  arr=[];
            <c:forEach var="i" items="${positionList}" >
             arr.push('${i.p_name}');
            </c:forEach>
                <c:forEach var="i" items="${positionList}">
                arr["${i.p_name}"]=[];

                <c:forEach var="j" items="${employeeList}">
                <c:if test="${j.e_pid==i.p_id}">
                arr["${i.p_name}"].push('${j.e_name}');
                </c:if>
                </c:forEach>
                </c:forEach>

            function init() {
                createOption(arr,"province");
                createOption(arr[arr[0]],"city");
            }

            function createOption(array,id) {
                //清空列表
                document.getElementById(id).options.length=0;
                for (var i=0;i<array.length;i++){
                    /*  var option = new Option();
                      option.text=array[i];
                      option.value=array[i];
                      document.getElementById(id).options.add(option);*/
                    var option = document.createElement("option");
                    option.text=array[i];
                    option.value=array[i];
                    document.getElementById(id).appendChild(option);

                }
            }
            function changeCity(province) {
                createOption(arr[province],"city");
            }
    </script>
</head>
<body onload="init()">

职位：<select id="province" onchange="changeCity(this.value)"></select>
员工：<select id="city"></select>

</body>
</html>

