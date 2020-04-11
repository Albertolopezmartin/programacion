<%-- 
    Document   : index
    Created on : 10-mar-2020, 8:28:25
    Author     : Alberto López Martín
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tema 12 Ejercicio 9</title>
        <link href="estilos.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <h1>Ejercicio 9</h1>
        <h2>Dibujar una piramide</h2>
        <form method="get" action="piramide.jsp">
            Escribe la altura de la piramide: </br><input type="number" min="1" max="10" name="altura"></br></br>
        <input type="submit" value="OK">
        </form>
    </body>
</html>
