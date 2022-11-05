/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import enumerados.Numeros;
import enumerados.Palos;

/**
 *
 * @author julie
 */
public class Carta {
    
 Numeros numero;
    Palos palo;

    public Carta(Numeros numero, Palos palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public Carta() {
    }

    public Numeros getNumero() {
        return numero;
    }

    public Palos getPalo() {
        return palo;
    }

    public void setNumero(Numeros numero) {
        this.numero = numero;
    }

    public void setPalo(Palos palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta{" + "numero=" + numero + ", palo=" + palo + '}';
    }
    
    
}
