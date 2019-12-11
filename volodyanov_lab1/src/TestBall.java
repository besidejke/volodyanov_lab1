public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(25.5, "blue", "football", 7500);
        Ball b2 = new Ball(23.5, "green", "football", 2500);
        Ball b3 = new Ball(22.5, "red", "football", 4000);

        b3.setColor("white");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
