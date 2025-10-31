package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {
    private ArrayList<Figura> figuras = new ArrayList<>();

    public Imagem() {

    }

    public void adicionar(Figura figura) {
        this.figuras.add(figura);
    }

    public Double calcularSomaDasAreas() {
        Double total = 0.0;

        for(Figura figura : figuras) {
            total += figura.calcularArea();
        };

        return total;
    }

    public List<Figura> buscarPorAreaMaiorQue20() {
        List<Figura> figurasMaior20 = new ArrayList<>();

        for(Figura figura : figuras) {
            if(figura.calcularArea() > 20) {
                figurasMaior20.add(figura);
            }
        }

        return figurasMaior20;
    }

    public List<Figura> buscarQuadrados() {
        List<Figura> quadrados = new ArrayList<>();

        for(Figura figura : figuras) {
            if(figura instanceof Quadrado) {
                quadrados.add(figura);
            }
        }

        return quadrados;
    }
}
