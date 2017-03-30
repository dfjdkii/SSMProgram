<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>登录测试框</title>

    <!-- BOOTSTRAP STYLES-->
    <link href="//cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <script src="//cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="//cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <link href="../css/index.css" rel="stylesheet" />
    

</head>
<body style="background-color: #69bad0;">
    <div class="container">
        <div class="row text-center " style="padding-top:100px;">
            <div class="col-md-12">
                <h2 align="center" class="Custom-HeadFont">欢迎使用测试后台系统!</h2>
            </div>
        </div>
         <div class="row ">
               
                <div class="col-md-4 col-md-offset-4 col-sm-6 col-sm-offset-3 col-xs-10 col-xs-offset-1">
                           
                            <div class="panel-body">
                                <form>
                                    <hr />
                                    
                                       <br />
                                     <div class="form-group input-group">
                                            <span class="input-group-addon"><i class="fa fa-tag"  ></i></span>
                                            <input type="text" class="form-control" placeholder="帐号 " />
                                        </div>
                                     <div class="form-group input-group">
                                            <span class="input-group-addon"><i class="fa fa-lock"  ></i></span>
                                            <input type="password" class="form-control"  placeholder="密码" />
                                        </div>
                                    <div class="form-group">
                                            <label class="checkbox-inline">
                                                <input type="checkbox" />记住密码
                                            </label>
                                            <span class="pull-right">
                                                   <a href="index.html" >忘记密码？ </a> 
                                            </span>
                                        </div>
                                     
                                     <div class="Custom-LoginButton">登录</div>
                                    <hr />
                                    <div class="Custom-EdgeDiv">没有帐号 ? <a href="jsp/Test.jsp" >注册 </a></div>                            
                                                                
                                    </form>
                            </div>
                           
                        </div>
                
                
        </div>
    </div>

</body>
</html>
