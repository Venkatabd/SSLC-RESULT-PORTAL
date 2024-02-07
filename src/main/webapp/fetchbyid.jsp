<%@page import="project_dto.Markdto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    
</head>
<body>
  
  <% Markdto dto =(Markdto)request.getAttribute("Result"); %>
	
	<nav style="height: 75px;width: 100%; background-color: orange;">
       <center>
        <p style="font-size: 5px; color: green;">Space</p>
        <span><b style="font-size: 22px; color: aliceblue; font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;">Karnataka School Examination and Assessment Board</b></span><br>
        <p style="font-size: 5px; color: orange;">Space</p>
        <span style="font-size: 16px; color: aliceblue; font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;">(SSLC Main Examination Results - 2023)</span>
       </center>
    </nav>
    
    <div style="height: 70px; width: 100%;">
    	<div style="display: flex; justify-content: space-between;">
    		<span><b>Register_number : <%=dto.getRegister_number() %></b></span>
    		<span><b>Student_name : <%=dto.getStudent_name() %></b></span>
    		<span><b>Date_of_Birth : <%=dto.getDate_of_birth() %></b></span>
    	</div>
    	<div style="display: flex; justify-content: space-between;">
    		<span><b>Father name : <%=dto.getFather_name() %></b></span>
    		<span><b>Mother name : <%=dto.getMother_name() %></b></span>
    	</div>
    </div>
    
    <div>
    	<center>
    		<table border="">
    			<tr>
    				<th>Subject</th>
    				<th>Marks</th>
    			</tr>
    			<tr>
    				<td>Tamil</td>
    				<td><%=dto.getTamil()%></td>
    			</tr>
    			<tr>
    				<td>English</td>
    				<td><%=dto.getEnglish() %></td>
    			</tr>
    			<tr>
    				<td>Maths</td>
    				<td><%=dto.getMaths() %></td>
    			</tr>
    			<tr>
    				<td>Science</td>
    				<td><%=dto.getScience() %></td>
    			</tr>
    			<tr>
    				<td>Social_science</td>
    				<td><%=dto.getSocial_science() %></td>
    			</tr>
    			
    		</table>
    		
   			<span><b>Total marks : <%=dto.getTotal_marks() %></b></span><br>
   			<span><b>Percentage : <%=dto.getPercentage() %></b></span><br>
   			
   			<button type="button"><a href="results.html">Home</a></button>
   			<button type="reset">Print</button>
    	</center>
    </div>
    
   
    
  
</body>
</html>

    