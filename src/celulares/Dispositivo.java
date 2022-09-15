/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package celulares;

/**
 *
 * @author mativ
 */
public abstract class Dispositivo {
    protected Integer nroSerie;
    
    public abstract void Encender();
    public abstract void Apagar();
    public abstract void MostrarInfo();
}
