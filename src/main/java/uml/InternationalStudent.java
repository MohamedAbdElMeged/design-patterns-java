package uml;

public class InternationalStudent extends Student{
    private String countryOfOrigin;
    private String visaStatus;

    public InternationalStudent(int studentId, String name, int age, String countryOfOrigin, String visaStatus) {
        super(studentId, name, age);
        this.countryOfOrigin = countryOfOrigin;
        this.visaStatus = visaStatus;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getVisaStatus() {
        return visaStatus;
    }

    public void setVisaStatus(String visaStatus) {
        this.visaStatus = visaStatus;
    }
}
