import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter name: ");
        String name = sc.nextLine();

        System.out.println(" enter age: ");
        int age = sc.nextInt();

        System.out.println("enter your CGPA: ");
        double CGPA = sc.nextDouble();

        System.out.println("enter your phn: ");
        long phn = sc.nextLong();

        System.out.println("do you like mango or not? ");
        boolean mango = sc.nextBoolean();

        System.out.println("enter your favourite alphabet: ");
        char alphabet = sc.next().charAt(0);

        System.out.println(name + " " + age + " " + CGPA + " " + phn + " " + mango + " " + alphabet);

    }

}
