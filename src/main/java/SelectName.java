import java.util.Scanner;

public class SelectName {

    public static void artem(){
        System.out.println("Привет");
    }

    public static void name(){
        System.out.print("Сколько будет 5+5:");

        Scanner in = new Scanner(System.in);
        String myName = in.nextLine();

        if(myName.equals("10")) {
            System.out.print("Молодец " + myName + " - всё правильно!");
        } else if (myName.equals("5")){
            System.out.print("Почти " + myName + " - ты немного ошибся!");
        } else if (myName.equals("0")){
            System.out.print("Почти " + myName + " - ты маленько ошибся!");
        } else System.out.print(myName + " - Неправильно ");
    }
}
