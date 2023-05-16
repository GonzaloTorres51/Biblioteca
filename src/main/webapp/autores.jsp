<%-- 
    Document   : autor
    Created on : 16-05-2023, 15:02:42
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
        <center><h2>Autores</h2></center>
    <center><table>
            <tr>
                <td>
                    <h3>Mantenedor de Autores</h3>
                    <br>
                    <form action="" method="post" onsubmit="return validarForm()">
                        <input type="text" name="nombre_autor" placeholder="nombre autor" id=""></input><br>
                        
                        <button type="submit">Ingresar</button>
                    </form>
                </td>
                <td>
                    <!<!-- comment -->
                </td>
            </tr>
        </table></center>
    </body>
</html>
