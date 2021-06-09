package day51_inheritance;

public class Contractor extends Employee{

    @Override // "2 purpose"
                // 1st purpose let people know you are overriding
                // 1st purpose ensure that this method is being overriding id not show Error

    public double calculateSalary(double hourlyRate){ //can call method implementation
     return    50*40*hourlyRate;
    }

    @Override
    public String toString() {
        return "Contractor{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
