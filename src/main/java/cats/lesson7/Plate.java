package cats.lesson7;

import java.util.Random;

public class Plate {
    private int mouseCount;

    Random catchLuck = new Random();

    public Plate() {
    }

    ;

    public Plate(int mouseCount) {
        this.mouseCount = mouseCount;
    }

    public int getMouseCount() {
        return mouseCount;
    }

    public void setMouseCount(int mouseCount) {
        this.mouseCount = mouseCount;
    }

    public void eatMouse(int catEatsMouses) {
        if (mouseCount >= catEatsMouses) {
            mouseCount -= catEatsMouses;
        } else {
            System.out.println("test");
            mouseCount = 0;
            int deficiency = catEatsMouses - mouseCount;
        }

    }

    public void printFoodInfo() {
        System.out.println("Вам удалось наловить в миску " + mouseCount + " " + Spell.mouses(mouseCount));
    }

    public int catchMouse() {
        return catchLuck.nextInt(10) + 10;
    }

}
