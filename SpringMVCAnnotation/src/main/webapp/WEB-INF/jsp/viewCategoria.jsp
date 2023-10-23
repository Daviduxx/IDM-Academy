<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>	
<%@ page import="com.corso.bean.*"%>

<HTML>
<HEAD><TITLE>
   
</TITLE></HEAD>

<BODY BGCOLOR="red">
	Esempio di JSP 
	tutte le categorie: 
	${lista}
	<br>
	
	${primo} 
 <form:form method="GET" 
          action="add" modelAttribute="categoria">
             <table>
                <tr>
                    <td><form:label path="nome">Nome</form:label></td>
                    <td><form:input path="nome"/></td>
                </tr>
                <tr>
                    <td><form:label path="descrizione">Descrizione</form:label></td>
                    <td><form:input path="descrizione"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
</BODY>
</HTML>