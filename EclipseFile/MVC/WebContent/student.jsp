<%@page import="tw.com.lccnet.web.entity.Student"%>
<%@page import="java.util.List"%>
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
	List<Student> stus=(List<Student>)request.getAttribute("students");
%>
<table border="1" cellpadding="10" cellspacing="0">
	<tr>
		<th>ID</th>
		<th>NAME</th>
		<th>AGE</th>
		<th>PASS</th>
		<th>EMAIL</th>
	</tr>
		<%
		for(Student student:stus){
		%>
		<tr>
			<td><%=student.getStu_id() %></td>
			<td><%=student.getStu_name() %></td>
			<td><%=student.getStu_age() %></td>
			<td><%=student.getStu_pass() %></td>
			<td><%=student.getStu_email() %></td>
		</tr>
			
		<%	
		}
	%>

</table>


</body>
</html>