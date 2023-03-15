package strategy;

import cliente.Distancia;

public class Transportadora implements Frete {
    @Override
    public double calculaFrete(Distancia distancia) {
        return distancia.getPercurso() * 0.1;
    }

}
