import java.util.Scanner;

public class SelectName {

    public static void artem(){
        System.out.println("Привет Артём!");
    }

    public static void milana(){
        System.out.println("Привет Милана!");
    }

    public static void name(){
        System.out.print("Введите ваше имя: ");

        Scanner in = new Scanner(System.in);
        String myName = in.nextLine();

        if(myName.equals("Люся")) {
            System.out.print("Привет " + myName + " - Супер кошка!");
        } else if (myName.equals("Милана")){
            System.out.print("Привет " + myName + " - позови Артёма!");
        } else if (myName.equals("Артём")){
            System.out.print("Привет " + myName + " - позови Женю!");
        } else System.out.print(myName + " - Приятно познакомиться!!!");
    }
}
