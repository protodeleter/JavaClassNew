package ClassWorks;

public class WorkerExe {

    private int id;
    private String name;
    private double workingHours;
    private double salaryPerHour;

    public WorkerExe(int id, String name, double workingHours, double salaryPerHour) {
        this.id = id;
        this.name = name;
        this.workingHours = workingHours;
        this.salaryPerHour =  salaryPerHour;
    }

    public WorkerExe() {
        this.id = 0;
        this.name = "";
        this.workingHours = 0.0;
        this.salaryPerHour = 0.0;
    }

    public WorkerExe(WorkerExe other) {
        this.id = other.id;
        this.name = other.name;
        this.workingHours = other.workingHours;
        this.salaryPerHour = other.salaryPerHour;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }
    public double getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }


    public double calculateSalary() {
        return salaryPerHour * workingHours;
    }

    public String print() {
        return salaryPerHour + " " + name + " " + workingHours + " " + this.calculateSalary();
    }


}
