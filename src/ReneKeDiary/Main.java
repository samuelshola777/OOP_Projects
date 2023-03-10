//package ReneKeDiary;
//
//import javax.swing.*;
//import java.util.Scanner;
//
//public class Main {
//    private static DiaryZ diaryZ;
//    private static Scanner scanner = new Scanner(System.in);
//    private static JOptionPane JOptionpane;
//
//    private static void print(String word){
//        System.out.println(word);
//    }
//    private  static void  input(){
//        String word = scanner.nextLine();
//    }
//
//    public static void main(String[] args) {
//
//    }
//    private static void begin(){
//        String mainMain = """
//                Welcome to my diary \n
//                let's set it up
//                """;
//        print(mainMain);
//        String userName = input("Enter your name: ");
//        String password = input("Enter your password: ");
//        DiaryZ diaryz = new DiaryZ(userName, password);
//        print("Diary create for"+ userName);
//
//    }
//    private static void displayDiaryMenu() {
//        String mainMain = """
//                Press:
//                1 --> Unlock Diary
//                2 --> Lock Diary
//                3 --> exit
//                """;
//        String userInput = input(mainMain);
//        switch (Integer.parseInt(userInput)){
//            case 1-> unlockDiary();
//            case 2-> lockDiary();
//            case 3-> exitApplication();
//            default -> {
//                System.out.println("Enter a valid number");
//                displayDiaryMenu();
//            }
//        }
//    }
//
//    private static void exitApplication() {
//        print("Thanks for using our application");
//        System.exit(0);
//    }
//
//    private static void lockDiary() {
//        diaryZ.lockDiary(diaryZ.getPassword());
//        print("Diary has been locked");
//        displayDiaryMenu();
//    }
//
//    private static void unlockDiary() {
//        String password = input("Enter correct password");
//        diaryZ.unlockWithPassword(password);
//        if (diaryz.isLocked()) {
//            print("Wrong Password");
//            displayDiaryMenu();
//        }
//        else displayUnlockDiaryMenu();
//    } private static void displayUnlockDiaryMenu() {
//        String diaryMenu = """
//                Press 1 --> Create Entry
//                Press 2 --> Find Entry By Id
//                Press 3 --> get total of entries
//                Press 4 --> lock diary
//                """;
//        String userInput = input(diaryMenu + "Select an option");
//        switch (Integer.parseInt(userInput)){
//            case 1 -> unlockDiary();
//            case 2 ->lockDiary();
//            case 3 -> getTotalNumberOfEntries();
//            case 4 -> exitApplication();
//            default -> {
//                print("Enter a valid number.");
//                displayUnlockDiaryMenu();
//            }
//        }
//    }
//
//    private static void createEntry(){
//        String title = input("Enter title of the entry");
//        String message = input("Enter the message for the entry");
//        diaryZ.write(title,message);
//        print("Written successfully");
//        displayUnlockDiaryMenu();
//
//    }
//
//
//    private static   String input(String prompt){
//        return JOptionpane.showInputDialog(null, prompt);
//    }
//
//}
