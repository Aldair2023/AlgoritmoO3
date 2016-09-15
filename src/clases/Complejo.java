/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author aldair
 */
public class Complejo {

    private int ParteUno;
    private int ParteDos;

    public Complejo(int ParteUno, int ParteDos) {
        this.ParteUno = ParteUno;
        this.ParteDos = ParteDos;
    }

    public int getParteUno() {
        return ParteUno;
    }

    public void setParteUno(int ParteUno) {
        this.ParteUno = ParteUno;
    }

    public int getParteDos() {
        return ParteDos;
    }

    public void setParteDos(int ParteDos) {
        this.ParteDos = ParteDos;
    }
    
    public Complejo sumar(Complejo c2){
        Complejo x;
        
        int aux1 , aux2;
        
        aux1 = this.ParteUno + c2.ParteUno;
        aux2 = this.ParteDos + c2.ParteDos;
        x = new Complejo(aux1, aux2);
        
        return x; 
    }
    
    public Complejo restar(Complejo c2){
        Complejo x;
        
        int aux1, aux2;
        
        aux1 = this.ParteUno - c2.ParteUno;
        aux2 = this.ParteDos - c2.ParteDos;
        
        x = new Complejo(aux1, aux2);
        
        return x;
    }
    
    public Complejo Multiplicar(Complejo c2){
        Complejo x;
        
        int aux1, aux2;
        
        aux1 = ((this.ParteUno * c2.ParteUno) + (this.ParteUno * c2.ParteDos));  
        aux2 = ((c2.ParteDos * this.ParteDos) + (c2.ParteUno * c2.ParteDos));
        
        x = new Complejo(aux1, aux2);
        
        return x;
    }
    
    public Complejo Dividir(Complejo c2){
        Complejo x;
        
        int aux1, aux2;
        
        aux1 = ((this.ParteUno * c2.ParteUno)+(this.ParteDos * c2.ParteDos));
        aux2 = ((c2.ParteUno * this.ParteDos) - (this.ParteUno * c2.ParteDos));
        

         x = new Complejo(aux1, aux2);
         
         return x;
    }
}
