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
    private int Numerador;
    private int Denominador;

    public Complejo(int ParteUno, int ParteDos, int Numerador, int Denominador) {
        this.ParteUno = ParteUno;
        this.ParteDos = ParteDos;
        this.Numerador = Numerador;
        this.Denominador = Denominador;

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

    public int getNumerador() {
        return Numerador;
    }

    public void setNumerador(int Numerador) {
        this.Numerador = Numerador;
    }

    public int getDenominador() {
        return Denominador;
    }

    public void setDenominador(int Denominador) {
        this.Denominador = Denominador;
    }

    public Complejo sumar(f2) {
        Complejo f;
        int num, den, aux1, aux2, entF, numF, denF;

        aux1 = (this.Denominador * this.Entero + this.Numerador);
        aux2 = (f2.Entero * f2.Denominador + f2.Numerador);

        num = aux1 * f2.Denominador - this.Denominador * aux2;
        den = this.Denominador * f2.Denominador;

        entF = num / den;
        numF = num % den;
        denF = den;

        f = new Complejo(entF, numF, denF);
        return f;

    }
}
