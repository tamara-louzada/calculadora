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
    public void somandoDoisValores(){

        double resultadoSoma = calculadora.somar(calculadora.getValores());

        Assertions.assertEquals(7,resultadoSoma);
    }

    @Test
    public void subtraindoDoisValore(){

        double resultadoSubtracao = calculadora.subtrair(calculadora.getValores());

        Assertions.assertEquals(-3,resultadoSubtracao);
    }

    @Test
    public void multiplicandoDoisValores(){

        double resultadoMultiplicacao = calculadora.multiplicar(calculadora.getValores());

        Assertions.assertEquals(10,resultadoMultiplicacao);
    }

    @Test
    public void dividindoDoisValores(){

        double resultadoDivisao = calculadora.dividir(calculadora.getValores());

        Assertions.assertEquals(0.4,resultadoDivisao);
    }


}
