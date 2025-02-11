package liskov.violation;

class PartTimeEmployee extends Employee {
    @Override
    public double calculateSalary() {
        return this.hoursOfWork * 10;
    }
}
