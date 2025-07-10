public class Human {
    private int age;
    private String name;
    private final String className = "Human"; // no getter setter methods for final

    // getter: return setter: assign
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
