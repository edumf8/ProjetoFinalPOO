<%-- 
    Document   : teste
    Created on : 23/03/2013, 17:35:45
    Author     : victor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="skin/js/jquery-1.9.1.min.js"></script>
        <script src="skin/js/jquery-slider.js"></script>
        <script src="skin/fancybox/jquery.fancybox.pack.js"></script>
        <link rel="stylesheet" href="skin/fancybox/jquery.fancybox.css"/>
        <link rel="stylesheet" href="skin/css/slider.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Aplicação tipo Net</title>
    </head>
    <body>
        <div id="featured"> 
            <img src="skin/orbit/demo/dummy-images/captions.jpg" alt="Overflow: Hidden No More" />
            <img src="skin/orbit/demo/dummy-images/coffee.jpg"  alt="HTML Captions" />
            <img src="skin/orbit/demo/dummy-images/features.jpg" alt="and more features" />
        </div>
        <script>
            $(function() {
                //$('#featured').slider();
            });
        </script>
        
        <%
            for(Video video : videos) {
        %>
        <img src="<%=video.getUrlImagem()%>"/>
        <%}%>
    </body>
</html>
