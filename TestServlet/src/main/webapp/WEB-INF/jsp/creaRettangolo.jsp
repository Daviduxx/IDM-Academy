<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>

${area}

<h2>  inserisci il tuo rettangolo: 
</h2>


<form action="http://localhost:8081/Web01/rettangolo/area" method="GET">
  <input type="text" id="base" name="base" value=""><br>
  <input type="text" id="altezza" name="altezza" value=""><br><br>
  <input type="submit" value="Submit">
</form> 

<p>If you click the "Submit" button, the form-data will be sent to a page called "/action_page.php".</p>

</body>
</html>
