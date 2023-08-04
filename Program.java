import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * В класс Beverage добавить поле объем (double volume), а в класс Food - масса
 * (double weight),
 * добавить заполнение в конструктор, добавтиь их в вывод toString()
 * Создать наследника класса Beverage ГорячийНапиток с дополнительным полем int
 * температура.
 * Создать класс ГорячихНапитковАвтомат наследник от класса ТорговыйАвтомат и
 * реализовать перегруженный метод getProduct(String name, int volume, int
 * temperature),
 * выдающий продукт соответствующий имени, объёму и температуре
 * В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат
 * и
 * воспроизвести логику, заложенную в программе
 */

public class Program {
    public static void main(String[] args) {

        ArrayList<Product> myList = new ArrayList<>();

        Product prod1 = new Food("twix", 2, 5, new GregorianCalendar(2023, 8, 19), 25.5);
        Product prod2 = new Food("twix", 2, 5, new GregorianCalendar(2023, 8, 19), 25.5);
        Product prod3 = new Food("baunty", 3, 4, new GregorianCalendar(2023, 9, 14), 100.5);
        Product prod4 = new Food("sneck", 4, 2, new GregorianCalendar(2023, 11, 25), 75);
        Product prod5 = new Beverages("cola", 3, 1, new GregorianCalendar(2024, 9, 14), 0.5);
        Product prod6 = new Beverages("sprite", 3, 2, new GregorianCalendar(2024, 5, 25), 0.5);
        myList.add(prod1);
        myList.add(prod2);
        myList.add(prod3);
        myList.add(prod4);
        myList.add(prod5);
        
        List<Product> myList2 = new ArrayList<>();
        Product drink1 = new HotDrinks("d'ore", 4, 2, new GregorianCalendar(2023, 8, 25), 250, 75);
        Product drink2 = new HotDrinks("lipton", 1, 2, new GregorianCalendar(2023, 7, 28), 250, 80);
        Product drink3 = new HotDrinks("white hot chocolate", 2, 1, new GregorianCalendar(2023, 7, 27), 300, 75);
        Product drink4 = new HotDrinks("cofee", 3, 1, new GregorianCalendar(2023, 7, 28), 250, 85);
        Product drink5 = new HotDrinks("white tea", 2, 4, new GregorianCalendar(2023, 7, 28), 250, 87);
        myList2.add(drink1);
        myList2.add(drink2);
        HotDrinksAutomat list2 = new HotDrinksAutomat();
        list2.initProducts(myList2);

        Automat list = new Automat();
        list.initProducts(myList);

        //HW4
        /*
         * Создать сервис добавления продуктов в Автомат (интерфейс). 
         * Сервис должен содержать метод, принимающий на вход автомат и продукт, 
         * добавляющий продукт в автомат. С помощью обобщения добейтесь того, 
         * чтобы в обычный автомат можно было добавлять еду или напитки, 
         * а в автомат с горячими напитками - горячие напитки
         */
        ServiceAutomat servAutom = new ServiceAutomat();
        servAutom.replenishment(list, prod6);
        System.out.println(list.toString());
        /*
         * добавление в автомат с горячими напитками
         */
        servAutom.replenishment(list2, drink3);
        servAutom.replenishment(list2, drink4); 
        servAutom.replenishment(list2, drink5);
        System.out.println(list2.toString()); 

        ///////////////////HW3
        /*
         * возможность сравнивать их по некоторым критериям 
         * (можно сделать пользовательский интерфейс и спрашивать у пользователя по чему отсортировать 
         * (по весу, объему, температуре))
         */
        // User user = new User();
        // user.choise();
        // user.comparingChoise(user.userCh(4), myList, myList2);
        // System.out.println(prod1.compareTo(prod4));  //сравнение по стоимости


        //////////////////////HW3
        // Human tatiana = new Human("Тatiana", false, false, 120);
        // tatiana.setNearestAutomat(list);
        // System.out.println("Buyer in the Vending Machine, " + tatiana.toString());
        // System.out.println();

        // System.out.println("Available in the Vending Machine: " + list.toString());
        // System.out.println();

        // List<String> buyerList = new ArrayList<>();
        // buyerList.add("baunty");
        // buyerList.add("coffee");
        // System.out.println(tatiana.makeOrder(buyerList, list, tatiana));
        // System.out.println("Buyer " + tatiana.toString());

        // System.out.println();
        // System.out.println("Remainder: " + list.toString());
        ////////////////////////
    }
}
