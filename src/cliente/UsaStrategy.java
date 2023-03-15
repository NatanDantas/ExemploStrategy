package cliente;

import strategy.*;

public class UsaStrategy {
    public static void main(String[] args) throws Exception {
        Distancia distancia = new Distancia(100000);
        double valor = calculoDoFrete(distancia, "JadLog");
        System.out.println("Valor do frete: " + valor);

    }

    public static double calculoDoFrete(Distancia distancia, String empresa) throws Exception {
        double valor = -1;
        Frete frete;
        if (empresa.equals("JadLog")) {
            frete = new JadLog();
            valor = frete.calculaFrete(distancia);
        } else if (empresa.equals("Correios")) {
            frete = new Correios();
            valor = frete.calculaFrete(distancia);
        } else if (empresa.equals("Transportadora")) {
            frete = new Transportadora();
            valor = frete.calculaFrete(distancia);
        } else {
            throw new Exception("Empresa não encontrada");
        }
        return valor;
    }

}