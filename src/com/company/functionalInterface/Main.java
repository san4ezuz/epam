package com.company.functionalInterface;

/**
 * Create a functional interface and use it with lambda.
 */
public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();

        System.out.println(dog);

        Settable<Dog> settable = (obj, name, age) -> {
            obj.setName(name);
            obj.setAge(age);
        };

        changeEntity(dog, settable);

        System.out.println(dog);
    }

    private static <T extends WithNameAndAge> void changeEntity(T entity, Settable<T> s) {
        s.set(entity, "Tomas", 3);
    }
}
