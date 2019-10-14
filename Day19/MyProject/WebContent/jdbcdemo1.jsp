<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<sql:setDataSource var="dataSource" driver="com.mysql.jdbc.Driver"
url="jdbc:mysql://localhost:3306/dxc"
scope="session" user="root" password="root" />

<html>
  <head>
    <title>Query Example</title>
  </head>

  <body>

<sql:query var = "students" dataSource="${dataSource}">
select Roll,Name,Address,Marks from Student
</sql:query>

<table border=1>
<c:forEach var="row" items="${students.rows}">
<tr>
<td><c:out value="${row.Roll}"/></td>
<td><c:out value="${row.Name}"/></td>
<td><c:out value="${row.Address}"/></td>
<td><c:out value="${row.Marks}"/></td>

</tr>
</c:forEach>
</table>


  </body>
</html>


           
       