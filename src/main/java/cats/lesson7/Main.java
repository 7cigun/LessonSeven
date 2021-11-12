package cats.lesson7;

import java.util.Scanner;

public class Main {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Cat cat1 = new Cat("Шарик", 15);
        Cat cat2 = new Cat("Пушок", 2);
        Cat cat3 = new Cat("Циклоп", 5);

        Cat[] cats = {cat1, cat2, cat3};

        Plate bigPlate = new Plate();

        do {
            bigPlate.setMouseCount(bigPlate.catchMouse());
            bigPlate.printFoodInfo();
            System.out.println();


            for (Cat cat : cats) {
                String catName = cat.getNameOfCat();
                int app = cat.metabolism();
                System.out.println(catName + " нагулял аппетит на " + app + " " + Spell.mouses(app));

                cat.eat(bigPlate);

                System.out.println(catName + " подошел к миске");
                System.out.println("В миске осталось " + bigPlate.getMouseCount());

                if (cat.isWellFed()) {
                    System.out.println(catName + " сыт и запрыгнул на Вас!");
                } else {
                    System.out.println(catName + " голоден и просит еды!");
                }
                System.out.println();
            }
        } while (continueHunt());
    }

    private static boolean continueHunt() {
        System.out.println("Половите еще мышей? y\\n");
        return switch (in.next()) {
            case "y", "yes", "да", "д" -> true;
            default -> false;
        };
    }


}



