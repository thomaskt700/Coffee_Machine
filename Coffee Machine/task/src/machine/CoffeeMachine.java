package machine;
import java.util.Scanner;
public class CoffeeMachine {
    static int water = 400;
    static int milk = 540;
    static int beans = 120;
    static int cups = 9;
    static int money = 550;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write action (buy, fill, take, remaining, exit):");

        label:
        while (sc.hasNext()) {
            String action = sc.nextLine();
            switch (action) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String typeOfCoffee = sc.nextLine();
                    switch (typeOfCoffee) {
                        case "1":
                            buyEspresso();

                            break;
                        case "2":
                            buyLatte();

                            break;
                        case "3":
                            buyCappuccino();

                            break;
                        case "back":
                            continue;
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water do you want to add:");
                    int addWater = sc.nextInt();
                    water = water + addWater;

                    System.out.println("Write how many ml of milk do you want to add:");
                    int addMilk = sc.nextInt();
                    milk = milk + addMilk;

                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    int addBeans = sc.nextInt();
                    beans = beans + addBeans;

                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    int addCups = sc.nextInt();
                    cups = cups + addCups;


                    break;
                case "take":
                    takeOut();

                    break;
                case "remaining":
                    coffeeCheck();

                    break;
                case "exit":
                    break label;
            }
        }
    }

    public static void coffeeCheck() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");
    }

    public static void buyEspresso() {
        water -= 250;
        beans -= 16;
        cups -= 1;
        money += 4;
        if (water < 0) {
            water +=250;
            beans += 16;
            cups += 1;
            money -= 4;
            System.out.println("Sorry, not enough water!");
        } else if (beans < 0) {
            water +=250;
            beans += 16;
            cups += 1;
            money -= 4;
            System.out.println("Sorry, not enough coffee beans!");
        } else if (cups < 0) {
            water +=250;
            beans += 16;
            cups += 1;
            money -= 4;
            System.out.println("Sorry, not enough cups!");
        } else {
            System.out.println("I have enough resources, making you a coffee!");
        }
    }

    public static void buyLatte() {
        water -= 350;
        milk -= 75;
        beans -= 20;
        cups -= 1;
        money += 7;
        if (water < 0) {
            water += 350;
            milk += 75;
            beans += 20;
            cups += 1;
            money -= 7;
            System.out.println("Sorry, not enough water!");
        } else if (milk < 0) {
            water += 350;
            milk += 75;
            beans += 20;
            cups += 1;
            money -= 7;
            System.out.println("Sorry, not enough milk!");
        } else if (beans < 0) {
            water += 350;
            milk += 75;
            beans += 20;
            cups += 1;
            money -= 7;
            System.out.println("Sorry, not enough coffee beans!");
        } else if (cups < 0) {
            water += 350;
            milk += 75;
            beans += 20;
            cups += 1;
            money -= 7;
            System.out.println("Sorry, not enough cups!");
        } else {
            System.out.println("I have enough resources, making you a coffee!");
        }
    }

    public static void buyCappuccino() {
        water -= 200;
        milk -= 100;
        beans -= 12;
        cups -= 1;
        money += 6;
        if (water < 0) {
            water += 200;
            milk += 100;
            beans += 12;
            cups += 1;
            money -= 6;
            System.out.println("Sorry, not enough water!");
        } else if (milk < 0) {
            water += 200;
            milk += 100;
            beans += 12;
            cups += 1;
            money -= 6;
            System.out.println("Sorry, not enough milk!");
        } else if (beans < 0) {
            water += 200;
            milk += 100;
            beans += 12;
            cups += 1;
            money -= 6;
            System.out.println("Sorry, not enough coffee beans!");
        } else if (cups < 0) {
            water += 200;
            milk += 100;
            beans += 12;
            cups += 1;
            money -= 6;
            System.out.println("Sorry, not enough cups!");
        } else {
            System.out.println("I have enough resources, making you a coffee!");
        }
    }

    public static void takeOut() {
        System.out.println("I gave you $" + money);
        money -= money;
    }
}