package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VeiculoTest {

    @Test
    void deveRetornarCustoModeloBase() {
        Veiculo veiculo = new ModeloBase();

        assertEquals(20000.0f, veiculo.getCusto());
    }

    @Test
    void deveRetornarCustoVeiculoComRodasEsportivas() {
        Veiculo veiculo = new RodasEsportivas(new ModeloBase());

        assertEquals(20500.0f, veiculo.getCusto());
    }

    @Test
    void deveRetornarCustoVeiculoComSistemaSom() {
        Veiculo veiculo = new SistemaSom(new ModeloBase());

        assertEquals(21000.0f, veiculo.getCusto());
    }

    @Test
    void deveRetornarCustoVeiculoComTetoSolar() {
        Veiculo veiculo = new TetoSolar(new ModeloBase());

        assertEquals(22000.0f, veiculo.getCusto());
    }

    @Test
    void deveRetornarCustoVeiculoComRodasEsportivasESistemaSom() {
        Veiculo veiculo = new RodasEsportivas(new SistemaSom(new ModeloBase()));

        assertEquals(21500.0f, veiculo.getCusto());
    }

    @Test
    void deveRetornarCustoVeiculoComTetoSolarESistemaSom() {
        Veiculo veiculo = new TetoSolar(new SistemaSom(new ModeloBase()));

        assertEquals(23000.0f, veiculo.getCusto());
    }

    @Test
    void deveRetornarCustoVeiculoComTodosAcessorios() {
        Veiculo veiculo = new RodasEsportivas(new SistemaSom(new TetoSolar(new ModeloBase())));

        assertEquals(23500.0f, veiculo.getCusto());
    }

    @Test
    void deveRetornarAcessoriosDoVeiculoBase() {
        Veiculo veiculo = new ModeloBase();

        assertEquals("Modelo Base", veiculo.getDescricao());
    }

    @Test
    void deveRetornarAcessoriosDoVeiculoComRodasEsportivas() {
        Veiculo veiculo = new RodasEsportivas(new ModeloBase());

        assertEquals("Modelo Base + Rodas Esportivas", veiculo.getDescricao());
    }

    @Test
    void deveRetornarAcessoriosDoVeiculoComSistemaSom() {
        Veiculo veiculo = new SistemaSom(new ModeloBase());

        assertEquals("Modelo Base + Sistema de Som", veiculo.getDescricao());
    }

    @Test
    void deveRetornarAcessoriosDoVeiculoComTetoSolar() {
        Veiculo veiculo = new TetoSolar(new ModeloBase());

        assertEquals("Modelo Base + Teto Solar", veiculo.getDescricao());
    }

    @Test
    void deveRetornarAcessoriosDoVeiculoComTodosAcessorios() {
        Veiculo veiculo = new RodasEsportivas(new SistemaSom(new TetoSolar(new ModeloBase())));

        assertEquals("Modelo Base + Teto Solar + Sistema de Som + Rodas Esportivas", veiculo.getDescricao());
    }

}