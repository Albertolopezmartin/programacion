<%-- 
    Document   : piramide
    Created on : 13-feb-2020, 10:45:07
    Author     : Alberto López Martín
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Piramide</title>
    </head>
    <body>
        <% 
           int alturaTotal = Integer.parseInt(request.getParameter("altura"));
           int altura = 1;
           int espacios = alturaTotal - 1;
            while (altura <= alturaTotal) {
            for (int i = 1; i <= espacios; i++) {
            out.print("<img src=\"blanco.jpg\">");
            }
            for (int i = 1; i < altura * 2; i++) {
            out.print("<img src=\"ladrillo.jpg\">");
            }
            out.println("</br>");
            altura++;
            espacios--;
            }

            %>
    </body>
</html>
