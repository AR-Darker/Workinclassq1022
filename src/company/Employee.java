package company;

public abstract class Employee extends Person {

    private int exp;
    protected PROF prof;
    private final int basic = 1000;

    public Employee(String name, String secondName, int exp) {
        super(name, secondName);
        this.exp = exp;
        setProf();
    }

    public int getSalary(){
        return basic * prof.getKoef() * exp;
    }

    public abstract void setProf();


    @Override
    public String toString() {
        return "Employee{" +
                "exp=" + exp +
                ", prof=" + prof +
                ", basic=" + basic +
                '}';
    }


    public abstract void SetProf();
}
