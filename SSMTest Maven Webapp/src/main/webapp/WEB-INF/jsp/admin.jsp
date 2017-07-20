<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head> 
    <title>验证页面</title>
  </head>
  
  <body>
    登录成功 <br>
  <shiro:hasRole name="角色1">
    显示角色1:<shiro:principal></shiro:principal></shiro:hasRole>
  <shiro:hasPermission name="新增">
   拥有新增权限
  </shiro:hasPermission>
  <shiro:hasPermission name="修改">
   拥有修改权限
  </shiro:hasPermission>
  <shiro:hasPermission name="删除">
   拥有删除权限
  </shiro:hasPermission>
  </body>
</html>
