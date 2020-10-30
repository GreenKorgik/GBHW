package geekbrainsOneLvl;

import java.util.Formatter;

public class Main {

    public static void main(String[] args) {
        Employee director = new Employee("Дамблдор","Альбус","Персиваль",AppointmentShoole.Director,"+1 (781)-452-40-77",120000,113);
        Employee[] employees = {director,new Employee("Северус","Снейп",null,AppointmentShoole.Dean,"+1 (781)-452-40-78",100000,36),
                new Employee("Макгонагалл","Минерва",null,AppointmentShoole.Professor,"+1 (781)-452-40-75",100000,54),
                new Employee("Поттер", "Гарри","Джеймс",AppointmentShoole.Schoolboy,"+1 (781)-452-36-45",0,15),
                new Employee("Филч","Аргус",null,AppointmentShoole.Manager,"+1 (781)-452-40-70",54000,61)};

        for(int i = 0;i<employees.length;i++){
            if(employees[i].getAge()>40) {
                Formatter format =new Formatter();
                System.out.println(format.format("%-12s %-10s %-15s %-13s", employees[i].getLastName(), employees[i].getName(), employees[i].getMiddleName(),employees[i].getAppointmentEmployee()));
                //if need all info use employees[i].toString()
            }
        }
    }
    public void salaryUpp(Employee[] employees)//method increases the salary of employees over 45 years old
    {

        for(int i = 0;i<employees.length;i++) {
            if (employees[i].getAge() > 45) {
                employees[i].setSalary(employees[i].getSalary()+5000);
            }
        }
    }
    public void printEmploys(Employee[] employees)//just print info about all employees
    {
        for(int i = 0;i<employees.length;i++) {
            System.out.println(employees[i].toString());
        }
    }
}
