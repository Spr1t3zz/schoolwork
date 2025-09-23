public class Main {
    public static void main(String[] args) {

        Manager manager = Manager.getInstance();

        Employee empAmir = new Employee("Amir", 17, 200);
        Employee empOlive = new Employee("Oliver", 16, 230);
        Employee empDona = new Employee("Marek", 16, 210);
        Employee empDavid = new Employee("David", 16, 100);

        manager.addPerson(empAmir);
        manager.addPerson(empOlive);
        manager.addPerson(empDona);
        manager.addPerson(empDavid);

        for (int i = 1; i <= 60; i++) {
            System.out.println("Day " + i);
            manager.employeePayDay();

        }
    }
}
