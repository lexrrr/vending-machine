import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int Food = runMenu();
        int Price = Pricee(Food);
        int change = moneyInserted(Price);
        sdacha(change);
    }

    public static int runMenu(){
        Scanner keyboard = new Scanner(System.in);
        int choice = 0 ;
        System.out.println("\n\nВыберитие товар:"
                + "\n1: Сникерс \t 125"
                + "\n2: Кола \t 130"
                + "\n3: Доритос \t 150"
                + "\n4: Пепси \t 185"
                + "\n5: Exit ");
        choice = keyboard.nextInt();
        return choice;
    }

    public static int Pricee(int menuChoice){
        if (menuChoice == 1)
            return 125;
        if (menuChoice == 2)
            return 130;
        if (menuChoice == 3)
            return 150;
        if (menuChoice == 4)
            return 185;
        else return 0;
    }

    public static int moneyInserted(int Price){
        Scanner keyboard = new Scanner(System.in);
        int money = 0;
        System.out.println("Ваша покупка: " + Price + " Пожалуйтса введите монеты:");
        money = keyboard.nextInt();
        while (money < Price){
            System.out.println("Введите достаточное количество денег");
            money = money + keyboard.nextInt();
        }
        return money - Price ;
    }

    public static void sdacha(int change){
        int dvatsatka = 0;
        int desyatka = 0;
        int pyaterka = 0;
        while (change >= 25){
            dvatsatka = dvatsatka + 1;
            change = change - 25;
        }
        while (change >= 10){
            desyatka = desyatka + 1;
            change = change - 10;
        }
        while (change >= 5){
            pyaterka = pyaterka + 1;
            change = change - 5;
        }

        System.out.printf("\nВаша сдача:\n%d четвертаки, %d Десятки, %d пятаки и %d центы!",
                dvatsatka, desyatka, pyaterka, change);
    }
}