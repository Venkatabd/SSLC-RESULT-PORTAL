<%@page import="project_dto.Markdto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% List<Markdto>l=(List<Markdto>) request.getAttribute("Marklist"); %>
<table border="">

<tr>
<th>Register_number</th>
<th>Student_name</th>
<th>Date_of_birth</th>
<th>Father_name</th>
<th>Mother_name</th>
<th>Tamil</th>
<th>English</th>
<th>Maths</th>
<th>Science</th>
<th>Social_science</th>
<th>Total_marks</th>
<th>Percentage</th>
</tr>

<% for(Markdto d:l) {%>
<tr>
<td><%=d.getRegister_number()%></td>
<td><%=d.getStudent_name() %></td>
<td><%=d.getDate_of_birth()%></td>
<td><%=d.getFather_name() %></td>
<td><%=d.getMother_name() %></td>
<td><%=d.getTamil()%></td>
<td><%=d.getEnglish() %></td>
<td><%=d.getMaths()%></td>
<td><%=d.getScience()%></td>
<td><%=d.getSocial_science()%></td>
<td><%=d.getTotal_marks() %></td>
<td><%=d.getPercentage()%></td>


</tr>


<%} %>
</table>

</body>
</html>