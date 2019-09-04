package by.epam.ayem.module4;

/*1.Создайте класс Task1 c двумя переменными. Добавьте метод вывода на экран и методы
изменения этих переменных. Добавьте метод, который находит суммму значений этих переменных,
и метод, который находит наибольшее значение из этих двух переменных.*/

/*2. Создайте класс Task2 c двумя переменными. Добавьте конструктор с входными параметрами.
Добавьте конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и -get
методы для полей экземпляра класса.*/

public class AppRunner {

    public static void main(String[] args) {

        Task1 task1 = new Task1();

        Task2 task2 = new Task2();
        Task2 task3 = new Task2(5, 4);

        task1.printVar();
        task1.sum();
        task1.biggerVar();
        task1.setVar1(8);
        task1.setVar2(6);

        task2.setVar1(2);
        task2.setVar2(5);
        task2.getVar1();
        task2.getVar2();
    }
}
