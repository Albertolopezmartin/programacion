<%-- 
    Document   : media
    Created on : 13-feb-2020, 9:02:31
    Author     : Alberto López Martín
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario media</title>
    </head>
    <body>
        <%
          double primeraNota = Double.valueOf(request.getParameter("notaIntro1"));
          double segundaNota = Double.valueOf(request.getParameter("notaIntro2"));
          double terceraNota = Double.valueOf(request.getParameter("notaIntro3"));
          double media = (primeraNota + segundaNota + terceraNota)/3;
          DecimalFormat dosDecimales = new DecimalFormat("0.00");
          out.println("La media de las tres notas es: " + dosDecimales.format(media));
        %>
    </body>
</html>
