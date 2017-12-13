<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false"%>
<%
    String contextPath = request.getContextPath();
    String basePath = request.getScheme() +"://" +request.getServerName() +":"+request.getServerPort() +contextPath +"/";
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <table border="2">
       <thead>
       <th>登录名</th>
       <th>密码</th>
       <th>年龄</th>
       </thead>
       <tbody>
       <c:forEach items="${users}" var="user">
           <tr>
           <c:if test="${not empty user}">
               <td>${user.userName}</td>
               <td>${user.password}</td>
               <td>${user.age}</td>
           </c:if>
           </tr>
       </c:forEach>
       </tbody>
   </table>
</body>
</html>
