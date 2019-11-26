package lab1.task3;

public class Person {
    private int age;
    private String sex;
    private String name;

    public Person(int age, String sex, String name) {
        this.age = age;
        this.sex = sex;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //    @Override
//    public String toString() {
//        return "Person{" +
//                "age=" + age +
//                ", sex='" + sex + '\'' +
//                ", name='" + name + '\'' +
//                '}';
//    }
    @Override
    public String toString() {
        return "{" +
                "age=" + age +
                ", sex='" + sex + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
