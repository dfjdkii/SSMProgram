<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>正在回到首页</title>
    
  </head>
  
  <script type="text/javascript">
     var errormsg = <%=request.getAttribute("error") %>
     alert(errormsg);
  
  
  
  </script>
  <body>
  <%-- ${error} --%>
     <%
     /* String error=request.getParameter("error"); */
     /* response.sendRedirect("../login.html"); */
     request.getRequestDispatcher("../../login.html").forward(request, response);
      %> 
  </body>
</html>
