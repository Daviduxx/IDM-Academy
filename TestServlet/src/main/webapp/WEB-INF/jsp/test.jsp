<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ESERCIZIO SUL SERVLET E JSP</title>
</head>
<body>

<img src="https://media.licdn.com/dms/image/C4E0BAQHCZByFk46j-g/company-logo_200_200/0/1519870225999?e=1706140800&v=beta&t=xdpakhTdZTttW5usFRYp7FvXQvc93R8oi36qjtskFCs" width="100" height="100">

<h1 style="color: blue">ESERCIZIO SUL SERVLET E JSP</h1>


<c:forEach var="entry" items="${headers}">
    <li><b>${entry.key}</b>: ${entry.value}</li>
</c:forEach>

</body>
</html>