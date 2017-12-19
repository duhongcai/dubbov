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
            pagination:true,
            search:true,
            showRefresh:true,
            contentType:'application/x-www-form-urlencoded',
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
                align:'center',
                formatter:function (sex) {
                    if (sex == 0) return '男';
                    if (sex == 1) return '女';
                    else return '未知';
                }
            },{
                field:'#',
                title:'操作',
                align:'center',
                events:operateEvents,
                formatter:function (value,row,index) {
                    var v = '<a class="update" href="javascript:void(0)">修改</a>' +
                        ' | <a href="javascript:void(0)" class="remove">删除</a>'
                    return v;
                }
            }],
        });
    });
    var operateEvents =  {
        'click .update' : function(event,value,row,index) {
            alert("更新");
        },
        'click .remove':function (e,value,row,index) {
            alert("删除");
        }
    }
</script>
</body>
</html>
