package base.task;
/*
    Решение задач раздела Base
*/

public class Main {
    public static void main(String[] args) {
        /*
            Выполнение задания 1
         */
        System.out.println("-- First Task --");
        base.task.one.Task.doTask();

        /*
            Выполнение задания 2
         */
        System.out.println("-- Second Task --");
        base.task.two.Task.doTask();

        /*
            Выполнение задания 3
         */
        System.out.println("-- Third Task --");
        base.task.three.Task.doTask();

        /*
            Выполнение задания 4 | Передаются высота и ширина по звёздочкам
         */
        System.out.println("-- Fourth Task --");
        base.task.four.Task.doTask(3, 5);
    }
}