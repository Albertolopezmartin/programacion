<%-- 
    Document   : nombre
    Created on : 08-abr-2020, 11:39:47
    Author     : alber
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 3</title>
    </head>
    <body>
        <% request.setCharacterEncoding("UTF-8");%>
        ¡Buenos días 
        <% out.print(request.getParameter("cadenaIntro"));%>
        !
    </body>
</html>
