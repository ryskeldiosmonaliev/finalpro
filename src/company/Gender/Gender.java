package company.Gender;

public enum Gender {
    MAN("man"),
    WOMEN("girl");
    private String gender;


    Gender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Gender{" + gender;
    }
}
