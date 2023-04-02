
public class Main {
    public static void main(String[] args) {
        Author lev = new Author("Лев","Толстой");
        Author margaret = new Author("Маргарет", "Митчилл");

        Book war = new Book("Война и мир",lev,1867);
        Book wind = new Book("Унесённые ветром",margaret, 1940);

        System.out.println("Заголовок книги: " + war.getTitle());
        System.out.println("Год издания книги: " + war.getPublishingYear());

        war.setPublishingYear(2000);

        System.out.println("Год переизданя книги: " + war.setPublishingYear();


    }
}