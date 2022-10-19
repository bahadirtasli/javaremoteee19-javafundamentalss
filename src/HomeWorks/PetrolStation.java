package HomeWorks;

import java.util.*;

public class PetrolStation {
    public static void main(String[] args) {
        mainMenu(new FuelStorage());

    }

    private static Fuel[] getRandomFuels() {
        Fuel petrol1 = new Fuel();
        petrol1.setName("95 Octane");
        petrol1.setPrice((double) 1.90);

        Fuel petrol2 = new Fuel();
        petrol2.setName("98 Octane");
        petrol2.setPrice((double) 1.95);

        Fuel LPG = new Fuel();
        LPG.setName("LPG");
        LPG.setPrice((double) 1.11);

        Fuel diesel = new Fuel();
        diesel.setName("Diesel");
        diesel.setPrice((double) 1.91);


        return new Fuel[]{petrol1, petrol2, LPG, diesel};
    }

    private static void mainMenu(FuelStorage fuelStorage) {
        Scanner scanner = new Scanner(System.in);
        int mainMenuOption = displayMainMenu();

        switch (mainMenuOption) {
            case 1: // shop products
                boolean hasMoreShopping = false;
                int counter = 0;
                int fueltanklimit = 45;
                float totalPrice = 0;
                FuelTypes[] fuels = new FuelTypes[fueltanklimit]; // It can hold only 5 products

                do {
                    if (counter >= fueltanklimit) {
                        System.out.println("You can purchase up to 45 liters at a time. Please proceed to pay!");
                        break;
                    }

                    FuelTypes fuelTypes = getFuelToFuelStorage();

                    if (fuelTypes == null) {
                        mainMenu(fuelStorage);
                    } else {
                        fuels[counter] = fuelTypes;
                        fuelStorage.setFuels(fuels);
                        totalPrice += fuelTypes.getPrice();
                        fuelStorage.setTotalPrice(totalPrice);

                        System.out.println("Do you want to continue to refueling?");
                        String errorMessage = "Incorrect answer. Please enter again:";
                        boolean checker = false;

                        do {
                            if (!scanner.hasNextBoolean()) {
                                System.out.println(errorMessage);
                                scanner.next();
                            } else {
                                hasMoreShopping = scanner.nextBoolean();
                                checker = true;
                            }
                        } while (!checker);

                        if (hasMoreShopping) {
                            counter++;
                        }
                    }
                } while (hasMoreShopping);

                mainMenu(fuelStorage);
                break;
            case 2:
                fuelStorage = fuelStorageMenu(fuelStorage);
                break;
            case 3:
                System.out.println("Thanks for shopping!   ");
                break;
        }
    }

    private static int displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Petrol Station!");

        System.out.println("MAIN MENU \n----------------");
        System.out.println("1. Refueling \n2. Payment \n3. Exit");
        System.out.println("Choose an option from above:");

        return getMenuOption(3);

    }

    private static FuelTypes getFuelToFuelStorage() {
        System.out.println("FUEL MENU \n----------------");

        // To get the random products to display
        Fuel [] fuels = getRandomFuels();


        // Displaying the products
        for (int i = 0; i < fuels.length; i++) {
            System.out.println(i + ". " + fuels[i].getName());
        }

        System.out.println(fuels.length + ". " + "Exit to main menu");

        // To get option for product
        System.out.println("Choose an option from above:");
        int fuelChoice = getMenuOption(fuels.length);

        if (fuelChoice == fuels.length) {
            return null; // No product is selected
        } else {
            System.out.println("Enter liter:");
            Scanner scanner = new Scanner(System.in);
            double liter = 0;
            String errorMessage = "Incorrect liter amount! Please enter again:";

            do {
                if (!scanner.hasNextDouble()) {
                    System.out.println(errorMessage);
                    scanner.next();
                } else {
                    liter = scanner.nextDouble();

                    if (liter <= 0) {
                        System.out.println(errorMessage);
                    }
                }
            } while (liter <= 0);


            // Price calculation
            double price = fuels[fuelChoice].getPrice() * liter;

            //Creating product line for cart
            FuelTypes fuelTypes = new FuelTypes();
            fuelTypes.setFuel(fuels[fuelChoice]);
            fuelTypes.setLiter(liter);
            fuelTypes.setPrice(price);

            return fuelTypes;
        }
    }
    private static FuelStorage fuelStorageMenu(FuelStorage fuelStorage) {
        Scanner scanner = new Scanner(System.in);
        int fuelStorageMenuOption = displayFuelStorageMenu();

        switch (fuelStorageMenuOption) {
            case 1:
                int counter = 1;

                if(fuelStorage != null) {
                    for (FuelTypes fuel : fuelStorage.getFuels()) {
                        if (fuel != null) {
                            System.out.println(counter + ". " + fuel.getFuel().getName() + " : "
                                    +fuel.getLiter() + " liter = "
                                    + fuel.getPrice() + "€");
                        }

                        counter++;
                    }

                    System.out.println("Total amount : " + fuelStorage.getTotalPrice() + " € ");
                    System.out.println("Do you want to go back to the fuelStorage menu?");
                    String errorMessage = "Incorrect answer. Please enter again:";
                    boolean checker = false;
                    boolean answer = false;

                    do {
                        if (!scanner.hasNextBoolean()) {
                            System.out.println(errorMessage);
                            scanner.next();
                        } else {
                            answer = scanner.nextBoolean();
                            checker = true;
                        }
                    } while (!checker);

                    if (answer) {
                        fuelStorageMenu(fuelStorage);
                    } else {
                        boolean isPaid = isPaymentDone();

                        if (isPaid) {
                            fuelStorage = new FuelStorage();
                            mainMenu(fuelStorage);
                        } else {
                            fuelStorageMenu(fuelStorage);
                        }
                    }
                } else {
                    System.out.println("Fuel storage is empty!");
                    System.out.println("Going back to fuel storage menu...");
                    fuelStorageMenu(null);
                }

                break;
            case 2:
                if (fuelStorage.getTotalPrice() <= 0) {
                    System.out.println("Nothing to pay! Going back to Main menu..");
                    mainMenu(fuelStorage);
                } else {
                    boolean isPaid = isPaymentDone();

                    if (isPaid) {
                        fuelStorage = new FuelStorage();
                        mainMenu(fuelStorage);
                    } else {
                        fuelStorageMenu(fuelStorage);
                    }
                }

                break;
            case 3:
                mainMenu(fuelStorage);
                break;
        }

        return fuelStorage;
    }

    private static boolean isPaymentDone() {
        Scanner scanner = new Scanner(System.in);
        String errorMessage = "Incorrect answer. Please enter again:";
        boolean checker = false;
        boolean answer = false;

        System.out.println("Do you want to pay the total amount : ");

        do {
            if (!scanner.hasNextBoolean()) {
                System.out.println(errorMessage);
                scanner.next();
            } else {
                answer = scanner.nextBoolean();
                checker = true;
            }
        } while (!checker);

        if (answer) {
            System.out.println("Payment successful! Going back to Main menu....");
            return true;
        } else {
            System.out.println("Payment unsuccessful! Going back to Fuel Storage menu....");
            return false;
        }
    }

    private static int displayFuelStorageMenu() {
        System.out.println("Fuel Storage MENU \n--------------");
        System.out.println("1. Show Fuel Storage \n2. Pay \n3. Exit to main menu");
        System.out.println("Choose an option from above:");

        return getMenuOption(3);
    }

    private static int getMenuOption(int limit) {
        Scanner scanner = new Scanner(System.in);
        String errorMessage = "Incorrect option! Please enter again:";
        int option = limit + 1;

        do {
            if (!scanner.hasNextInt()) {
                System.out.println(errorMessage);
                scanner.next();
            } else {
                option = scanner.nextInt(); // correct input

                if (option > limit) {
                    System.out.println(errorMessage);
                }
            }
        } while (option > limit);

        return option;
    }

}