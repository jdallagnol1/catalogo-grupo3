import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Veiculo> catalog;    

    public Catalogo(){ //constructor + init
        catalog = new ArrayList<>();
        //hard code initialization
        catalog.add(new Veiculo("Celta", 25000, "Preto"));
        catalog.add(new Veiculo("Gol", 20000, "Branco"));
        catalog.add(new Veiculo("Civic", 40000, 20000, "Prata"));
        catalog.add(new Veiculo("Cruze", 35000, "Vermelho"));
        catalog.add(new Veiculo("Golf", 30000, "Prata"));
        catalog.add(new Veiculo("Ka", 15000, 12000, "Branco"));
        catalog.add(new Veiculo("EcoSport", 50000, "Azul"));
        catalog.add(new Veiculo("Jeep", 65000, "Preto"));
    }

    public boolean newSale(String model){
        Veiculo aux = getByModel(model);
        if (aux!=null){
            catalog.remove(getByModel(model));
            System.out.println(model + " vendido com sucesso!");
            return true;
        }
        else{
            System.out.println("Falha ao remover veiculo do catálogo!");
            return false;
        }
    }

    public boolean newPurchase(Veiculo v){
        catalog.add(v);
        System.out.println(v.getModel() + " adicionado ao catálogo!");
        return true;
    }
        

    public Veiculo getByModel(String model){
        for (Veiculo v:catalog){
            if(v.getModel().equalsIgnoreCase(model)){
                return v;
            }
        }
        System.out.println("Modelo não encontrado!");
        return null;
    }

    public void listCatalog(){
        System.out.println("LISTA DE VEICULOS NO CATALOGO!");
        for(Veiculo v:catalog){
            System.out.println("----------------------------");
            v.toMyString();
        }

    }
}