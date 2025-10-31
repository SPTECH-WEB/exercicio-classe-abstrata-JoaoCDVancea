package school.sptech;

public class Retangulo extends Figura{
    private Double base;
    private Double altura;

    @Override
    public Double calcularArea() {
        return base * altura;
    }

    @Override
    public String toString() {
        return String.format("""
                Cor: %s
                Espessura: %d
                Base: %.2f
                Altura: %.2f""", this.getCor(), this.getEspessura(), this.base, this.altura);
    }

    public Double getBase() {
        return this.base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
}
