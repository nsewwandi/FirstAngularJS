public class Employee {
    private int salary;
    public void setSalary(int salary) {
        int welfareDeduction = 0;
        if (salary > 60000) {
            welfareDeduction = 100;
        } else {
            welfareDeduction = 80;
        }
        this.salary = salary - welfareDeduction;
    }
    public int getSalary() {
        return salary;
    }
}
