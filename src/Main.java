
public class Main {
    public static void main(String[] args) {
        Author lev = new Author("Лев","Толстой");
        Author margaret = new Author("Маргарет", "Митчилл");

        Book war = new Book("Война и мир", lev, 1867);
        Book war1 = new Book("Война и мир",lev,1999);

        Book wind = new Book("Унесённые ветром",margaret, 1940);


        war.setPublishingYear(2000);

        System.out.println(lev.toString());
        System.out.println(war.toString());

        System.out.println(margaret.hashCode());
        System.out.println(wind.hashCode());

        System.out.println(war.equals(wind));
        System.out.println(war.equals(war1));



    }
}