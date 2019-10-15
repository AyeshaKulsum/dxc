<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/sql_rt" prefix="sql" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Question 3</title>
</head>

<body>
<sql:setDataSource var = "snapshot" driver = "com.mysql.jdbc.Driver"
         url = "jdbc:mysql://localhost:3306/DXC"
         user = "root"  password = "root"/>

<%double randomNumber =  Math.random()*10;
  int random = (int) randomNumber;
  if(random == 11)
    {random = 10;}
  if(random == 0)
	  {random = 1;}
%>
  
<sql:query dataSource = "${snapshot}" var = "result">
            SELECT * from test where questionno = <%=random %>;
         </sql:query>

<form action="Question1">
<c:forEach var="row" items="${result.rows}">
<table>

<tr> 

<td><c:out value="${row.questionno}"/></td>
<td><c:out value="${row.question}"/></td>
<td><input type="radio" name="answer3" value="Yes">Yes</td>
<td><input type="radio" name="answer3"  value="No">No</td>
<td><input type="hidden" name="ans3" value="${ row.answer}"></td>
<c:set var="correctAnswer1" value="${row.answer}"></c:set>
</tr>
<tr><td><input type="submit" value="next"></td></tr> 


       
      

</table>
</c:forEach>
</form>


</body>
</html>