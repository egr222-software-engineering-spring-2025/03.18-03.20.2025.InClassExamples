public class EmployeeClient {

    public static void main(String[] args) {
        Employee e = new Employee(3);
        Lawyer l = new Lawyer(12);
        Secretary s = new Secretary(35);
        Marketer m = new Marketer(27);
        LegalSecretary ls = new LegalSecretary(4);

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
        System.out.println("Legal secretary");
        printInfo(ls);
        ls.takeDictation("Legal meeting notes");
        ls.fileLegalBriefs();

    }

    public static void printInfo(Employee e) {
        System.out.println("Salary: " + e.getSalary());
        System.out.println("Vacation form: " + e.getVacationForm());
        System.out.println("Vacation days: " + e.getVacationDays());
    }
}