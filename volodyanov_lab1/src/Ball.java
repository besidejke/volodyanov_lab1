import java.lang.*;
public class Ball {
    private double diameter; // Диаметр
    private String color;    // Цвет
    private String type;     // Тип
    private double price;    // Цена

    public Ball(double d, String c, String t, double p){
        diameter = d;
        color = c;
        type = t;
        price = p;
    }
    public Ball(double d, String c, String t){
        diameter = d;
        color = c;
        type = t;
        price = 0;
    }
    public Ball(double d, String c){
        diameter = d;
        color = c;
        type = "football";
        price = 0;
    }
    public Ball(double d){
        diameter = d;
        color = "black";
        type = "football";
        price = 0;
    }
    public Ball(){
        diameter = 0;
        color = "black";
        type = "football";
        price = 0;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiameter(){
        return diameter;
    }
    public String getType() {
        return type;
    }
    public String getColor() {
        return color;
    }
    public double getPrice() {
        return price;
    }

    public String toString(){
        return "Диаметр: " + this.diameter + "см., цвет: " + this.color + ", тип: " + this.type + ", цена: " + this.price + " руб.";
    }
}
