<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>

<%@ page import="com.corso.bean.*"%>

<HTML>
<HEAD><TITLE>
    Calendar: A JSP APPLICATION
</TITLE></HEAD>

<BODY BGCOLOR="red">

<p> prova JSP DecHit </p>



<%

Rettangolo rettangolo = (Rettangolo)request.getAttribute("rettangolo"); 

out.println("jsp: " + rettangolo.toString());

%>

</BODY>
</HTML>