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
        <title>Ejercicio 6</title>
    </head>
    <body>
        <h1>Conversor de pesetas a euros</h1>
        <form method="post" action="conversor.jsp">
            Pesetas: <input type="number" min="0" step="0.01" name="Pesetas"><br>
            <input type="submit" value="OK">
        </form>
    </body>
</html>
