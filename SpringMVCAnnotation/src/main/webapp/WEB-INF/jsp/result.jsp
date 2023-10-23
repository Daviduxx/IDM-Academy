<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<HTML>
<HEAD><TITLE>
    Calendar: A JSP APPLICATION
</TITLE></HEAD>

<BODY BGCOLOR="red">

<p> prova JSP DecHit </p>


<%

String messaggio = (String)request.getAttribute("messaggio"); 

out.println(messaggio);

request.getAttribute("messaggio"); 

application.getAttribute("contatoreVisite"); 

session.getAttribute("username");

%>

${contatoreVisite}

</BODY>
</HTML>