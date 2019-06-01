/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Victoria
 */
public class ColaBloqueados {
    private Nodo cabecera;
    private Nodo primero;
    private Nodo ultimo;
    private ColaListos listos;
    int tam=0;
    
    public ColaBloqueados(ColaListos listos) {
        this.listos=listos;
        cabecera=new Nodo (0,0,0,0,0,0,0,cabecera);
        primero=cabecera;
        ultimo=cabecera;
        tam=0;
    }
    public boolean estaVacia (){
        return primero==cabecera;
    }
    public int size (){
        return tam;
    }
    public Nodo enqueue (int nombre,int tllegada,int trafaga){
        Nodo aux = new Nodo(nombre,tllegada,(int)(Math.random()*8+1),0,0,0,0,cabecera);
        if (estaVacia()){
           primero=aux;
           cabecera.setSiguiente(primero);
        }
        else{
            if(size()==1){
                 primero.setSiguiente(aux);
            }
            else{
                ultimo.setSiguiente(aux);
            }
        }
        ultimo=aux;
       return aux;
    } 
   public Nodo dequeue(){
        if (!estaVacia()){
             Nodo aux2=primero;
            if(tam==1){
               aux2.setTcomienzo(0);
            }
            listos.enqueue(aux2.getNombre(),aux2.getTllegada(),aux2.getTrafaga());
            
            Nodo aux=primero.getSiguiente();
            primero=aux;
            primero.setTcomienzo(aux2.getTfinal());
            return aux2;
        }
        else{
            return null;
        }
    }
   
   
    public String Mostrar() {
        if (estaVacia()){
            return "No hay procesos en cola";
        }
        else{
            String cadena = "Nombre \t T llegada \t T rafaga \t T comienzo \t T final \t T retorno \t T espera \n";
            Nodo aux = primero;
            
            while (aux!=cabecera){
                cadena+= aux.getNombre() +"\t"+aux.getTllegada()+"\t"+aux.getTrafaga()+"\t"+aux.getTcomienzo()+"\t"+aux.getTfinal()+"\t"+aux.getTretorno()+"\t"+aux.getTespera()+"\n";
                aux =aux.getSiguiente();
            }        
            return cadena;
        }
    }
   
}
