public class Veiculo {
    private String model;
    private double price;
    private double km;
    private String cor;
    
    
    public Veiculo(String model, double price, String cor){ //if new car
        this.model =  model;
        this.price = price;
        this.km = 0;
        this.cor = cor;
    }

    public Veiculo (String model, double price, double km, String cor){
        this.model =  model;
        this.price = price;
        this.km = km; 
        this.cor = cor;
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
    public String getCor(){
        return cor;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setKm(double km){
        this.km = km;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    

    public void toMyString() {
        String aux = "";
        aux += "Modelo: " + getModel() + "\nPreço: " + getPrice() + "\nCor: " + getCor();
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