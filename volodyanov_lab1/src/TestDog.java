import java.lang.*;
public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Biba", 9, 15.3, "black");
        Dog d2 = new Dog("Boba", 5);
        Dog d3 = new Dog("Buba");
        d3.setAge(1);
        d3.setColor("white");

        System.out.println(d1);
        d1.intoHumanAge();

        System.out.println(d2);
        d2.intoHumanAge();

        System.out.println(d3);
        d3.intoHumanAge();
    }
}
