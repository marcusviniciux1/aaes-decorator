package org.example;

public abstract class AcessorioDecorator implements Veiculo {
    private Veiculo veiculo;

    public AcessorioDecorator(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public abstract String getDescricaoAcessorio();

    public String getDescricao() {
        return this.veiculo.getDescricao() + " + " + this.getDescricaoAcessorio();
    }

    public abstract float getCustoAdicional();

    public float getCusto() {
        return this.veiculo.getCusto() + this.getCustoAdicional();
    }
}