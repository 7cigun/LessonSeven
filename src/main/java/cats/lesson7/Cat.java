package cats.lesson7;

import java.util.Random;

public class Cat {
    private String nameOfCat;
    private int massOfCat;
    private int appetite;
    private boolean satiety;

    Random burnCalories = new Random();

    public Cat(String nameOfCat, int massOfCat) {
        this.nameOfCat = nameOfCat;
        this.massOfCat = massOfCat;
        this.satiety = false;
    }

    public int metabolism() {
        appetite = burnCalories.nextInt(this.massOfCat) + 1;
        return appetite;
    }

    public int getAppetite() {
        return appetite = metabolism();
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public String getNameOfCat() {
        return nameOfCat;
    }

    public boolean isWellFed() {
        return this.appetite == 0;
    }

    public void eat(Plate plate) {
        if (plate.getMouseCount() >= appetite) {
            plate.eatMouse(appetite);
            appetite = 0;
        } else {
            appetite -= plate.getMouseCount();
            plate.setMouseCount(0);
        }
    }
}
