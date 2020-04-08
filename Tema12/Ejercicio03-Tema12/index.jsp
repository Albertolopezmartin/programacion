<%-- 
    Document   : index
    Created on : 08-abr-2020, 11:37:19
    Author     : alber
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejericio 3</title>
    </head>
    <body>
        <h1>Pasa tu nombre para recibir un saludo</h1>
        <form method="post" action="nombre.jsp">
            Introduce aquí tu nombre:
            <input type="text" name="cadenaIntro">
            <input type="submit" value="OK">
        </form>
    </body>
</html>
