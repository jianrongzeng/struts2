﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>主页</title>
</head>
<body>
	 <a href="userAction!add">添加用户</a>
	 <a href="userAction!update">修改用户</a>
	 <br><br>
<!-- 	 <a href="testAction.action">测试</a> -->
	 <br><br>
	 <form action="userAction" method="post">
	 	用户名：<input type="text" name="userName">
	 	<input type="submit" value="登录">
	 </form>
</body>

</html>