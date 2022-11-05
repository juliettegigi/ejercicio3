/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import enumerados.Numeros;
import enumerados.Palos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author julie
 */
public class Baraja {
    private List<Carta> baraja=new ArrayList();
    private int primeraCarta; //primera carta del mazo
    static final  int CANTIDAD_CARTAS_BARAJA=40;
    public Baraja(){
      
       for(int i=0;i<4;i++){
           for(int j=0;j<10;j++){
              Carta c=new Carta(Numeros.values()[j],Palos.values()[i]);
               baraja.add(c);
           }
        
        }
       primeraCarta=0;
       
}

    public int getUltimaCarta() {
        return primeraCarta;
    }
    
   
    
    //barajar(): cambia de posición todas las cartas aleatoriamente.
    public void barajar(){
        
    	Collections.shuffle(baraja.subList(primeraCarta, CANTIDAD_CARTAS_BARAJA));
    	
    }
    
  //  • siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya 
//más o se haya llegado al final, se indica al usuario que no hay más cartas.
    public Carta siguienteCarta(){
      
      if(primeraCarta==CANTIDAD_CARTAS_BARAJA){
            System.out.println("No hay más cartas");
            return null;
      }
      return baraja.get( primeraCarta++);
    }
    
    public int cartasDisponibles(){
    return(CANTIDAD_CARTAS_BARAJA-primeraCarta);
    }
    
//    • darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número 
//de cartas. En caso de que haya menos cartas que las pedidas, no devolveremos 
//nada, pero debemos indicárselo al usuario.
    public ArrayList<Carta> darCartas(int c){
        
        ArrayList<Carta> cartas;
        cartas = (cartasDisponibles()>=c)?new ArrayList():null;
    	if(cartas==null) 
    		System.out.println("No hay la cantidad de cartas solicitadas, quedan: "
                    +cartasDisponibles()+" cartas");
    	else 
            for(int i=0;i<c;i++)
                cartas.add( siguienteCarta());
    	return cartas;
    }
  //• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna 
//indicárselo al usuario  
  
    public void cartasMonton(){
        for(int i=0;i<primeraCarta;i++)
            System.out.println((i+1)+" "+baraja.get(i));
    }
//    • mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta 
//y luego se llama al método, este no mostrara esa primera carta
    public void mostrarBaraja(){
    
        for(int i=primeraCarta;i<CANTIDAD_CARTAS_BARAJA;i++)
           System.out.println((i+1)+" "+baraja.get(i));
    }
    
}   
    



/*  



Carta aux;
 

for(int k=0; k<1000;k++){
  int i=(int)(Math.random()*CANTIDAD_CARTAS_BARAJA);
  int j=(int)(Math.random()*CANTIDAD_CARTAS_BARAJA);
  if(i>j){
      int aux2=j;
      j=i;
      i=aux2;
  }
  if(j!=0){
  aux=baraja.get(i);
  baraja.remove(i);
  baraja.add(i, baraja.get(j-1));
   baraja.remove(j);
  baraja.add(j,aux);
  }
  
}*/