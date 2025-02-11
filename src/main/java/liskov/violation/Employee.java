// BAD
package liskov.violation;

 public class Employee {
     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getHoursOfWork() {
         return hoursOfWork;
     }

     public void setHoursOfWork(int hoursOfWork) {
         this.hoursOfWork = hoursOfWork;
     }

     protected String name;
     protected int hoursOfWork;
    public double calculateSalary(){
        return this.hoursOfWork * 20;
    }
}



