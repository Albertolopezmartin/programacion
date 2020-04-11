<%-- 
    Document   : index
    Created on : 08-abr-2020, 12:09:13
    Author     : alber
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 5</title>
    </head>
    <body>
        <h1>Conversor de euros a pesetas</h1>
        <form method="post" action="conversor.jsp">
            Euros: <input type="number" min="0" step="0.01" name="euros"><br>
            <input type="submit" value="OK">
        </form>
    </body>
</html>
