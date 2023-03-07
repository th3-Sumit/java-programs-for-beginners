import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animal animal;
        System.out.println("Which types of Animal you want ?");
        System.out.println("(1)- dog and (2)- cat : ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if (choice == 1){
            animal = new Dog();
            animal.speak();
        } else if (choice == 2) {
            animal = new Cat();
            animal.speak();

        }
        else {
            animal = new Animal();
            animal.speak();
        }


    }
}