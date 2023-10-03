package org.example;

public class TetoSolar extends AcessorioDecorator {
    public TetoSolar(Veiculo veiculo) {
        super(veiculo);
    }

    public float getCustoAdicional() {
        return 2000.0f;
    }

    public String getDescricaoAcessorio() {
        return "Teto Solar";
    }
}