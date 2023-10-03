package org.example;

public class RodasEsportivas extends AcessorioDecorator {
    public RodasEsportivas(Veiculo veiculo) {
        super(veiculo);
    }

    public float getCustoAdicional() {
        return 500.0f;
    }

    public String getDescricaoAcessorio() {
        return "Rodas Esportivas";
    }
}