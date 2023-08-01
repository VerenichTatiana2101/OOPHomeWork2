
import java.util.List;
import java.util.Scanner;

public class User {

    @Override
    public String toString() {
        return "User []";
    }

    public int userCh(int userCh) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Выберите от 1 до 5: ");
            while (!input.hasNextInt()) {
                System.out.println("Ошибка! Введите число: ");
                input.next();
            }
            int userChoise = input.nextInt();
            return userChoise;
        }
    }

    public void choise() {
        System.out.println("Выберите, по каким критериям хотите отсортировать продукты\n"
                + "1 - по стоимости\n"
                + "2 - по количеству\n"
                + "3 - продукты по весу\n"
                + "4 - горячие напитки по объёму\n"
                + "5 - горячие напитки по температуре\n");
    }

    public void comparingChoise(int userChoise, List<Product> myList, List<HotDrinks> myList2) {
        switch (userChoise) {
            case 1:
                myList.sort(new PriceComparator());
                System.out.println(myList);
                break;
            case 2:
                myList.sort(new QuantityComporator());
                System.out.println(myList);
                break;
            // case 3:
            //     compareToWeight(myList);
            //     break;
            case 4:
                myList2.sort(new VolumeComporator());
                System.out.println(myList2);
                break;
            case 5:
                myList2.sort(new TemperatureComporator());
                System.out.println(myList2);
                break;
            default:
                System.out.println("Error! Please, enter a number from 1 to 5.");
        }
    }

}
