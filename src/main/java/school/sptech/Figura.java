package school.sptech;

public abstract class Figura {
    private String cor;
    private Integer espessura;

    public abstract Double calcularArea();

    @Override
    public String toString() {
        return String.format("Cor: %s\nEspessura: %d", cor, espessura);
    }

    public Integer getEspessura() {
        return this.espessura;
    }

    public void setEspessura(Integer espessura) {
        this.espessura = espessura;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
