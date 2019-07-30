package herencia;

public class DataEncapsulation {
public static void main(String[] args) {
Company company = new Company();
company.setName("MyCompany");
company.addEmployee("John");
company.addEmployee("Anthony");
company.addEmployee(null); //check for null
parameters on method
company.addEmployee("");
company.setName(null); //check for null
parameters on method
company.printSorted();
// company.name = null;
// company.printSorted();
// company.employees = null;
//company.employees.add("Jimmy"); employee
must have private access
// company.printSorted();
}
}