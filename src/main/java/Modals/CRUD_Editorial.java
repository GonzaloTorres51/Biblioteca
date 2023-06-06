package Modals;

import DAO.DAO_Editorial;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CRUD_Editorial {

    Conexion Conexion = new Conexion();

    public String Create(Object obj) {
        DAO_Editorial editorial = (DAO_Editorial) obj; //creamos un objeto de dao editorial
        Connection connection;    //ejecuta la conexion
        PreparedStatement pst;  //permiten mantener las consultas neutras sin tener en cuenta los parámetros
        String query = "INSERT INTO TBL_EDITORIAL VALUES (?)";  //almacena la consulta
        String respuesta;   //bariable resultante del CATCH

        try {
            Class.forName(Conexion.getDriver());    //carga la clase en la máquina virtual, en este caso carga el driver
            connection = (Connection) DriverManager.getConnection(Conexion.getUrl(), Conexion.getUsuario(), Conexion.getPassword()); //Método que nos permite establecer una conexión con la base de datos.            
            pst = (PreparedStatement) connection.prepareStatement(query); //le pasa la coneccion y la consulta(sin parametros)
            pst.setString(1, editorial.getVCH_NOMBRE_EDITORIAL());   //pasa los parametro en orden de izquierda a derecha (1,2,3),y el valor
            respuesta = Integer.toString(pst.executeUpdate());  //devuelve el número de filas afectadas por la instrucción SQL
        } catch (ClassNotFoundException | SQLException ex) {
            respuesta = ex.toString();
        }

        return respuesta;   //resultado de la consulta (funcione o no)
    }

    public List<DAO_Editorial> Leer_Buscar(String parametro) {
        Connection connection;    //ejecuta la conexion
        PreparedStatement pst;  //permiten mantener las consultas neutras sin tener en cuenta los parámetros 
        String query = "SELECT * FROM TBL_EDITORIAL WHERE VCH_NOMBRE_EDITORIAL LIKE '%" + parametro + "%'";  //almacena la consulta
        ResultSet rs;
        
        List<DAO_Editorial> listaEditorial = new ArrayList<>();
        
        try{
           Class.forName(Conexion.getDriver());
           connection = (Connection) DriverManager.getConnection(Conexion.getUrl(), Conexion.getUsuario(), Conexion.getPassword()); //Método que nos permite establecer una conexión con la base de datos.            
           pst = (PreparedStatement) connection.prepareStatement(query); //le pasa la coneccion y la consulta(sin parametros)
           rs = pst.executeQuery();
           
           while(rs.next()){
               DAO_Editorial Editorial = new DAO_Editorial();
               Editorial.setID_EDITORIAL(rs.getInt("ID_EDITORIAL"));
               Editorial.setVCH_NOMBRE_EDITORIAL(rs.getString("VCH_NOMBRE_EDITORIAL"));
               listaEditorial.add(Editorial);
           }
           rs.close();
        }catch(SQLException | ClassNotFoundException ex){
            ex.getMessage();
        }
        return listaEditorial;
    }

}
