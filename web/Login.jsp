<%-- 
    Document   : Login
    Created on : 12/03/2013, 16:14:53
    Author     : c31433
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Aplicação tipo Net</title>
    </head>
    <body>
        <form>
            <div class="centraliza">
                <div class="logo">
                    <h1>Tipo Net</h1>              
                </div> 
                <div class="conteudo">
                    <fieldset style="width: 270px; color: #1f8dd5;">
                        <div class="campo">
                            <div>
                                <b> Login</b>
                            </div>
                            <div> 
                                <input type="text" name="caixaLogin" value="" size="30" />
                            </div>
                        </div>
                        <div class="campo">
                            <div>
                                <b> Senha</b>
                            </div>
                            <div> 
                                <input type="text" name="caixaSenha" value="" size="30" />
                            </div>
                        </div>
                        <div style="text-align: center">
                            <input class ="botaoLogar"type="submit" value="Logar-se" name="btnLogar" />
                        </div>
                        <br/>
                        <div> Ainda não é cadastrado? <br/><a href="index.jsp">Registre-se</a> aqui</div>
                    </fieldset>
                </div>
            </div>
        </form>
    </body>
</html>


