import java.time.Year;

public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

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
        int standardWorkHours = 40;
        if (workHours > standardWorkHours) {
            int extraHours = workHours - standardWorkHours;
            return extraHours * 30;
        }
        return 0;
    }

    public double raiseSalary() {
        int currentYear = Year.now().getValue();
        int yearsWorked = currentYear - hireYear;
        if (yearsWorked < 10) {
            return salary * 0.05;
        } else if (yearsWorked >= 10 && yearsWorked < 20) {
            return salary * 0.10;
        } else {
            return salary * 0.15;
        }
    }

    public double totalSalary() {
        double tax = tax();
        double bonus = bonus();
        double raise = raiseSalary();
        return salary - tax + bonus + raise;
    }

    @Override
    public String toString() {
        return "Adı : " + name + "\nMaaşı : " + salary + "\nÇalışma Saati : " + workHours +
                "\nBaşlangıç Yılı : " + hireYear + "\nVergi : " + tax() + "\nBonus : " +
                bonus() + "\nMaaş Artışı : " + raiseSalary() + "\nVergi ve Bonuslar ile birlikte maaş : " +
                totalSalary() + "\nToplam Maaş : " + (salary + bonus + raiseSalary());
    }

    public static void main(String[] args) {
        Employee emp = new Employee("kemal", 2000.0, 45, 1985);
        System.out.println(emp.toString());
    }
}
