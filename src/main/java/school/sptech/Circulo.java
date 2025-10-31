package school.sptech;

public class Circulo extends Figura{
    private Double raio;

    @Override
    public Double calcularArea() {
        return (raio * raio) * Math.PI;
    }

    @Override
    public String toString() {
        return String.format("""
                Cor: %s
                Espessura: %d
                Raio: %.2f
                """, this.getCor(), this.getEspessura(), this.raio);
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }
}
