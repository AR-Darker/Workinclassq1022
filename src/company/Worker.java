package company;

public class Worker extends Employee{


    public Worker(String name, String secondName, int exp) {
        super(name, secondName, exp);
    }

    @Override
    public void setProf() {

    }

    @Override
    public void addworker(Employee employee) {
        super.addworker(employee);
    }

    @Override
    public void SetProf(){
        this.prof = prof.WORKER;



    }
}
