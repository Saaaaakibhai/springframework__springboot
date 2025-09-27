package org.hasan;

public class Dev {
    int age;
    Laptop laptop;
    public Dev(){
        System.out.println("Dev Constructor");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void build(){
        System.out.println("Working on it from the dev");
        laptop.compile();
    }
}
