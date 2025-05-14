package generic;

public class HighStudent extends Student{
    private String HighSchool;

    public String getHighSchoolName() {
        return HighSchool;
    }

    public void setHighSchoolName(String highSchoolName) {
        HighSchool = highSchoolName;
    }

    @Override
    public String toString() {
        return "HighStudent{" +
                "HighSchool='" + HighSchool + '\'' +
                "} " + super.toString();
    }
}
