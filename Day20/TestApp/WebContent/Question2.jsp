<%@page import="java.util.Random"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
<%-- 
<%
String question1="question1";
String radio="radio";
%>
<%=Random %>
<input type="radio" name="<%= question1%>" > --%>
<%@page import="java.util.*" %>


<form action="Question2">
<c:forEach var="row" items="${result.rows}">
<table>

<tr> 

<td><c:out value="${row.questionno}"/></td>
<td><c:out value="${row.question}"/></td>
<td><input type="radio" name="answer2" value="Yes">Yes</td>
<td><input type="radio" name="answer2"  value="No">No</td>
<td><input type="hidden" name="ans2" value="${ row.answer}"></td>
<c:set var="correctAnswer1" value="${row.answer}"></c:set>
</tr>
<tr><td><input type="submit" value="next"></td></tr> 


       
      

</table>
</c:forEach>
</form>





</body>
</html>