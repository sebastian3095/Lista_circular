package main;

import javax.swing.JOptionPane;

public class ListaCircular {
	private Nodo inicio;
	
	public void insertarInicio(Cancion d){
        Nodo nuevo=new Nodo(d);
        if(inicio==null)
                  inicio=nuevo;
        else{
                  Nodo aux=inicio;
                  while(aux.siguiente!=inicio)
                           aux=aux.siguiente;
                  aux.siguiente=nuevo;
                  nuevo.anterior=aux;
                  nuevo.siguiente=inicio;
                  inicio.anterior=nuevo;
                  inicio=nuevo;
                 
        }
      }
	
	public void insertarFinal(Cancion d){
        Nodo nuevo=new Nodo(d);
        if(inicio==null)
                  inicio=nuevo;
        else{
                  Nodo aux=inicio;
                  while(aux.siguiente!=inicio)
                           aux=aux.siguiente;
                  aux.siguiente=nuevo;
                  nuevo.anterior=aux;
                  nuevo.siguiente=inicio;
                  inicio.anterior=nuevo;
        }
      }
	
	 public void imprimir(){
         if(inicio==null) JOptionPane.showMessageDialog(null, "Null");		
         else JOptionPane.showMessageDialog(null, cadena());
     
       }
	 
	 private String cadena() {
		 Nodo aux=inicio;
		 String cadena="";
         do{
                  cadena=cadena+aux.dato+"\n";
                  aux=aux.siguiente;
         }while(aux!=inicio);
         return cadena;
	 }
	 
	 public boolean buscar(String d){
         Nodo aux=inicio;
         while((aux.siguiente!=inicio) && (!(aux.dato.getNombre().equals(d))))
                   aux=aux.siguiente;
         return aux.dato.getNombre().equals(d);
       }
	 
	 public void eliminar(String d) {
         if(inicio!=null){
                   Nodo aux=inicio;
                   Nodo ant=null;
                   while(aux.siguiente!=inicio){
                            if(aux.dato.getNombre().equals(d)){
                                      if(ant==null){
                                               if(aux.siguiente==inicio)
                                                        inicio=null;
                                               else{
                                                        ant=aux.anterior;
                                                        ant.siguiente=aux.siguiente;
                                                        aux=aux.siguiente;
                                                        aux.anterior=ant;
                                                        inicio=aux;
                                                        ant=null;
                                               }
                                      }else{
                                               aux.anterior=null;
                                               ant.siguiente=aux.siguiente;
                                               aux=aux.siguiente;
                                               aux.anterior=ant;
                                      }
                   }else{
                            ant=aux;
                            aux=aux.siguiente;
                   }
         }
         }else
                   System.out.println("lista vacia");
       }
	 
	 public boolean estaVacia() {
		 return inicio==null;
	 }

	
}
