package br.com.calculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CalculadoraTest {

    private Calculadora calculadora;
    private List<Double> valores;
    
    @BeforeEach
    public void inicializaCalculadora() {this.calculadora = new Calculadora(2,5);}

    @Test
    public void somandoValores(){

        double resultadoSoma = calculadora.somar(calculadora.getValor());

        Assertions.assertEquals(7,resultadoSoma);
    }

}
