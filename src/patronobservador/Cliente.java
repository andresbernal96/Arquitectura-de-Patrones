/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronobservador;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import patronobservador.Observadores.ObservadorC;
import patronobservador.Sujetos.SujetoC;

/**
 *
 * @author Andres Felipe Bernal
 */
public class Cliente {

    public static void main(String args[]) {
        SujetoC subj = new SujetoC("hola");
        subj.setState("EN linea");
        Scanner scanner = new Scanner(System.in);
        int select = -1; //opción elegida del usuario
	
        while(select != 0){
			//Try catch para evitar que el programa termine si hay un error
			try{
				System.out.println("Elige opcion:\n1.- Agregar un subscriptor" +
						"\n2.- Eliminar Subscriptor\n" +
						"3.- Cambiar estado\n" +
						"0.- Salir");
				//Recoger una variable por consola
				select = Integer.parseInt(scanner.nextLine()); 
	
				//Ejemplo de switch case en Java
				switch(select){
				case 1: 
                                    System.out.println("ingrese el nombre a subscribir");
                                    String nombre = scanner.nextLine();
                                    ObservadorC ob1= new ObservadorC(subj, nombre);
                                    subj.subscribe(ob1);
					break;
				case 2: 
                                    System.out.println("ingrese el nombre a eliminar");
                                    String nombre1 = scanner.nextLine();
                                    for (int i = 0; i < subj.Observadores.size(); i++) {
                                        if (subj.Observadores.get(i).getId()==nombre1) {
                                            subj.deSubscribe(subj.Observadores.get(i));
                                        }
                                    }
					break;
				case 3: 
					System.out.println("ingrese el nuevo estado");
					String estado = scanner.nextLine();
                                        subj.setState(estado);
                                        
                                        break;
				
				case 0: 
					System.out.println("Adios!");
					break;
				default:
					System.out.println("Número no reconocido");break;
				}
				
				System.out.println("\n"); //Mostrar un salto de línea en Java
				
			}catch(Exception e){
				System.out.println("Uoop! Error!");
			}
		}

    }
}
