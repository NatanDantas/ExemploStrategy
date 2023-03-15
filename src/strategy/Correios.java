package strategy;

public class Correios implements Frete {

    @Override
    public double calculaFrete(Distancia distancia) {
        return distancia.getPercurso() * 0.2;
    }

}
