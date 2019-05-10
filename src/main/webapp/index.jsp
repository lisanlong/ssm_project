<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>登录</title>

</head>
<body>
<h2>登录</h2>
<div>
    <!-- 如果要实现登录操作，需要在 UserController 中添加相应的方法  -->
    <form action="${pageContext.request.contextPath }/user/sign" method="post">
        <input type="text" name="username" >
        <input type="text" name="password" >
        <input type="submit" value="登录">
    </form>
</div>

</body>
</html>
