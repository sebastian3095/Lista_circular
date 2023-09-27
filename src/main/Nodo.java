package main;

public class Nodo {
	Cancion dato;
	Nodo siguiente;
	Nodo anterior;
	
	//Constructor
	public Nodo(Cancion d) {
		dato= d;
		siguiente= this;//Apunta a él mismo
	}

}

