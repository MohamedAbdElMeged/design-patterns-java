package liskov.good;

import liskov.violation.Employee;

class PartTimeEmployee extends Employee implements SalaryCalulator {

    @Override
    public double CalculateSalary() {
        return hoursOfWork * 100;
    }
}
