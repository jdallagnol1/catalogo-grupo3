import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Veiculo> catalog;    

    public Catalogo(){ //constructor + init
        catalog = new ArrayList<>();
        //hard code initialization
        catalog.add(new Veiculo("Celta", 25000));
        catalog.add(new Veiculo("Gol", 20000));
        catalog.add(new Veiculo("Civic", 40000, 20000));
        catalog.add(new Veiculo("Cruze", 35000));
        catalog.add(new Veiculo("Golf", 30000));
        catalog.add(new Veiculo("Ka", 15000, 12000));
        catalog.add(new Veiculo("EcoSport", 50000));
        catalog.add(new Veiculo("Jeep", 65000));
    }

    public boolean newSale(Veiculo v){
        try{
            catalog.remove(v);
        } catch (Exception e){
            return false;
        }
        System.out.println("Falha ao remover veiculo do catálogo");
        return true;

    }

    public boolean newPurchase(Veiculo v){
        try{
            catalog.add(v);
        } catch (Exception e){
            return false;
        }
        System.out.println("Falha ao adicionar novo veiculo ao catálogo");
        return true;
    }

    public void listCatalog(){
        System.out.println("LISTA DE VEICULOS NO CATALOGO!");
        for(Veiculo v:catalog){
            System.out.println("----------------------------");
            v.toMyString();
        }

    }
}