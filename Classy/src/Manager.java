import java.util.ArrayList;

public class Manager {

    private static Manager instance;
    private ArrayList<Employee> employees;
    private int day;

    private Manager() {
        employees = new ArrayList<>();
        day = 0;
    }

    public void addPerson(Employee employee) {
        employees.add(employee);
    }

    public void employeePayDay() {
        day++;
        boolean tricatyDay = (day == 30);

        for (Employee employee : employees) {
            employee.clockedSetter(employee.clockedGetter() + 8);

            if (tricatyDay) {
                employee.getPaycheck();
                employee.clockedSetter(0);
            }
        }
        if (tricatyDay) {
            day = 0;
        }
    }


    public static Manager getInstance() {
        if (instance == null) {
            instance = new Manager();
        }
        return instance;
    }
}