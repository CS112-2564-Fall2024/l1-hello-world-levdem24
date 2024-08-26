import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("give me a number (no decimals please!)");
        Scanner userin = new Scanner(System.in);
        int number = userin.nextInt();
        hello(number);
        userin.nextLine();
        System.out.println("what is your name?");
        String name = userin.nextLine();
        nametag nametag = new nametag(name);
        System.out.println("So, you are " + nametag.toString());
        String newName = getName(name);
        System.out.println(newName);
    }

    public static void hello(int number) {
        if (number == 1) {
            System.out.println("hello");
        } else {
            System.out.println("thats the wrong number");
        }
    }

    public static String getName(String name) {
        String newname = "hello " + name;
        return newname;
    }
}