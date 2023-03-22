package interfaceTest;

public class Person implements Animal1, Animal2{
    private int Age = 1;

    public void eat() {
        System.out.println("I am eating");
    }

    public void sleep() {
        System.out.println("I am sleeping");
    }

    public void growUp(int year) {
        Age += year;
    }

    public int getAge() {
        return Age;
    }

}
