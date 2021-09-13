import java.util.Scanner;


public class Main {

    Counter counter = new Counter();
    Scanner scanner = new Scanner(System.in);
    Scanner intScanner = new Scanner(System.in);

    public static void main(String[] args) {

        Main main = new Main();
        main.ShowMenu();
    }

    void ShowMenu() {

        String userInput = "";
        int start;
        int stop;

        do {
            System.out.println("Welcome to Counter, please choose input: ");
            System.out.println("1.Count Up:");
            System.out.println("2.Count Down:");
            System.out.println("Enter Quit to end program...");
            System.out.println("Choose number");
            userInput = scanner.nextLine();


            switch (userInput) {
                case "Quit":
                    System.out.println("Exiting program...");
                    break;
                case "1":
                    countUp();
//                    System.out.println("Enter start number");
//                    start = intScanner.nextInt();
//                    System.out.println("Enter stop number");
//                    stop = intScanner.nextInt();
//                    counter.countUp(start, stop);
                    break;
                case "2":
                    System.out.println("Enter start number");
                    start = intScanner.nextInt();
                    System.out.println("Enter stop number");
                    stop = intScanner.nextInt();
                    counter.countDown(start, stop);
                    break;
                default:
            }
        } while (!userInput.equalsIgnoreCase("Quit"));
    }
    void countUp() {
        int start;
        int stop;
        System.out.println("Enter start number");
        start = intScanner.nextInt();
        System.out.println("Enter stop number");
        stop = intScanner.nextInt();
        counter.countUp(start, stop);
    }

//    void ShowMenu() {
//        Scanner scanner = new Scanner(System.in);
//        String userInput = "";
//
//        do {
//            System.out.println("\nWelcome to the counter, please choose activity: ");
//            System.out.println("1.Count Up");
//            System.out.println("2.Count Down");
//            System.out.println("\nEnter Quit to end program...");
//            System.out.println("Choose a number: ");
//            userInput = scanner.nextLine();
//
//            switch(userInput) {
//                case "Quit":
//                    System.out.println("Exiting Application...");
//                    break;
//                case "1":
//                    counter.countUp(12,10);
//                    break;
//                case "2":
//                    counter.countDown(9, 3);
//                    break;
//                default:
//                    break;
//
//            }
//        } while (!userInput.equalsIgnoreCase("Quit"));
//
//    }



}
