public class Truck extends Car {
    int weight;
    int Speed;
    static double regularPrice;
    String color;
    
    public Truck (int Speed,double RegularPrice,String color, int weight) {
        super(Speed,regularPrice,color);
        this.weight = weight;
    }
       public double getSalePrice(){
        if (weight>2000){
            return super.getSalePrice()-(0.1 * super.getSalePrice());       
}
     }
     else{
        return super.getSalePrice();  
     }
    }
