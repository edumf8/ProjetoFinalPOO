<%-- 
    Document   : index
    Created on : 12/03/2013, 12:19:17
    Author     : c31433
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script type="text/javascript">
        </script>
        <link rel="stylesheet" type="text/css" href="style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Aplicação tipo Net</title>
    </head>
    <body>
        <form >
            <div class="pagina">
                <div class="logo">
                    <h1>Tipo Net 
                        <div style="float:right"> <input class="botaoLogin"  type="submit" value="Login" name="btnLogin" />
                        </div> 
                    </h1>              
                </div>
                <div class="conteudo">
                    <div class="imagem">    
                    </div>
                    <div class="cadastro">

                        <div class="registrar">
                            <b> É TIPO NET MESMO!</b>
                            <br/> Suas preferências ficam salvas para suas próximas visitas!
                        </div>
                        <br>
                        <br>
                        <div class="campo">
                            <div>
                                <b> Nome:</b>
                            </div>
                            <div> 
                                <input type="text" name="caixaNome" value="" size="40" />
                            </div>
                        </div>
                        <br/>
                        <div class="campo">
                            <div >
                                <b> Email:</b>
                            </div>
                            <div> 
                                <input type="text" name="caixaEmail" value="" size="40" />
                            </div>
                        </div>
                        <br/>
                        <div class="campo">
                            <div >
                                <b>Senha:</b> 
                            </div>
                            <div> 
                                <input type="password" name="caixaSenha" value="" size="40" />
                            </div>
                        </div>
                        <br/>
                        <div>
                            <input class="botao" type="submit" value="Cadastrar" name="btnCadastrar" />
                        </div>
                    </div>
                </div>
            </div>
            <div class="informacoes">
            </div>
        </form>
    </body>
</html>

