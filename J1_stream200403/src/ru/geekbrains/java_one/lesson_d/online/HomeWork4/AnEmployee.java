package ru.geekbrains.java_one.lesson_d.online.HomeWork4;

public class AnEmployee {

        private String name;
        private double salary;
        private int age;
        private static int numberId = 1;
        private int id;

        public AnEmployee(String name, double salary, int age)
        {
            this.name = name;
            this.salary = salary;
            this.age = age;
             id = 0;
             setId();
         }


         public String getName()
         {
             return name;
         }

         public double getSalary()
         {
             return salary;
         }

         public void setSalary(int a)
         {
             salary += a;
         }


         public int getAge()
         {
             return age;
         }

 /*        public void bonus()
         {
             salary = salary + 5000;
         }
*/
         public int getId()
         {
             return id;
         }

         public void setId()
         {
             id = numberId;
             numberId++;
         }
}
