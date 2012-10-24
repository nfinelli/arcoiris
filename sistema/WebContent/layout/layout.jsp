<%@page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="shortcut icon" href="<%=request.getContextPath()%>/layout/favicon.ico">
<link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/css/general.css" />
<link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/css/form.css" />
<link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/css/content.css" />
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.js"></script>

<title><tiles:insertAttribute name="title" ignore="true" /></title>
</head>

<body>

	<div id="wrapper">
		<div id="header">
			<tiles:insertAttribute name="header" />
			<tiles:insertAttribute name="menu" />
		</div>
		<div id="messages">
			<tiles:insertAttribute name="messages" />
		</div>
		<div id="content">
			<tiles:insertAttribute name="body" />
		</div>	
	</div>
	<div id="footer">
		<tiles:insertAttribute name="footer" />
	</div>

</body>
</html>
