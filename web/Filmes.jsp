<%-- 
    Document   : Filmes
    Created on : 13/03/2013, 14:07:49
    Author     : c31433
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

    <head>
        <link rel="stylesheet" type="text/css" href="style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Aplicação tipo Net</title>
    </head>
    <body>
        <form action="NewServlet" >
            <div >
                <c:forEach var="filme" items="${listaFilme}">
                    ${filme.nomeFilme}
                    <br />
                    
                </c:forEach>
            </div>
            <div>
                <img src="" width="100px" height="200px">
            </div>
            <div>
                Categoria
            </div>
            <input type="button">
        </form>
    </body>

</html>
