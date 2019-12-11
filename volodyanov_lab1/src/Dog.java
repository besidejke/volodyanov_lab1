import java.lang.*;
public class Dog {
    private String name;
    private int age;
    private double tailLength; // Длина хвоста
    private String color;      // Цвет

    public Dog(String n, int a, double t, String c){
        name = n;
        age = a;
        tailLength = t;
        color = c;
    }
    public Dog(String n, int a){
        name = n;
        age = a;
        tailLength = 0;
        color = "black";
    }
    public Dog(String n){
        name = n;
        age = 0;
        tailLength = 0.0;
        color = "black";
    }
    public Dog(){
        name = "Pup";
        age = 0;
        tailLength = 0.0;
        color = "black";
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName(String name){
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public double getTailLength() {
        return tailLength;
    }

    public String toString(){
        return this.name + ", age " + this.age + ", color " + this.color + ", tailLength " + this.tailLength;
    }

    public void intoHumanAge(){
        System.out.println(name+"'s age in human years is "+age*7+" years");
    }
}
