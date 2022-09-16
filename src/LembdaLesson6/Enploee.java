package LembdaLesson6;

public class Enploee {
    static int workersCounter = 70;
    private String name;
    private int age;
    private int tabNum;
    private int depId;
    private int salary;
    private int rating;

    public int getDepId() {
        return depId;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Enploee(String name, int depId) {
        this.name = name;
        this.depId = depId;
        workersCounter++;
        this.tabNum = workersCounter;
    }
    public  String getFormat(NameFormatter<String>formatter) {
        return formatter.makeFormat(this.name, Integer.toString(this.tabNum));
    }
}
