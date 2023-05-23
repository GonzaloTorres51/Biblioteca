
package Modals;

import DAO.DAO_Editorial;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CRUD_Editorial {
    Conexion Conexion = new Conexion();
    
    public String Create(Object obj){
        DAO_Editorial editorial = (DAO_Editorial) obj; //creamos un objeto de dao editorial
        Connection connection;    //ejecuta la conexion
        PreparedStatement pst;  //permiten mantener las consultas neutras sin tener en cuenta los parámetros
        String query = "INSERT INTO TBL_EDITORIAL VALUES (?)";  //almacena la consulta
        String respuesta;   //bariable resultante del CATCH
        
        try{
            Class.forName(Conexion.getDriver());    //carga la clase en la máquina virtual, en este caso carga el driver
            connection = (Connection) DriverManager.getConnection(Conexion.getUrl(),Conexion.getUsuario(), Conexion.getPassword()); //Método que nos permite establecer una conexión con la base de datos.            
            pst = (PreparedStatement) connection.prepareStatement(query); //le pasa la coneccion y la consulta(sin parametros)
            pst.setString(1,editorial.getVCH_NOMBRE_EDITORIAL());   //pasa los parametro en orden de izquierda a derecha (1,2,3),y el valor
            respuesta = Integer.toString(pst.executeUpdate());  //devuelve el número de filas afectadas por la instrucción SQL
        }catch(ClassNotFoundException | SQLException ex){
            respuesta = ex.toString();
        }
        
        return respuesta;   //resultado de la consulta (funcione o no)
    }
}
