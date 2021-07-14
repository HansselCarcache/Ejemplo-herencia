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
public class Vendedor extends Persona {
    private double salario;

    public Vendedor() {
        
    }

    public Vendedor(double salario, int id, String nombre, String apellidos, int edad, String sexo) {
        super(id, nombre, apellidos, edad, sexo);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Vendedor{ID=" +this.getId()+ " Nombre: "+this.getNombre()+ 
                " Apellido: "+this.getApellidos()+" Edad: "+this.getEdad()+" Sexo: "
                +this.getSexo() +" Salario=" + salario + '}';
    }
    
}
