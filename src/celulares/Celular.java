/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package celulares;

/**
 *
 * @author mativ
 */
public class Celular extends Dispositivo {
    private boolean encendido;
    public Bateria bat;
    /*=======*/
    public UnidadModular unModular;    


    public Celular(boolean encendido) {
        this.encendido = encendido;
        this.unModular = new UnidadModular ();
    }
    public void Colocar(Bateria objbat){
        this.bat = objbat;
    }
    
    public void Encender(){
        
    }
    public void Apagar(){
        
    }
    public void MostrarInfo(){
        
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public UnidadModular getUnModular() {
        return unModular;
    }

    public void setUnModular(UnidadModular unModular) {
        this.unModular = unModular;
    }
    
    
    
    
    
}
