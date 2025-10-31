package school.sptech;

public class Quadrado extends Figura{
    private Double lado;

    @Override
    public Double calcularArea() {
        return lado * lado;
    }

    @Override
    public String toString() {
        return String.format("""
                Cor: %s
                Espessura: %d
                Lado: %.2f""", this.getCor(), this.getEspessura(), this.lado);
    }

    public Double getLado() {
        return this.lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }
}
