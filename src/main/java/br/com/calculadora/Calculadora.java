package br.com.calculadora;

import java.util.ArrayList;
import java.util.List;

public class Calculadora {

    private double val1;
    private double val2;


    public Calculadora(double val1,double val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public List<Double> getValores() {
        List<Double> valoresEntradaCalculadora = new ArrayList<>();
        valoresEntradaCalculadora.add(val1);
        valoresEntradaCalculadora.add(val2);
        return valoresEntradaCalculadora;
   }

    public double somar(List<Double> valores) {return valores.get(0) + valores.get(1);}

    public double subtrair(List<Double> valores) {return valores.get(0) - valores.get(1);}

    public double multiplicar(List<Double> valores) {return valores.get(0) * valores.get(1);}

    public double dividir(List<Double> valores) {return valores.get(0) / valores.get(1);}
}
