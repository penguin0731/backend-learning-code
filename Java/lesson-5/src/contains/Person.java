package contains;

public class Person {
    private String name;
    private Eyes eyes = new Eyes("brown"); // 人和眼睛 --> 组合关系

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void sayMyEyes() {
        System.out.println("My eyes are " + eyes.getPupilColor() + ".");
    }
}
