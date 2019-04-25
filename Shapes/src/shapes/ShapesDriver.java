package shapes;

import java.util.ArrayList;
import java.util.Scanner;

public class ShapesDriver {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Shape> shapes = new ArrayList<>();

        System.out.println("Welcome to the Shapes console app!");

        while (true) {
            System.out.printf(
                    "\nChoices:\n(1) Create random shape\n(2) Print all shapes\n(3) Clear shape array\n(4) Exit");
            int choice = keyboard.nextInt();
            switch (choice) {
                case 1: {
                    System.out.printf("Which shape to create?\r\n" + "(1) Rectangle\r\n" + "(2) Circle\n");
                    choice = keyboard.nextInt();
                    if (choice == 1) {
                        shapes.add(Rectangle.getRandomRectangle());
                    } else if (choice == 2) {
                        shapes.add(Circle.getRandomCircle());
                    }
                    break;
                }
                case 2: {
                    for (Shape s : shapes) {
                        System.out.println(s);
                    }
                    break;
                }
                case 3: {
                    System.out.println("Array has been cleared");
                    shapes.clear();
                    break;
                }
                case 4:
                    System.exit(0);
            }

        }

        // Loop with a switch statement to create shapes,
        // print shapes array, clear shapes array, exit program
    }
}
