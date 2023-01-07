public class Car {
    public int speed;
    public double RegularPrice;
    public String color;

    public Car(int speed,double RegularPrice,String color){
        this.speed=speed;
        this.RegularPrice=RegularPrice;
        this.color=color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRegularPrice() {
        return RegularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        RegularPrice = regularPrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getSalePrice() {
        return RegularPrice;
    }
}

