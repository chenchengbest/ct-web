<%@ page language="java" contentType="text/html; charset=UTF-8"  isELIgnored="false"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en" class="no-js">
<head>
<meta charset="utf-8">
<title>漂亮支持响应式多终端适配的网站登录页面模板 - JS代码网</title>
<meta name="keywords" content="网站模板,手机网站模板,手机登录页面,登录页面HTML,免费网站模板下载" />
<meta name="description" content="JS代码网提供高质量手机网站模板下载" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<!-- CSS -->
<link rel="stylesheet" href="${ctx}/css/reset.css">
<link rel="stylesheet" href="${ctx}/css/supersized.css">
<link rel="stylesheet" href="${ctx}/css/style.css">

</head>

<body>
	<div class="page-container">
		<h1>登录</h1>
		<input type="text" id="uname" name="username" class="username" placeholder="用户名">
		<input type="password" id="pwd" name="password" class="password"
			placeholder="密码">
			<input type="button" id="btnSubmit" onclick="$.login.commit()" value="提交"/>
		<div class="error">
			<span>+</span>
		</div>
		<div class="connect">
			<p>Or connect with:</p>
			<p>
				<a class="facebook" href=""></a> <a class="twitter" href=""></a>
			</p>
		</div>
	</div>
</body>
<!-- Javascript -->
<script src="${ctx}/js/jquery-1.8.2.min.js"></script>
<script src="${ctx}/js/supersized.3.2.7.min.js"></script>
<script src="${ctx}/js/supersized-init.js"></script>
<script src="${ctx}/js/scripts.js"></script>
<script src="${ctx}/js/common/common.js"></script>
<script type="text/javascript">
$(function() {
	$.login={};
	$.extend($.login,{
		commit:function(){
			var uname=$("#uname").val();
			var pwd=$('#pwd').val();
			$.common.ajaxPost({
				url:"login",
				data:{
					uname:uname,
					pwd:pwd
				},
				callBack:function(data){
					console.log("success");
				},
				errorCallBack:function(data){
					console.log("false");
				}
			});
			 
		}
	});
});
</script>
</html>
