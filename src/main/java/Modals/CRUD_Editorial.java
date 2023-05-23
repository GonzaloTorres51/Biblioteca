
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
        PreparedStatement pst;
        String query = "INSERT INTO TBL_EDITORIAL VALUES (?)";
        String respuesta;
        
        try{
            Class.forName(Conexion.getDriver());
            connection = (Connection) DriverManager.getConnection(Conexion.getUrl(),Conexion.getUsuario(), Conexion.getPassword());
            
            pst = (PreparedStatement) connection.prepareStatement(query);
            pst.setString(1,editorial.getVCH_NOMBRE_EDITORIAL());
            respuesta = Integer.toString(pst.executeUpdate());
        }catch(ClassNotFoundException | SQLException ex){
            respuesta = ex.toString();
        }
        
        return respuesta;
    }
}
