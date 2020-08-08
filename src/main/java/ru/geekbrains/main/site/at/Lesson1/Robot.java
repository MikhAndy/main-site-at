package ru.geekbrains.main.site.at.Lesson1;

public class Robot implements Actions {

    private int run;
    private float jump;

    public Robot(int run, float jump) {
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
            System.out.println("Робот пробежал");
        } else System.out.println("Робот не пробежал");
    }

    public void Jump(float height) {
        if (height < this.jump) {
            System.out.println("Робот перепрыгнул");
        } else System.out.println("Робот не перепрыгнул");
    }
}
