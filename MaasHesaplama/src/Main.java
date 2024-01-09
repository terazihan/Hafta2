import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Adı ve Soyadı: ");
        String name = input.nextLine();

        System.out.print("Maaşı: ");
        double salary = input.nextDouble();

        System.out.print("Haftalık Çalışma Saati: ");
        int workHours = input.nextInt();

        System.out.print("Başlangıç Yılı: ");
        int hireYear = input.nextInt();

        Employee emp = new Employee(name, salary, workHours, hireYear);
        emp.tax();
        emp.bonus();
        emp.raiseSalary();

        System.out.println(emp.toString());
    }
}
