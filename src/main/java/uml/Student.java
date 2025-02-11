package uml;

public class Student implements LoggingStudentActivity {
    private int studentId;
    private String name;
    private int age;
    private Address address;

    public Student(int studentId, String name, int age) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
    }
    public void log(String message){
        Logger logger = new Logger();
        logger.log(message);
    }
    public void displayStudentInfo(){
        System.out.println("Student Id:"+ studentId);
        System.out.println("Student name:"+ name);
        System.out.println("Student age:"+ age);
    }
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
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

    @Override
    public void logStudentActivity(String message) {

    }
}
