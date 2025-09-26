public class Zamestnanec {

    public String name;
    public int age;

    public Zamestnanec(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void plnolety() {
        if (age >= 18) {
            System.out.println("\nJe plnolety");
        } else System.out.println("\nNeni plnolety");
    }

   public int getAge() {
        return age;
   }

    @Override
    public String toString() {
        return "\n" + name + " | vek " + age;
    }
}
