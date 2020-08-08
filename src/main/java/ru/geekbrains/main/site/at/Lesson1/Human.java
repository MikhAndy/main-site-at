package ru.geekbrains.main.site.at.Lesson1;

public class Human implements Actions {

    private int run;
    private float jump;

    public Human(int run, float jump) {
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
            System.out.println("Человек пробежал");
        } else System.out.println("Человек не пробежал");
    }

    public void Jump(float height) {
        if (height < this.jump) {
            System.out.println("Человек перепрыгнул");
        } else System.out.println("Человек не перепрыгнул");
    }
}
