package BiFunction;

import java.util.function.BiFunction;

public class Person {
    String name;
    int age;
    double salary;

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalalry() {
        return salary;
    }

    public void setSalalry(double salalry) {
        this.salary = salalry;
    }

    public static BiFunction<Person, Person, Integer> compareSalary = (p1, p2) -> {
        if (p1.getSalalry() > p2.getSalalry())
            return -1;
        else if (p1.getSalalry() > p2.getSalalry())
            return 1;
        else
            return 0;

    };
}
