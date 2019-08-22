package by.epam.ayem.main;

/*1.Создайте класс Task1 двумя переменными.Добавьте метод вывода на экран и методы
изменения этих переменных.Добавьте метод,который находит суммму значений этих переменных,
и метод,который находит наибольшее значение из этих двух переменных.*/

public class Task1 {

    private int var1;
    private int var2;

    public void printVar() {

        System.out.println("Variable 1 = " + var1);
        System.out.println("Variable 2 = " + var2);
    }

    public void setVar1(int var1) {
        this.var1 = var1;
    }

    public void setVar2(int var2) {
        this.var2 = var2;
    }

    public void sum() {

        int sum = var1 + var2;

        System.out.println("Sum of variables = " + sum);
    }

    public void biggerVar() {

        if (var1 > var2) {
            System.out.println("The bigger variable is " + var1);
        } else if (var2 > var1) {
            System.out.println("The bigger variable is " + var2);
        } else {
            System.out.println("Variables " + var1 + " and " + var2 + " are equal");
        }
    }
}
