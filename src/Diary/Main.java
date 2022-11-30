//package Diary;
//
//import java.util.Scanner;
//
//public class Main {
//    private static final   Diary diary = new Diary(password);
//    private static final Scanner scanner = new Scanner(System.in);
//    public static void main(String[] args) {
//
//        String mainMain = """
//                welcome to my Diary!!!
//                let's setup it up
//
//                """;
//
//        System.out.println(mainMain);
//        print("Enter your name");
//        String userNAme = scanner.nextLine();
//        print("enter password");
//        String password = scanner.nextLine();
//        Diary diary = new Diary(userNAme, password);
//        print("diary created fr "+ userNAme);
//        System.out.println();
//        displayDiaryMenu();
//
//
//    }
//
//    private static void getTotalNumberOfEnteries(){
//
//    }
//    private static void findById(){
//        String id = input("enter the id for the entery you want to find ");
//        Entry foundEntry = diary.findEntryWithId(Integer.parseInt(id));
//        print(foundEntry.toString());
//        displayDaryMenu();
//    }
//
//    private static  void displayDiaryMenu(){
//        String diaryMenu= """
//                press 1 --> create Entry
//                press 2 --> Find Entry by id
//                press 3 --> get total number of enteries
//                press 4 --> lock diary
//                """;
//        String
//    }
//    private static void displayDiaryMenu() {
//        String mainMain= """
//                press
//                press 1 --> unlock Diary
//                press 2 --> Lock Diary
//                press 3 --> exit
//                """;
//        String userInput = input(mainMain);
//        switch (Integer.parseInt(userInput)) {
//            case 1: unlockDiary();
//            break;
//            case 2: lockDiary();
//            break;
//            case 3 : exitApplication();
//            default:
//        }
//    }
//
//    private static void exitApplication() {
//        print("thank you for using our app");
//        System.exit(0);
//    }
//
//    private static void lockDiary() {
//    }
//
//    private static void unlockDiary() {
//
//        String password = input("enter th correct password");
//        diary.unlockWith(password);
//        if (diary.isLocked()){
//            print("wrong password ");displayDiaryMenu();
//        }
//    }
////private  static void createEntry(){
////        String title = input("enter title for the entery");
////        String body = input("enter body for the entry");
////        diary.
////}
//
//    private  static  String input(String prompt){
//        print(prompt);
//        System.exit(0);
//        return scanner.nextLine();
//    }
//    private static void print(String prompt){
//        System.out.println(prompt);
//    }
//}
