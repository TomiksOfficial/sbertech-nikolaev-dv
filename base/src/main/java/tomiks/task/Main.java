package tomiks.task;
/*
    Решение задач раздела Base
*/

import tomiks.task.three.Task;

public class Main {
    public static void main(String[] args) {
        /*
            Выполнение задания 1
         */
        System.out.println("-- First Task --");
        tomiks.task.one.Task.doTask();

        /*
            Выполнение задания 2
         */
        System.out.println("-- Second Task --");
        tomiks.task.two.Task.doTask();

        /*
            Выполнение задания 3
         */
        System.out.println("-- Third Task --");
        Task.doTask();

        /*
            Выполнение задания 4 | Передаются высота и ширина по звёздочкам
         */
        System.out.println("-- Fourth Task --");
        tomiks.task.four.Task.doTask(3, 5);
    }
}