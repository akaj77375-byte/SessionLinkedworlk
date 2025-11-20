package models;

public class Student {
    private long id;
    private String fullName;
    private int age;
    private String nameGroup;
    private double price;

    public Student() {
    }



    public Student(String idStr, String fullName, String ageStr, String nameGroup, String priceStr) {


        try {

            this.id = Long.parseLong(idStr);
        } catch (NumberFormatException e) {
            System.out.println("Error: Id DOljen bit Chislom");
            this.id = 0;
        }

        this.fullName = fullName;


        try {
            this.age = Integer.parseInt(ageStr);
        } catch (NumberFormatException e) {
            System.out.println("Error: Vozrast  DOljen bit Chislom");
            this.age = 0;
        }

        this.nameGroup = nameGroup;


        try {
            this.price = Double.parseDouble(priceStr);
        } catch (NumberFormatException e) {
            System.out.println("Error: price DOljen bit Chislom");
            this.price = 0.0;
        }
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
