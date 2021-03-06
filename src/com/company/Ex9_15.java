package com.company;
public class Ex9_15 extends Ex9_15Emp {

  private double hours;
  private double wages;

  Ex9_15(String firstname, String lastname, int ssn, double hours, double wages) {
    super();
    super.setFirstname(firstname);
    super.setLastname(lastname);
    super.setSsn(ssn);
    this.hours = hours;
    this.wages = wages;
  }




  public void setHours(double hours) {
    if (hours >= 0 || hours <= 168) {
      this.hours = hours;
    }
  }
  public void setWages(double wages) {
    if (wages >= 0) {
      this.wages = wages;
    }
  }

  public double getWages() {
    return wages;
  }

  public double getHours() {
    return hours;
  }
  public double totalEarning() {
    if (this.getHours() <= 40) {
      return (this.getHours() * this.getWages());
    } else {
      double hour = this.getHours() - 40;
      double total = (40 * this.getWages()) + hour * (wages * 1.5);
      return total;
    }
  }

  public String toString() {
    return "Firstname: " + super.getFirstname() + " Lastname: " + super.getLastname() + " Hours Worked: " + this.getHours() + " Wages per hour: " + this.getWages() + " Total wages: " + this.totalEarning();
  }
}