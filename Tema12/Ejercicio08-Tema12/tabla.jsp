<%-- 
    Document   : tabla
    Created on : 11-abr-2020, 11:10:51
    Author     : alber
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tabla multiplicar</title>
        <link href="estilos.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <% int n = Integer.parseInt(request.getParameter("numero")); %>
        <h1>Tabla de multiplicar</h1>
        <table>
            <%
                for(int i = 0; i < 11; i++) {
                    out.println("<tr><td>" + i + " x " + n + "</td><td> = </td><td>" + i * n + "</td></tr>");
                }
            %>
        </table>
    </body>
</html>