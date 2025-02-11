package liskov.violation;

public class FullTimeEmployee extends Employee{
    @Override
    public double calculateSalary() {
        return this.hoursOfWork * 2000;
    }
}