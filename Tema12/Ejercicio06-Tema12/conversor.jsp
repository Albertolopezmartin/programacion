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
        <% Double p = Double.parseDouble(request.getParameter("pesetas"));
        out.print(p); %> pesetas son <% out.println(Math.round(p / 166.386)); %> euros.
    </body>
</html>
