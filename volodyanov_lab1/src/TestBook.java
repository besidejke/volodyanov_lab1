import volodyanov.lab1.Book;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Война и миро", "Толстой Л.Н.", 9999, "Роман");
        Book b2 = new Book("Му-му", "Тургенев И.С.", 228, "Рассказ");

        b2.setPagesCount(100);

        System.out.println(b1);
        System.out.println(b2);
    }
}