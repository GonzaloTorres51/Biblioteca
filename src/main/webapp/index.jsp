<%-- 
    Document   : index
    Created on : 25-04-2023, 15:49:14
    Author     : Alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center><h1>Biblioteca</h1><center>
            <br>
            <form action="Login" method="post" onsubmit="return ValidarLogin()" >
                <center><h3>Login</h3><center>

                        <select name="tipo_Cuenta" id="id_TipoCuenta">
                            <option value="" selected hidden>Tipo de Cuenta</option>
                            <option value="administrativo">Administrativo</option>
                            <option value="administrador">Administrador</option>
                        </select>
                        <br>
                        <br>
                        <label for="nombre_usuario">Usuario</label>
                        <input name="nombre_usuario" type="text" id="id_NombreUsuario"></input>
                        <br>
                        <br>
                        <label for="pwd_usuario">Contraseña</label>
                        <input name="pwd_usuario" type="password" id="id_pwdUsuario"></input>
                        <br>
                        <br>
                        <button type="submit">Ingresar</button>
                        <br>
                        <a href="#" >Olvido su Contraseña?</a>

                        </form>
                        </body>

                       <footer>
                           <script src="JavaScript/scripts.js" type="text/javascript"></script>
                        </footer>
                        </html>
