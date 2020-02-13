<%-- 
    Document   : nombre
    Created on : 13-feb-2020, 8:52:43
    Author     : Alberto López Martín
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario nombre</title>
    </head>
    <body>
        <% request.setCharacterEncoding("UTF-8");%>
                Hola
        <% out.print(request.getParameter("nombreIntro"));%>
    </body>
</html>
