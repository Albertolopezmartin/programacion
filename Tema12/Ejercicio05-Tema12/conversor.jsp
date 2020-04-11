<%-- 
    Document   : conversor
    Created on : 11-abr-2020, 10:50:42
    Author     : alber
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Conversor</title>
    </head>
    <body>
        <% Double e = Double.parseDouble(request.getParameter("euros"));
        out.print(e); %> euros son <% out.println(Math.round(e * 166.386)); %> pesetas.
    </body>
</html>
