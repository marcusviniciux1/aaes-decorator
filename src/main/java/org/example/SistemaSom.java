package org.example;

public class SistemaSom extends AcessorioDecorator {

    public SistemaSom(Veiculo veiculo) {
        super(veiculo);
    }

    public float getCustoAdicional() {
        return 1000.0f;
    }

    public String getDescricaoAcessorio() {
        return "Sistema de Som";
    }
}