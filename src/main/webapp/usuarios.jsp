<%-- 
    Document   : usuarios
    Created on : 09-05-2023, 17:14:02
    Author     : Alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuarios</title>
    </head>
    <body>
        <center><h2>Usuarios</h2></center>
    <center><table border="1" style="text-align: center;">
            <tr>
                <td>
                    <h3>Registro de Usuarios</h3>
                    <br>
                    <form action="" method="post" onsubmit="return validarForm()">
                        <input type="text" name="rut_usuario" placeholder="rut" id="rut" onkeyup="validaRut()"></input><br>
                        <input type="text" name="dv_usuario" placeholder="dv" id="dv" readonly></input><br>
                        <input type="text" name="nombre_usuario" placeholder="nombre" id=""></input><br>
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
    <footer>
    <script>
        function validaRut() {
            var aRut = new Array(8);
            var i, j, dv;

            if ((document.getElementById("rut").value.length) = 0) {
                alert("debe Ingresar un numero de RUT");
            } else {

                for (i = 1; i < 9; i++) {
                    aRut[i] = 0;
                }
                i = 0;
                for (j = (9 - (document.getElementById("rut").value.length)); j < 9; j++) {
                    if ((document.getElementById("rut").value.substr(i, 1) >= 0) & (document.getElementById("rut").value.substr(i, 1) <= 9)) {
                        aRut[j] = document.getElementById("rut").value.substr(i, 1);
                        i++;
                    } else {
                        alert("Debe ingresar solo numeros");
                        i = 0;
                        break;
                    }
                }

                if (i > 0) {
                    dv = 11 - (((aRut[1] * 3) + (aRut[2] * 2) + (aRut[3] * 7) + (aRut[4] * 6) + (aRut[5] * 5) + (aRut[6] * 4) + (aRut[7] * 3) + (aRut[8] * 2)) % 11)
                    if (dv === 10) {
                        dv = "K";

                    } else if (dv === 11) {
                        dv = "0";
                    }
                    document.getElementById("dv").value = dv;
                    return dv
                }
            }
        }
    </script>
</footer>
</html>
