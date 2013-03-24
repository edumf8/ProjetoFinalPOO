<%-- 
    Document   : index
    Created on : 12/03/2013, 12:19:17
    Author     : c31433
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="skin/js/jquery-1.9.1.min.js"></script>
        <script src="skin/fancybox/jquery.fancybox.pack.js"></script>
        <script src="skin/js/jquery-slider.js"></script>
        <script src="skin/js/main.js"></script>
        <script src="skin/js/index.js"></script>

        <link rel="stylesheet" href="skin/fancybox/jquery.fancybox.css"/>
        <link rel="stylesheet" href="skin/css/slider.css"/>
        <link rel="stylesheet" href="skin/css/style.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Aplicação tipo Net</title>
    </head>
    <body>
        <div class="header">
            Tinami
        </div>        
        <div class="slider-home"> 
            <img src="skin/img/slider_home/game-of-thrones.png" alt="Game of Thrones é muito louco, mano!" />
            <img src="skin/img/slider_home/iron-man.png" alt="Game of Thrones é muito louco, mano!" />
            <img src="skin/img/slider_home/shrek.jpg" alt="Game of Thrones é muito louco, mano!" />
        </div>
        
        <div class="acoes-home">
            <button class="button-login">Login</button>
            <form>
                <span></span>
                <input type="text" name="nome" placeholder="Nome"/>
                <input type="text" name="email" placeholder="E-mail"/>
                <input type="password" name="senha" placeholder="Senha"/>
            </form>
        </div>
        
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
        </form>
    </body>
</html>

