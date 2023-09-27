package main;

import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				ListaCircular lista= new ListaCircular();
				int opcion=0;
				do {
					try {
						opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
								"1.Agregar Cancion a la lista Circular\n"
								+ "2.Eliminar Cancion de lista Circular\n"
								+ "3. Mostrar Canciones de la lista Circular\n"
								+ "4.Salir\n"
								+ "¿Qué deseas hacer?","Menú de opciones",JOptionPane.INFORMATION_MESSAGE));
						switch(opcion) {
						case 1:
							lista.insertarInicio(new Cancion(JOptionPane.showInputDialog("Nombre"),JOptionPane.showInputDialog("Autor")));
							break;
						case 2:
							if(!lista.estaVacia()) {
							String nombre = JOptionPane.showInputDialog("Nombre de la cancion");
							lista.eliminar(nombre);
							}
							
							break;
						case 3:
							if(!lista.estaVacia()) {
								lista.imprimir();
							}else {
								JOptionPane.showMessageDialog(null, "Aún no hay nodos","Lista Vacía", JOptionPane.INFORMATION_MESSAGE);

							}
							break;
						case 4:
							JOptionPane.showMessageDialog(null, "Finalizado","FIN", JOptionPane.INFORMATION_MESSAGE);
							break;
						
						default:
							JOptionPane.showMessageDialog(null, "No existe la opción","Incorrecto", JOptionPane.INFORMATION_MESSAGE);
						}
					}catch (NumberFormatException n) {
						JOptionPane.showMessageDialog(null, "Error"+n.getMessage());
					}
				}while (opcion!=4);


	}

}
