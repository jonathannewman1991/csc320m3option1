public class taxCalculator {
  
  public static void main(String[] args) {
    // this is where we test our code
    // let's say our income this week is 2000
    double income = 2000;
    // now we calculate the tax based on our income
    double weeklyTax = calculateTax(income);
    // we want to see how much tax we need to pay
    System.out.println("the tax i need to pay this week is: $" + weeklyTax);
  }
  
  // this function calculates how much tax we pay
  public static double calculateTax(double income) {
    // first, we need to figure out our tax rate
    double taxRate;
    
    // if we made less than 500
    if (income < 500) {
      taxRate = 0.10; // the tax rate is 10%
    } else if (income < 1500) { // if we made between 500 and 1500
      taxRate = 0.15; // the tax rate is 15%
    } else if (income < 2500) { // if we make between 1500 and 2500
      taxRate = 0.20; // the tax rate is 20%
    } else { // if we made 2500 or more
      taxRate = 0.30; // the tax rate will be 30%
    }
    
    // now we calculate how much tax we need to pay and return that
    return income * taxRate;
  }
}
