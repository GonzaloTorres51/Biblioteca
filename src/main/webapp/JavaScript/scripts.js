/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */

alert("entra");

function ValidarLogin() {
    var mensaje = "";
    if ((document.getElementById("id_TipoCuenta").value) == "") {
        mensaje = mensaje + "Falta ingresar: Tipo de Cuenta\n";
    }
    if (document.getElementById("id_NombreUsuario").value == "") {
        mensaje = mensaje + "Falta ingresar: Usuario \n";
    }
    if (document.getElementById("id_pwdUsuario").value == "") {
        mensaje = mensaje + "Falta ingresar: Contraseña \n";
    }
    if (mensaje != "") {
        alert(mensaje);
        return false;
    }
}

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
    