<%-- 
    Document   : index
    Created on : 11-abr-2020, 11:08:32
    Author     : alber
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 8</title>
        <link href="estilos.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h1>Tabla de multiplicar</h1>
        <form class="tabla" method="post" action="tabla.jsp">
            Introduzca un número: <input type="number" name="numero">
            <input type="submit" value="OK">
        </form>
    </body>
</html>
