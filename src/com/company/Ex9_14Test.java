package com.company;
public class Ex9_14Test {
  public static void main(String[] args) {

    // instantiate CommissionEmployee object

    Ex9_14 emp = new Ex9_14(

            "Jhon", "Reeves", "123-45-6789", 12000, .05);

    // get commission employee data

    System.out.println("Employee information obtained by get methods:");

    System.out.printf("%n%s %s%n", "First name: ",

            emp.getFirstName());

    System.out.printf("%s %s%n", "Last name: ",

            emp.getLastName());

    System.out.printf("%s %s%n", "Social security number: ",

            emp.getSocialSecurityNumber());

    System.out.printf("%s %.2f%n", "Gross sales: ",

            emp.getGrossSales());

    System.out.printf("%s %.2f%n", "Commission rate: ",

            emp.getCommissionRate());



    emp.setGrossSales(5000);

    emp.setCommissionRate(.1);



    System.out.printf("%n%s:%n%n%s%n",

            "Updated employee information obtained by toString", emp);

  }

}
