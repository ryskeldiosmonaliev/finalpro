package company.model;

import company.Gender.Gender;

public class Uzer {
    private int id;
    private String name;
    private int age;
    Gender gender;

    public Uzer(int id, String name, int age, company.Gender.Gender gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Uzer() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Uzer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", Gender='" + getGender() + '\'' +
                '}';
    }


}
