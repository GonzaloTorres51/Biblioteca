
package Modals;

public class Conexion {
    private final String driver;
    private final String url;
    private final String usuario;
    private final String password;
    
    public Conexion (){
        this.driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        this.url = "jdbc:sqlserver://localhost\\24-113-DESKTOP:1433;databaseName=BCIISA;trustServerCertificate=true";
        this.usuario = "usuario";
        this.password = "1234";
    }

    public String getDriver() {
        return driver;
    }

    public String getUrl() {
        return url;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }
    
    
    
}
