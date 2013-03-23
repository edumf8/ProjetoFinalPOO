<%-- 
    Document   : newjsp2
    Created on : 12/03/2013, 16:21:12
    Author     : c31433
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="NewServe">
            <h1>Hello World! ${caixa}</h1>
            <input type="text" name="caixa" />
            <input type="submit" value="enviar" />
            
        </form>
    </body>
</html>
