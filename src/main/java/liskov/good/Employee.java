// BAD
package liskov.good;

 public class Employee {
     protected String name;
     protected int hoursOfWork;

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




}



