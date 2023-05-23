<%-- 
    Document   : editorial
    Created on : 16-05-2023, 15:02:27
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
    <center><h2>Editoriales</h2></center>
    <center><table border="1" style="text-align: center;">
            <tr>
                <td>
                    <h3>Mantenedor de Editoriales</h3>
                    <br>
                    <form action="editoriales__Controller" method="post" onsubmit="return validarForm()">
                        <input type="text" name="nombre_editorial" placeholder=" nombre editorial" id=""></input><br>
                        <br>
                        <center><button type="submit">Ingresar</button></center>
                    </form>
                </td>
                <td>
                    <!<!-- comment -->
                </td>
            </tr>
        </table></center>
</body>
</html>
