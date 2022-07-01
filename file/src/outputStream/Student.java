package outputStream;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public Student(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        Hobby = hobby;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Hobby='" + Hobby + '\'' +
                '}';
    }

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return Hobby;
    }

    public void setHobby(String hobby) {
        Hobby = hobby;
    }

    private String Hobby;


}
