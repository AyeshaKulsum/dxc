<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Count to 10 Example (using JSTL)</title>
</head>
<body>
	<c:forEach var="i" begin="1" end="10" step="1">
	<h1><c:out value="${i}" ></c:out></h1>
		
		<br />
	</c:forEach>

</body>
</html>