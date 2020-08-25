import java.util.Scanner;

public class Terminal {
    public Terminal(){
        Catalogo c = new Catalogo();
        System.out.println("SISTEMA DE GESTAO DE CATALOGO");

        Scanner in = new Scanner(System.in);
        int menu = 1;        
        while (menu != 0) {
            System.out.println("Escolha uma opção do menu abixo:\n 1.Registrar nova venda.\n 2.Registrar nova compra.\n 3.Listar catalogo completo.\n 0.Encerrar aplicação.");
            menu = in.nextInt();
            switch(menu) {
            case 0:
                break;
            case 1: 
                System.out.println("Digite o modelo do carro a ser vendido!");
                in.nextLine();
                String model = in.nextLine();
                c.newSale(model);
                break;
            case 2:
                System.out.println("Insira os dados do veiculo a ser adicionado ao catálogo (Modelo, preço e kilometragem)!");
                in.nextLine();
                String model1 = in.nextLine();
                double price = in.nextDouble();
                double km = in.nextDouble();
                if (km==0){
                    c.newPurchase(new Veiculo(model1, price));
                }
                else{
                    c.newPurchase(new Veiculo(model1, price, km));
                }
                break;
            case 3:
                c.listCatalog();
                break;
            } //end switch
        } //end while
        in.close();
    }
}