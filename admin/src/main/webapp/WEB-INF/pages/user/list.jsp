<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false"%>
<%
    String contextPath = request.getContextPath();
    String basePath = request.getScheme() +"://" +request.getServerName() +":"+request.getServerPort() +contextPath +"/";
%>
<html>
<head>
    <title>用户列表</title>
    <link rel="stylesheet" href="assets/user/bootstrap.css">
    <link rel="stylesheet" href="assets/user/bootstrap-table.css">
</head>
<body>
<div class="container">
    <%--<table data-toggle="table">--%>
        <%--<thead>--%>
        <%--<tr>--%>
            <%--<th>登录名</th>--%>
            <%--<th>密码</th>--%>
            <%--<th>年龄</th>--%>
        <%--</tr>--%>
        <%--</thead>--%>
        <%--<tbody>--%>
        <%--<c:forEach items="${users}" var="user">--%>
            <%--<tr>--%>
                <%--<c:if test="${not empty user}">--%>
                    <%--<td>${user.userName}</td>--%>
                    <%--<td>${user.password}</td>--%>
                    <%--<td>${user.age}</td>--%>
                <%--</c:if>--%>
            <%--</tr>--%>
        <%--</c:forEach>--%>
        <%--</tbody>--%>
    <%--</table>--%>
    <table id="table"></table>
</div>
</body>
<script type="text/javascript" src="assets/user/jquery.js"/>
<script type="text/javascript" src="assets/user/bootstrap.js"/>
<script type="text/javascript" src="assets/user/bootstrap-table.js"/>
<script type="text/javascript" src="assets/user/bootstrap-table-zh-CN.js"/>
<script type="text/javascript">
    $(document).ready(
        function () {
                $('#table').bootstrapTable({
                    url:'user/',
                    method:'post',
                    height:500,
                    columns:[{
                        field:'userName',
                        title:'登录名',
                        align:'center'
                    },{
                        field:'password',
                        title:'密码',
                        align:'center'
                    },{
                        field:'age',
                        title:'年龄',
                        align:'center'
                    },{
                        field:'sex',
                        title:'性别',
                        align:'center'
                    }],
                })
    })
</script>
</html>
