<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>  
  <head>  
    <title>测试</title>  
  </head>  
    
  <body>  
  <div align="center"> 
      <c:if test="${user.name!=null}">展示测试用户的名称：${user.name}</c:if>
      <c:if test="${list!=null}">展示所有测试用户信息：${list}</c:if></div>
  
      <br />
      <div align="center"><a href="../index.jsp">返回首页</a></div>
  </body>  
</html>  
