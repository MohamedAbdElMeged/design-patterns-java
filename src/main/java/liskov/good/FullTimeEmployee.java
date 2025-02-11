package liskov.good;

import liskov.good.Employee;

public class FullTimeEmployee extends Employee implements SalaryCalulator {


    @Override
    public double CalculateSalary() {
        return hoursOfWork * 2000;
    }
}