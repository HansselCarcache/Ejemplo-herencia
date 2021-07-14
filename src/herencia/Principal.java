/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import modelos.*;

/**
 *
 * @author laba
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona hanssel = new Persona(1, "Hanssel", "Carcache",22,"Hombre");
        
        Persona keyhan = new Vendedor(4200,2,"Keyhan","Rostran",19,"Hombre");
        
        Cliente laura = new Cliente("Credito",10000,3,"Laura","Galdamez",19,"Mujer");
        
        
            Cliente nuevoCliente = new Cliente();
            nuevoCliente.setId(hanssel.getId());
            nuevoCliente.setNombre(hanssel.getNombre());
            nuevoCliente.setApellidos(hanssel.getApellidos());
            nuevoCliente.setEdad(hanssel.getEdad());
            nuevoCliente.setSexo(hanssel.getSexo());
            nuevoCliente.setTipoCliente("Credito");
            nuevoCliente.setSaldoDisponible(50000);
       
        
       
        System.out.println(keyhan.toString());
        System.out.println(laura);
        System.out.println(nuevoCliente);
    }
    
}
