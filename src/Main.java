//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(0);
        System.out.println(1);
        System.out.println(2);

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        printUpTo(33);
    }

    public static void printUpTo(int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(num);
        }
    }
}