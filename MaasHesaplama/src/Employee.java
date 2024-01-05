import java.time.Year;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary < 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    public double bonus() {
        if (workHours > 40) {
            int extraHours = workHours - 40;
            return extraHours * 30;
        } else {
            return 0;
        }
    }

    public double raiseSalary() {
        int yearsWorked = Year.now().getValue() - hireYear;

        if (yearsWorked < 10) {
            return salary * 0.05;
        } else if (yearsWorked >= 10 && yearsWorked < 20) {
            return salary * 0.1;
        } else {
            return salary * 0.15;
        }
    }

    public void calculateTotalSalary() {
        double totalSalary = salary - tax() + bonus() + raiseSalary();
        System.out.println("Adı: " + name);
        System.out.println("Maaşı: " + salary);
        System.out.println("Vergi: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Maaş Artışı: " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + (salary - tax() + bonus()));
        System.out.println("Toplam Maaş: " + totalSalary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Kemal", 2000.0, 45, 2015);
        emp.calculateTotalSalary();
    }
}
