package geekbrainsOneLvl;

public class Employee extends Person{
    private static int numberOfEmployees = 0;
    private AppointmentShoole appointmentEmployee;
    private String telephoneNumber;
    private int salary;
<<<<<<< HEAD
    private final int idEmployee;//unique serial number employee here
=======
    private final int idEmployee;//unique serial number employee
>>>>>>> 6a0ca00 (Сделана задача  с массивом сотрудников)

    public Employee(String lastName, String name, String middleName, AppointmentShoole appointmentEmployee, String telephoneNumber, int salary, int age)
    {
        super(lastName,name,middleName,age);
        this.appointmentEmployee = appointmentEmployee;
        this.telephoneNumber = telephoneNumber;
        this.salary = salary;
        numberOfEmployees++;
        this.idEmployee = numberOfEmployees;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public AppointmentShoole getAppointmentEmployee() {
        return appointmentEmployee;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString()+'\''+", appointmentEmployee=" + appointmentEmployee +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", salary=" + salary;
    }
}
