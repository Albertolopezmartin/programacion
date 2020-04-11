<%-- 
    Document   : calcular
    Created on : 08-abr-2020, 12:05:14
    Author     : alber
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Media</title>
    </head>
    <body>
        <h1>La media es:</h1>
        <%
            int nota1 = Integer.valueOf(request.getParameter("1nota"));
            int nota2 = Integer.valueOf(request.getParameter("2nota"));
            int nota3 = Integer.valueOf(request.getParameter("3nota"));
            int media = (nota1 + nota2 + nota3)/3;
            out.println(media);
        %>
    </body>
</html>
