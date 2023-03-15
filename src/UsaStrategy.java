public class UsaStrategy {
    public static void main(String[] args) throws Exception {
        Distancia distancia = new Distancia(100);

    }

    public static double calculoDoFrete(Distancia distancia, String empresa) throws Exception {
        double valor =-1;
        if (empresa.equals("JadLog")) {
            valor = distancia.getPercurso() * 0.3;
        } else if (empresa.equals("Correios")) {
            valor = distancia.getPercurso() * 0.2;
        } else if (empresa.equals("Transportadora")) {
            valor = distancia.getPercurso() * 0.1;
        } else {
            throw new Exception("Empresa não encontrada");
        }
    }

    }
}

/* */
