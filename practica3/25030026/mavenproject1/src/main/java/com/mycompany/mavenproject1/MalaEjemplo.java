
package com.mycompany.mavenproject1;

//mal ejemplo
public class MalaEjemplo {
    
    public double calcular(String tipoCliente, double precio) {
        if (tipoCliente.equals("Regular")) {
            return precio * 0.95;
        } else if (tipoCliente.equals("Premium")) {
            return precio * 0.90; 
        }
        
        // EL PROBLEMA: 
        // Si mañana el negocio decide agregar un cliente VIP o Estudiante,
        // estamos obligados a abrir esta clase y agregar más 'else if'. 
        // Esta clase NO esta cerrada para su modificacion.
        
        return precio;
    }
}