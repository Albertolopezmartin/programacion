<%-- 
    Document   : index
    Created on : 13-feb-2020, 9:16:35
    Author     : Alberto López Martín
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tema 12 Ejercicios 5,6,7</title>
        <link href="estilos.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <h1>Ejercicios 5,6,7</h1>
        <form method="post" action="conversor.jsp">
            <p>
            Este es un conversor de monedas.<br>
            Seleccione que tipo de moneda quiere convertir: <br>
            <select name="tipoMoneda">
                <option>Euros -> Pesetas</option> 
                <option>Pesetas -> Euros</option>
            </select>
            </p>
            <br>
            Introduce aquí la cantidad a convertir:<br>
                <input type="number" min="0" step="0.01" name="monedaIntro"><br>
            <input type="submit" value="OK">
        </form>
    </body>
</html>
