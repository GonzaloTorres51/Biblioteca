<%-- 
    Document   : libros
    Created on : 09-05-2023, 17:13:45
    Author     : Alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Libros</title>
    </head>
    <body>
    <center><h2>Libros</h2></center>
    <center><table border="1" style="text-align: center;">
            <tr>
                <td>
                    <h3>Registro de Libros</h3>
                    <br>
                    <form action="" method="post" onsubmit="return validarForm()">
                        <input type="text" name="nombre_libro" placeholder="nombre" id=""></input><br>
                        <input type="text" name="editorial_libro" placeholder="Editorial" id=""></input><br>
                        <input type="text" name="autor_libro" placeholder="Autor" id=""></input><br>
                        <input type="text" name="stock_libro" placeholder="stock" id=""></input><br>
                        <input type="text" name="cantidad_actual_libro" placeholder="cantidad Actual" id=""></input><br>
                        <input type="text" name="restric_edad_libro" placeholder="Restriccion de Edad" id=""></input><br>
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
