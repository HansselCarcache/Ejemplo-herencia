/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author laba
 */
public class Cliente extends Persona{
    private String tipoCliente;
    private int saldoDisponible;

    public Cliente() {
    }

    public Cliente(String tipoCliente, int saldoDisponible, int id, String nombre, String apellidos, int edad, String sexo) {
        super(id, nombre, apellidos, edad, sexo);
        this.tipoCliente = tipoCliente;
        this.saldoDisponible = saldoDisponible;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public int getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(int saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    @Override
    public String toString() {
        return "Cliente{Datos"+this.mostrarDatosP() + "tipoCliente=" + tipoCliente + ", saldoDisponible=" + saldoDisponible + '}';
    }
    
    
}
