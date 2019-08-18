package programms;

/**
 * Вызываются ли конструкторы родителей при наследовании? - Да.
 */
public class ClassesABC {

    public static void main(String[] args) {

        ClassC c = new ClassC();

        System.out.println(String.format("a=%d b=%d c=%d", c.a, c.b, c.c));

    }

}

class ClassA {
    int a;
    ClassA() {
        System.out.println("Конструктор А");
        this.a = 1;
    }
}

class ClassB extends ClassA {
    int b;
    ClassB() {
        System.out.println("Конструктор B");
        this.b = 2;
    }
}

class ClassC extends ClassB {
    int c;
    ClassC() {
        System.out.println("Конструктор C");
        this.c = 3;
    }
}
