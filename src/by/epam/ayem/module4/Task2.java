package by.epam.ayem.module4;

/*2. Создайте класс Task2 c двумя переменными. Добавьте конструктор с входными параметрами.
    Добавьте конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и -get
    методы для полей экземпляра класса.*/

public class Task2 {

    private int var1;
    private int var2;

    public Task2(int var1, int var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    public Task2() {
    }

    public int getVar1() {
        return var1;
    }

    public void setVar1(int var1) {
        this.var1 = var1;
    }

    public int getVar2() {
        return var2;
    }

    public void setVar2(int var2) {
        this.var2 = var2;
    }
}
