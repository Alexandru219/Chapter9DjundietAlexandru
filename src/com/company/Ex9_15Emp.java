package com.company;
import java.util.Scanner;
public class Ex9_15Emp {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String firtsname,lastname;
    int ssn;
    double hours;
    double wages;

    System.out.println("Enter FirstName: ");
    firtsname = scan.next();
    System.out.println("Enter LastName: ");
    lastname = scan.next();
    System.out.println("Enter SSN: ");
    ssn = scan.nextInt();
    System.out.println("Enter Hours: ");
    hours = scan.nextDouble();
    System.out.println("Enter Wages: ");
    wages = scan.nextDouble();

    Ex9_15Emp x = new Ex9_15(firtsname,lastname,ssn,hours,wages);

    System.out.println(x.toString());
  }

  protected void setFirstname(String firstname) {
  }

  protected void setLastname(String lastname) {
  }

  protected void setSsn(int ssn) {
  }


  public String getLastname() {
    String lastname = null;
    return lastname;
  }

  public String getFirstname() {
    String firstname = null;
    return firstname;
  }
}
