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
        <title>Ejercicio 7</title>
        <link href="estilos.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <h1>Conversor de moneda</h1>
        <form class="dinero" method="post" action="conversor.jsp">
            Cantidad: <input type="number" min="0" step="0.01" name="cantidad"><br>
            <input type="radio" name="cambio" value="eurosEnPesetas" checked="checked"> euros -> pesetas<br>
            <input type="radio" name="cambio" value="pesetasEnEuros"> pesetas -> euros<br>
            <input type="submit" value="OK">
        </form>
    </body>
</html>
