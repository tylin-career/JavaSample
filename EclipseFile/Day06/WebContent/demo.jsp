<%@page import="tw.com.lccnet.demo.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% 
	Person pp = new Person();
	pp.setName("HeHexD");
%>

網頁頁面輸出方式有兩種 : out.write(), %=

<%
	out.write(pp.getName());
%>

<%=pp.getName()%>


<% 
	String init = application.getInitParameter("jdbc");
	out.write(init);
%>



</body>
</html>