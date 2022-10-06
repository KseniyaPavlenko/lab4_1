
public class Main {

    /**
     * Вариант 4. Задание: Вывести данные о книгах, в которых тираж не
     * превышает 10000 экземпляров.
     */


    public static void main(String[] args) {
        Book[] books = new Book[8];

        books[0] = new Book("Эрих Мария Ремарк", "Три товарища", "Роман", 27000);
        books[1] = new Book("Джейн Остин", "Гордость и предубеждение", "Роман", 10000);
        books[2] = new Book("Рувим Исаевич Фраерман", "Дикая собака Динго, или Повесть о первой любви", "Художественный вымысел", 7000);
        books[3] = new Book("Шарлотта Бронте", "Джейн Эйр", "Любовный роман", 16000);
        books[4] = new Book("Рэй Брэдбери", "451 градус по Фаренгейту", "Роман, научная фантастика", 9000);
        books[5] = new Book("Джером Дэвид Сэлинджер", "Над пропастью во ржи", "Роман", 8000);
        books[6] = new Book("Рэй Брэдбери", "Вино из одуванчиков", "Повесть", 7000);
        books[7] = new Book("Эрих Мария Ремарк", "Триумфальная арка", "Роман", 30000);
        System.out.println("Список всех книг:");
        for (int i = 0; i < books.length; i++){
            System.out.println("\n" + books[i].ToString());
        }
        System.out.println("\nКниги с тиражем меньше 10000");
        NewBookClass books2 = new NewBookClass();
        for (int i = 0; i < books.length; i++) {
            books2.addBook(books[i]);
        }
        System.out.println(books2.Less10000edition(10000).toString());

    }
}