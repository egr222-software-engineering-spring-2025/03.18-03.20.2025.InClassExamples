public class EmployeeClient {

    public static void main(String[] args) {
        Employee e = new Employee(5);
        Lawyer l = new Lawyer(8);
        Secretary s = new Secretary(20);
        Marketer m = new Marketer(4);
        LegalSecretary ls = new LegalSecretary(5);

        System.out.println("Employee");
        printInfo(e);

        System.out.println();

        System.out.println("Lawyer");
        printInfo(l);
        l.sue();

        System.out.println();

        System.out.println("Secretary");
        printInfo(s);
        s.takeDictation("Meeting notes");

        System.out.println();

        System.out.println("Marketer");
        printInfo(m);
        m.advertise();

        System.out.println();

        System.out.println("Legal Secretary");
        printInfo(ls);
        ls.takeDictation("Legal meeting notes");
        ls.fileLegalBriefs();
    }

    public static void printInfo(Employee emp) {
        System.out.println("Salary: " + emp.getSalary());
        System.out.println("Vacation form: " + emp.getVacationForm());
        System.out.println("Vacation days: " + emp.getVacationDays());

    }
}