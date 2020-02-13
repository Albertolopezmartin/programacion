<%-- 
    Document   : conversor
    Created on : 13-feb-2020, 9:24:53
    Author     : Alberto López Martín
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Conversor</title>
        <link href="estilos.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <div class="dinero">
            <h2>
        <%
          String cualMoneda = request.getParameter("tipoMoneda");
          double moneda = Double.valueOf(request.getParameter("monedaIntro"));
          DecimalFormat dosDecimales = new DecimalFormat("0.00");
          if (cualMoneda.equals("Euros -> Pesetas")){
            out.print(moneda + " euros son " + dosDecimales.format(moneda * 166.386) + " pesetas");
          } else {
            out.print(moneda + " pesetas son " + dosDecimales.format(moneda / 166.386) + " euros");
          }
        %>
            </h2>
        </div>
    </body>
</html>
