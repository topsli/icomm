<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<% String basePath = request.getScheme()+"://" + request.getServerName()+":"+request.getServerPort();%>
<!DOCTYPE html>
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=no">
	<meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="format-detection" content="telephone=no">
	<meta http-equiv="Expires" CONTENT="-1">           
	<meta http-equiv="Cache-Control" CONTENT="no-cache">           
	<meta http-equiv="Pragma" CONTENT="no-cache">
	<link rel="stylesheet" href="/static/modules/wechat/css/common.css">
	<link rel="stylesheet" href="/static/modules/wechat/css/elderActivity.css">
	<script src="/static/js/jquery-1.8.3.min.js"></script>
	<script src="/static/modules/wechat/js/elderActivity.js"></script>
	<title>老人最新动态</title>
	<script type="text/javascript">
		var activity = JSON.parse('${activityRecord}'); 
	</script>
</head>

<body>
<h3 class="title"><a href="#" class="back"></a><label>老人最新动态</label></h3>  
<div class="content">
	<div class="formcontent">
		<div  class="row" >
		<div class="wrapinput">
				<label>姓名</label>
				<label >张三</label>
		</div>
		<p class="error">&nbsp;</p>
	   </div>
		
     
		<div class="row">
			<div class="wrapinput">
				<label >项目</label>
				<label >次数</label>
				<label>日期</label>
			</div>
		</div>
     
     	<div class="row">
			<div class="dateValue">
				<label >刷牙</label>
				<label>3</label>
				<label class="withLabe2">2015-05-09</label>
			</div>
		</div>
     	<div class="row">
			<div class="dateValue">
				<label >刷牙</label>
				<label>3</label>
				<label class="withLabe2">2015-05-09</label>
			</div>
		</div>
		<div class="row">
			<div class="dateValue">
				<label >刷牙</label>
				<label>3</label>
				<label class="withLabe2">2015-05-09</label>
			</div>
		</div>
		<div class="row">
			<div class="dateValue">
				<label >刷牙</label>
				<label>3</label>
				<label class="withLabe2">2015-05-09</label>
			</div>
		</div>
        <a class="btn">返回</a>
	</div>
 	<p>${activityRecord}</p>
</div>

</body>
</html>
