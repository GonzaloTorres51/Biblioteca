
package DAO;

public class DAO_Editorial {
    private String _VCH_NOMBRE_EDITORIAL = ""; //siempre las variables de BASES DE DATOS parten con un "_" para identificarlas
    
    public String getVCH_NOMBRE_EDITORIAL(){
        return _VCH_NOMBRE_EDITORIAL;
    }
    
        public void setVCH_NOMBRE_EDITORIAL(String _VCH_NOMBRE_EDITORIAL){
        this._VCH_NOMBRE_EDITORIAL = _VCH_NOMBRE_EDITORIAL;
    }
        
        public Boolean ValidaSubida(String nom){
            Boolean flag = true;
            if (!nom.isEmpty()) {
                setVCH_NOMBRE_EDITORIAL(nom);
            }else{
                return false;
            }
            return flag;
        }
    
}
