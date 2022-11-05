/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import entidades.Baraja;
import entidades.Carta;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author julie
 */
public class Principal {

   static Scanner leer=new Scanner(System.in);
	public static void main(String[] args) {
	
		
		Baraja abarajame=new Baraja();
		int opc=0;
		do {
		System.out.println("----------------------------------------");
        System.out.println("               MENU ");
        System.out.println("----------------------------------------");
		System.out.println("1) Dar cartas");
		System.out.println("2) Barajar");
		System.out.println("3) Imprimir montón");
		System.out.println("4) Imprimimr baraja");
		System.out.println("5) Cartas disponibles(cantidad)");
                System.out.println("6) Siguiente carta");
		System.out.println("7) Salir");
		System.out.println("----------------------------------------");
		opc=leerOpcion();
		
	switch(opc) {
		case 1:
			System.out.println("Cuántas cartas?");
			List <Carta> l=abarajame.darCartas(leerOpcion());
			
			
			if(!(l==null)) 
				for( int i=0;i<l.size();i++)
				   System.out.println((i+1)+" "+l.get(i));
			break;
		case 2:
			abarajame.barajar();
			System.out.println("Ya se barajó");
			break;
		case 3:
			abarajame.cartasMonton();
			break;
		case 4:
			abarajame.mostrarBaraja();
			break;
		case 5:
			System.out.println("Cartas disponibles: "+abarajame.cartasDisponibles());
			
			break;
		case 6: System.out.println("Siguiente carta "+abarajame.siguienteCarta());
			break;	
                case 7:break;
                default :System.out.println("Debe ingresar un número entre 1-7");
                        
		}
         if(opc==7)break;          
	System.out.println("presione enter para cotinuar");
	leer.nextLine();
		}while(true );
		
		leer.close();
		System.out.println("FINN");
	    
	}
	
	

	static int leerOpcion(){
		do {
			try {
				return(Integer.parseInt(leer.nextLine()));
			   
			    }catch(Exception e){
			    	System.out.println("debe ingresar un número");
			    	}
		}while(true);
	}
	
}
