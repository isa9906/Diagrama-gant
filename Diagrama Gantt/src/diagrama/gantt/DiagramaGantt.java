/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrama.gantt;

import java.util.Date;
import logica.ColaListos;

/**
 *
 * @author Victoria
 */
public class DiagramaGantt {

    public static void main(String[] args) {
        ColaListos cola = new ColaListos();
        GestionProcesos gestor =new GestionProcesos();
        Date fechaactual=new Date();
        String cadena;
        cadena = "Nombre \t T llegada \t T rafaga \t T comienzo \t T final \t T retorno \t T espera \n";
        cola.enqueue("A",0,3);
        cola.enqueue("B",0,2);
        cola.enqueue("C", 0,1);
        gestor.insertar(cola,fechaactual);
        gestor.atender(cola);    
    }
    
    
}
