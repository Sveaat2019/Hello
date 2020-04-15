package ru.geekbrains.java_one.lesson_d.online.HomeWork4;

import java.util.Arrays;

public class HomeWork4 {

    public static void main(String[] args) {

        double aver = 0, salaryS = 0;
        int ageS = 0;

        AnEmployee man = new AnEmployee("Антонов Антон Антонович", 30_000.00, 29);



        System.out.printf("Имя: %s%n Оклад: %.2f%n возраст: %d%n", man.getName(), man.getSalary(), man.getAge());

        System.out.print("----------------------------------------------\n");


        AnEmployee [] people = new AnEmployee[5];
        people [0] = man;
        people [1] = new AnEmployee("Александров Александр Александрович", 33_000.00, 37);
        people [2] = new AnEmployee("Николаева Олеся Ивановна", 28_000.00, 45);
        people [3] = new AnEmployee("Семенов Семен Семенович", 64_000.00, 58);
        people [4] = new AnEmployee("Васильев Василий Васильевич", 22_000, 24);

        System.out.println("Сотрудники старше 40:");

        for (int i = 0; i < people.length; i++)
        {
            if (people [i].getAge() > 40) {

                System.out.printf("\n\n Имя: %s%n Оклад: %.2f%n возраст: %d%n%n", people[i].getName(), people[i].getSalary(), people[i].getAge());
                bonus(people[i]);
                System.out.printf("После повышения зарплата составляет: %.2f", people[i].getSalary());
            }



            aver += (people[i].getAge() + people[i].getSalary())/people.length;


        }
            System.out.println("\n\n ------------------------------");

            System.out.printf("Среднее арифметическое зарплаты и возраста составляет: %.2f%n", aver);
    }

    public static void bonus(AnEmployee a)
    {
        a.setSalary(5000) ;
    }




}
