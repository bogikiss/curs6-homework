public class Main {
    public static void main(String[] args) {
        //ex 2
        Person person1 = new Person("Anna", 30, true);
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Married: " + person1.isMarried());

        Person person2 = new Person("Eric", 18, false);
        System.out.println("Name: " + person2.getName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Married: " + person2.isMarried());

        Person person3 = new Person("Maria", 25, false);
        System.out.println("Name: " + person3.getName());
        System.out.println("Age: " + person3.getAge());
        System.out.println("Married: " + person3.isMarried());

        System.out.println("---------------------------");
        // ex 4
        Product blackStilettos = new Product("Black stilettos", 269.99, 52, "Pumps");
        System.out.println("Product name: " + blackStilettos.getName());
        System.out.println("Price: " + blackStilettos.getPrice() + " RON");
        System.out.println("Quantity: " + blackStilettos.getQuantity());
        System.out.println("Category: " + blackStilettos.getCategory());
        System.out.println("On stock: " + blackStilettos.hasStock());
        System.out.println("Is category: " + blackStilettos.isCategory("Boots"));

        Product brownAnkleBoots = new Product("Brown ankle boots", 344.99, 60, "Boots");
        System.out.println("Product name: " + brownAnkleBoots.getName());
        System.out.println("Price: " + brownAnkleBoots.getPrice() + " RON");
        System.out.println("Quantity: " + brownAnkleBoots.getQuantity());
        System.out.println("Category: " + brownAnkleBoots.getCategory());
        System.out.println("On stock: " + brownAnkleBoots.hasStock());
        System.out.println("Is category: " + brownAnkleBoots.isCategory("Boots"));

        Product nudeStilettos = new Product("Nude stilettos", 269.99, 27, "Pumps");
        System.out.println("Product name: " + nudeStilettos.getName());
        System.out.println("Price: " + nudeStilettos.getPrice() + " RON");
        System.out.println("Quantity: " + nudeStilettos.getQuantity());
        System.out.println("Category: " + nudeStilettos.getCategory());
        System.out.println("On stock: " + nudeStilettos.hasStock());
        System.out.println("Is category: " + nudeStilettos.isCategory("Boots"));

        System.out.println("---------------------------");
        // ex 5
        Bottle newBottle = new Bottle(1000, 600, true);
        //System.out.println(newBottle.openBottle());
        //System.out.println(newBottle.closeBottle());
        System.out.println(newBottle.drink(200));
    }
}