package com.ExeceptionTests;

public class Dog {

    public String name;
    public boolean isCollarPutOn;
    public boolean isLeashPutOn;
    public boolean isMuzzlePutOn;

    public Dog(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Мухтар");
        dog.putCollar();
        dog.putMuzzle();
        try {
            dog.walk();
        } catch (DogIsNotReadyException e) {
            System.out.println(e.getMessage());
            System.out.println("" + dog.isCollarPutOn + dog.isMuzzlePutOn + dog.isLeashPutOn);
        }
    }

    public void putCollar() {
        System.out.println("Ошейник надет!");
        this.isCollarPutOn = true;
    }

    public void putLeash() {
        System.out.println("Поводок надет!");
        this.isLeashPutOn = true;
    }

    public void putMuzzle() {
        System.out.println("Намордник надет!");
        this.isMuzzlePutOn = true;
    }

    public void walk() throws DogIsNotReadyException {
        System.out.println("Собираемся на прогулку!");
        if (isCollarPutOn && isLeashPutOn && isMuzzlePutOn) {
            System.out.println("Ура, идем гулять!");
        } else {
            throw new DogIsNotReadyException("Собака не готова!");
        }
    }


}
