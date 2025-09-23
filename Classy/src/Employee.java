public class Employee extends Human {

    protected int hourlyRate ;
    protected int clockedHours;

    public Employee(String name, int age, int hourlyRate) {
        super(name, age);
        this.hourlyRate = hourlyRate;
        this.clockedHours = 0;
    }

    protected void clockedSetter(int clockedHours) {
        this.clockedHours = clockedHours;
    }

    protected int clockedGetter() {
        return clockedHours;
    }

    public void getPaycheck() {
        System.out.println("Employee " + name + " earned " + hourlyRate * clockedHours + " kc.");
    }
}
