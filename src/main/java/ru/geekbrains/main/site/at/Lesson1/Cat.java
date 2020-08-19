package ru.geekbrains.main.site.at.Lesson1;

public class Cat implements Actions {

    private int run;
    private float jump;

    public Cat(int run, float jump) {
        this.run = run;
        this.jump = jump;
    }

    public int getRun() {
        return run;
    }

    public float getJump() {
        return jump;
    }

    public void Run(int length) {
        if (length < this.run) {
            System.out.println("Кот пробежал");
        } else System.out.println("Кот не пробежал");
    }

    public void Jump(float height) {
        if (height < this.jump) {
            System.out.println("Кот перепрыгнул");
        } else System.out.println("Кот не перепрыгнул");
    }
}
