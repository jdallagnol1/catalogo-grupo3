public class Veiculo {
    private String model;
    private double price;
    private double km;
    
    
    public Veiculo(String model, double price){ //if new car
        this.model =  model;
        this.price = price;
        this.km = 0;
    }

    public Veiculo (String model, double price, double km){
        this.model =  model;
        this.price = price;
        this.km = km; 
    }

    public String getModel(){
        return model;
    }
    public double getPrice(){
        return price;   
    }
    public double getKm(){
        return km;
    }
    

    public void toMyString() {
        String aux = "";
        aux += "Modelo: " + getModel() + "\nPreço: " + getPrice();
        if (km == 0){
            aux += "\n0 Kilometros";
            System.out.println(aux);
        }
        else{    
            aux += "\nKilometragem: " + getKm();
            System.out.println(aux);
        }
    }
}