<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title></title>
    
  </head>
  
  <body>
  <script type="text/javascript">
    alert("<%=request.getAttribute("error")%>");
    window.location.href="../login.html";
  </script>
  </body>
</html>
