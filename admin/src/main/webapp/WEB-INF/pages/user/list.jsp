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
    <link rel="stylesheet" href="assets/user/bootstrap.css"/>
    <link rel="stylesheet" href="assets/user/bootstrap-table.css"/>
</head>
<body>
<div class="container">
    <table id="table" class="table-striped">
    </table>
</div>
<script type="text/javascript" src="assets/user/jquery.js"></script>
<script type="text/javascript" src="assets/user/bootstrap.js"></script>
<script type="text/javascript" src="assets/user/bootstrap-table.js"></script>
<script type="text/javascript" src="assets/user/bootstrap-table-zh-CN.js"></script>
<script type="text/javascript">
    $(document).ready(function () {
        var table = $('#table').bootstrapTable({
            url:'user/getUser',
            method:'post',
            type:'json',
            height:500,
            sidePagination : 'server',
            contentType:'application/x-www-form-urlencoded',
            columns:[{
                field:'userName',
                title:'登录名'
            },{
                field:'password',
                title:'密码'
            },{
                field:'age',
                title:'年龄'
            },{
                field:'sex',
                title:'性别'
            }],
        })
    })
</script>
</body>
</html>
