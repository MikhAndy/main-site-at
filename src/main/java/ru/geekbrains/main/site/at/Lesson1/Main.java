package ru.geekbrains.main.site.at.Lesson1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Object[] obstacleCourse = new Object[5];
        for (int i = 0; i < obstacleCourse.length; i++) {
            if (i % 2 < 1) {
                obstacleCourse[i] = createRoad();
            } else obstacleCourse[i] = createWall();
        }
        System.out.println("---------------------------------------------------------------------");

        Actions[] competitors = new Actions[3];
        for (int i = 0; i < competitors.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Выберите, какого участника создать");
            System.out.println("1 - Кот");
            System.out.println("2 - Человек");
            System.out.println("3 - Робот");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    competitors[i] = createCat();
                    System.out.println();
                    break;
                case 2:
                    competitors[i] = createHuman();
                    System.out.println();
                    break;
                case 3:
                    competitors[i] = createRobot();
                    System.out.println();
                    break;
            }
        }

        for (int i = 0; i < competitors.length; i++) {
            for (int j = 0; j < obstacleCourse.length; j++) {
                if (j % 2 < 1) {
                    int road = ((Road)obstacleCourse[j]).getLength();
                    competitors[i].Run(road);
                } else {
                    float wall = ((Wall)obstacleCourse[j]).getHeight();
                    competitors[i].Jump(wall);
                }
            }
        }
    }

    private static Robot createRobot() {
        int run = (int) (150 + Math.random()*350);
        float jump = (float) (Math.random()*(2-1)+1);
        Robot robot = new Robot(run, jump);
        System.out.println("Робот с характеристиками: бег - " + robot.getRun() + " прыжок - " + robot.getJump());
        return robot;
    }

    private static Human createHuman() {
        int run = (int) (20 + Math.random()*180);
        float jump = (float) (Math.random()*(1.5-0.3)+0.3);
        Human human = new Human(run, jump);
        System.out.println("Человек с характеристиками: бег - " + human.getRun() + " прыжок - " + human.getJump());
        return human;
    }

    private static Cat createCat() {
        int run = (int) (100 + Math.random()*300);
        float jump = (float) (Math.random()*(3-1)+1);
        Cat cat = new Cat(run, jump);
        System.out.println("Кот с характеристиками: бег - " + cat.getRun() + " прыжок - " + cat.getJump());
        return cat;
    }

    private static Wall createWall() {
        Random random = new Random();
        Wall wall = new Wall(((float) Math.random()*(3-1)+1));
        System.out.println("Wall: " + wall.getHeight());
        return wall;
    }

    private static Road createRoad() {
        Random random = new Random();
        Road road = new Road(random.nextInt(300)+10);
        System.out.println("Treadmill: " + road.getLength());
        return road;
    }
}
