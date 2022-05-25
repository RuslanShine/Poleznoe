public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat();
        barsik.meow();
        Cat bigCat = new Cat(5500,"Murka", 2,"Black");
        Cat smallCat = new Cat(1000, "Kuzia", 1, "White");
        bigCat.setName("Pushok");
        System.out.println("The name of big cat " + bigCat.getName());
        System.out.println("The name of small cat " + smallCat.getName());
    }
}
