package trabalho;

public class Main {
    public static void main(String[] args) {


        Carro carro1 = new Carro(1, "Fiesta", "Rosa", "2012", "AUC-5505", "Ricardo", "123129873", "36", "26/09/2025");
        Carro carro2 = new Carro(2, "Civic", "Preto", "2020", "ABC-1234", "Mariana", "987654321", "29", "01/05/2023");
        Carro carro3 = new Carro(3, "Corolla", "Branco", "2021", "XYZ-9988", "João", "456123789", "42", "15/07/2024");

        System.out.println(" CARROS ");
        imprimirCarro(carro1);
        imprimirCarro(carro2);
        imprimirCarro(carro3);

 
        Moto moto1 = new Moto(4, "Honda CG", "Vermelha", "2018", "MOT-1001", "Carlos", 2, 2, 0);
        Moto moto2 = new Moto(5, "Yamaha R3", "Azul", "2022", "MOT-2002", "Fernanda", 2, 2, 0);
        Moto moto3 = new Moto(6, "Kawasaki Ninja", "Verde", "2023", "MOT-3003", "Paulo", 2, 2, 0);

        System.out.println("\n MOTOS");
        imprimirMoto(moto1);
        imprimirMoto(moto2);
        imprimirMoto(moto3);


        Caminhao caminhao1 = new Caminhao(7, "Volvo FH", "Azul", "2019", "CAM-4004", "Roberto", 250, 700, 350);
        Caminhao caminhao2 = new Caminhao(8, "Mercedes Actros", "Prata", "2021", "CAM-5005", "Luciana", 260, 750, 360);
        Caminhao caminhao3 = new Caminhao(9, "Scania R450", "Branco", "2020", "CAM-6006", "André", 255, 720, 355);

        System.out.println("\n CAMINHÕES ");
        imprimirCaminhao(caminhao1);
        imprimirCaminhao(caminhao2);
        imprimirCaminhao(caminhao3);
    }

  
    public static void imprimirCarro(Carro carro) {
        System.out.println("Id: " + carro.getId());
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Cor: " + carro.getCor());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Placa: " + carro.getPlaca());
        System.out.println("Nome do dono: " + carro.getNomeCliente());
        System.out.println("Quilometragem: " + carro.getQuilometragem());
        System.out.println("Ano de fabricação: " + carro.getAnoFabricacao());
        System.out.println("Data da compra: " + carro.getDataCompra());
        System.out.println("-----------------------------");
    }

    public static void imprimirMoto(Moto moto) {
        System.out.println("Id: " + moto.getId());
        System.out.println("Marca: " + moto.getMarca());
        System.out.println("Cor: " + moto.getCor());
        System.out.println("Modelo: " + moto.getModelo());
        System.out.println("Placa: " + moto.getPlaca());
        System.out.println("Nome do dono: " + moto.getNomeCliente());
        System.out.println("Qtd. Rodas: " + moto.getQtdRodas());
        System.out.println("Qtd. Passageiros: " + moto.getQtdPassageiros());
        System.out.println("Qtd. Portas: " + moto.getQtdPortas());
        System.out.println("-----------------------------");
    }

    public static void imprimirCaminhao(Caminhao caminhao) {
        System.out.println("Id: " + caminhao.getId());
        System.out.println("Marca: " + caminhao.getMarca());
        System.out.println("Cor: " + caminhao.getCor());
        System.out.println("Modelo: " + caminhao.getModelo());
        System.out.println("Placa: " + caminhao.getPlaca());
        System.out.println("Nome do dono: " + caminhao.getNomeCliente());
        System.out.println("Largura: " + caminhao.getLargura());
        System.out.println("Comprimento: " + caminhao.getComprimento());
        System.out.println("Altura: " + caminhao.getAltura());
        System.out.println("-----------------------------");
    }
}
