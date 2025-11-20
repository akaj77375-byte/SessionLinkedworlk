package models;

public class Student {
    private long id;
    private String fullName;
    private int age;
    private String nameGroup;
    private double price;

    public Student() {
    }

    public Student(long id, String fullName, int age, String nameGroup, double price) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.nameGroup = nameGroup;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", nameGroup='" + nameGroup + '\'' +
                ", price=" + price +
                '}';
    }
}
