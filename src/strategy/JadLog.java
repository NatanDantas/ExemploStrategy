package strategy;

public class JadLog implements Frete {

    @Override
    public double calculaFrete(Distancia distancia) {
        return distancia.getPercurso() * 0.3;
    }

}
