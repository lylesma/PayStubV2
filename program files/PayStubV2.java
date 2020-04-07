/**
 * PayStubV2.java
 * 
 */

//Put any imports below this line.
import java.util.Scanner;
/**
 * Short, one-line description of PayStubV2 class here.
 * 
 * Optionally, include a paragraph that provides a more 
 * detailed description.
 *
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PayStubV2
{
    //Put instance variables below this line.
    private double OVERTIME_RATE;
    private double SOCIAL_WITHOLDING;
    private double FEDERAL_TAX;

    private String employeeName;
    private String social;
    private int regularHours;
    private int overtimeHours;
    private double payRate;

    //Used in calculate method
    private double regPay = regularHours * payRate;
    private double overtimeRate;
    private double overtimePay;

    private double grossPay;
    private double socialWitholding;
    private double federalTax;
    private double netPay;

    //Constructor
    public PayStubV2()
    {
        employeeName = "";
        social = "";
        regularHours = 0;
        overtimeHours = 0;
        payRate = 0;
        OVERTIME_RATE = 1.5;
        SOCIAL_WITHOLDING = 0.1;
        FEDERAL_TAX = 0.2;
    }
    // Getter and setters
    /**
     * @return This method returns employee name.
     */   
    public String getEmployeeName()
    {
        return employeeName;
    }

    /**
     * @return This method returns social.
     */   
    public String getSocial()
    {
        return social;
    }

    /**
     * @return This method returns regular hours.
     */   
    public int getRegularHoursWorked()
    {
        return regularHours;
    }

    /**
     * @return This method returns overtime hours.
     */   
    public int getOvertimeHoursWorked()
    {
        return overtimeHours;
    }

    /**
     * @return This method returns pay rate.
     */   
    public double getPayRate()
    {
        return payRate;
    }

    /**
     * @return This method returns gross pay.
     */
    public double getGrossPay()
    {
        return grossPay;
    }

    /**
     * @param employeeName sets employeeName.
     */
    public void setEmployeeName(String employeeName)
    {
        this.employeeName = employeeName;
    }

    /**
     * @param socail sets social.
     */
    public void setSocial(String social)
    {
        this.social = social;
    }

    /**
     * @param regularHours sets regular hours.
     */
    public void setRegularHoursWorked(int regularHours)
    {
        if (regularHours >= 0)
        {
            this.regularHours = regularHours;

        }
    }

    /**
     * @param overtimeHours sets overtime hours.
     */
    public void setOvertimeHoursWorked(int overtimeHours)
    {
        if (overtimeHours >= 0)
        {
            this.overtimeHours = overtimeHours;

        }
    }

    /**
     * @param payRate sets pay rate.
     */
    public void setPayRate(double payRate)
    {
        if (payRate >= 0)
        {
            this.payRate = payRate;

        }
    }

    /**
     * @param OVERTIME_RATE sets OVERTIME_RATE.
     */
    public void setOvertimeRate(double OVERTIME_RATE)
    {
        if (OVERTIME_RATE >= 0)
        {
            this.OVERTIME_RATE = OVERTIME_RATE;

        }
    }

    /**
     * @param SOCIAL_WITHOLDING sets SOCIAL_WITHOLDING.
     */
    public void setSocialWitholding (double SOCIAL_WITHOLDING)
    {
        if (SOCIAL_WITHOLDING >= 0)
        {
            this.SOCIAL_WITHOLDING = SOCIAL_WITHOLDING;

        }
    }

    /**
     * @param FEDERAL_TAX sets FEDERAL_TAX.
     */
    public void setFederalTax (double FEDERAL_TAX)
    {
        if (FEDERAL_TAX >= 0)
        {
            this.FEDERAL_TAX = FEDERAL_TAX;

        }
    }

    private void getInput()
    {
        Scanner kb = new Scanner(System.in);

        // Ask the user for employee name then set field
        System.out.print("Enter employee name: ");
        String employeeName = kb.nextLine();
        setEmployeeName(employeeName);
        // Ask the user for social then set field
        System.out.print("Enter employee SSN (incl. hyphens): ");
        String social = kb.nextLine();
        setSocial(social);
        // Ask the user for regular hours then set field
        System.out.print("Enter number of regular hours worked: ");
        int regularHours = kb.nextInt();
        setRegularHoursWorked(regularHours);
        // Ask the user for overtime hours then set field
        System.out.print("Enter number of overtime hours worked: ");
        int overtimeHours = kb.nextInt();
        setOvertimeHoursWorked(overtimeHours);
        // Ask the user for hourly pay rate then set field
        System.out.print("Enter hourly pay rate: ");
        double payRate = kb.nextDouble();
        setPayRate(payRate);

        //Ask the user if they want to modify overtime rate
        kb.nextLine();
        System.out.print("Do you want to modify overtime rate?" 
            + " Enter 'yes' or 'no': ");
        String response = kb.nextLine();

        //Used for input validation
        while ((!response.equals("yes")) && (!response.equals("no")))
        {

            System.out.println("That word is invalid.");
            System.out.print("Enter the words yes or no: ");
            response = kb.nextLine();

        }
        if(response.equals("yes"))
        {
            System.out.print("Enter an overtime value (Ex. 1.5): ");
            double newOVERTIME_RATE = kb.nextDouble();
            setOvertimeRate(newOVERTIME_RATE);
            System.out.print("Overtime value is now " + newOVERTIME_RATE + "\n");
        }
        else if(response.equals("no"))
        {
            System.out.print("The default value of overtime is still 1.5 \n");
        }

        //Ask the user if they want to modify social witholding

        System.out.print("Do you want to modify social withholding?" 
            + " Enter 'yes' or 'no': ");
        String responseTwo = kb.nextLine();

        //Used for input validation
        while ((!responseTwo.equals("yes")) && (!responseTwo.equals("no")))
        {

            System.out.println("That word is invalid.");
            System.out.print("Enter the words yes or no: ");
            responseTwo = kb.nextLine();

        }
        if(responseTwo.equals("yes"))
        {
            System.out.print("Enter a social withholding value (Ex. 0.1): ");
            double newSOCIAL_WITHOLDING = kb.nextDouble();
            setSocialWitholding(newSOCIAL_WITHOLDING);
            System.out.print("Social withholding value is now " 
                + newSOCIAL_WITHOLDING +"\n");
        }
        else if(responseTwo.equals("no"))
        {
            System.out.print("The default value of social withholding is still 0.1 \n");
        }

        //Ask the user if they want to modify federal tax
        
        System.out.print("Do you want to modify federal tax?" 
            + " Enter 'yes' or 'no': ");
        String responseThree = kb.nextLine();

        //Used for input validation
        while ((!responseThree.equals("yes")) && (!responseThree.equals("no")))
        {

            System.out.println("That word is invalid.");
            System.out.print("Enter the words yes or no: ");
            responseThree = kb.nextLine();

        }
        if(responseThree.equals("yes"))
        {
            System.out.print("Enter a federal tax value (Ex. 0.2): ");
            double newFEDERAL_TAX = kb.nextDouble();
            setFederalTax(newFEDERAL_TAX);
            System.out.print("Federal tax value is now " + newFEDERAL_TAX 
                + "\n");
        }
        else if(responseThree.equals("no"))
        {
            System.out.print("The default value of federal tax is still 0.2 \n");
        }

    }

    /**
     * This method calculates the input from the user.
     * 
     */
    private void calculate()
    {
        regPay = regularHours * payRate;
        overtimeRate = payRate * OVERTIME_RATE;
        overtimePay = overtimeHours * overtimeRate;

        grossPay = regPay + overtimePay;
        socialWitholding = (grossPay * SOCIAL_WITHOLDING);
        federalTax = (grossPay - socialWitholding) *  FEDERAL_TAX;
        netPay = grossPay - socialWitholding - federalTax;
    }

    /**
     * This method prints the input from the user and calculations.
     * 
     */
    public void printPayStub()
    {
        System.out.printf("______________________________" 
            + "_______________________________\n");
        System.out.printf("Name: %-37s SSN: %-11s\n", employeeName, social);
        System.out.printf("Regular Hours: %-8d Reg Rate: " 
            + "$%-8.2f Reg Pay: $%-8.2f\n", regularHours, payRate, regPay);
        System.out.printf("Overtime Hours: %-8dOT Rate: $%-8.2f " 
            + " OT Pay: $%-8.2f\n", overtimeHours, overtimeRate, overtimePay);
        System.out.printf("Gross Pay: $%-8.2f\n", grossPay);
        System.out.printf("SS Withholding: $%-8.2f\n", socialWitholding);
        System.out.printf("Federal Tax: $%-8.2f\n", federalTax);
        System.out.printf("Net Pay: $%-8.2f\n", netPay);
        System.out.printf("______________________________" 
            + "_______________________________\n");
    }

    /**
     * It all starts with the main method.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int continueOrNot = 1;

        while (continueOrNot > 0)
        {
            PayStubV2 user1 = new PayStubV2();

            user1.getInput();
            user1.calculate();
            user1.printPayStub();

            System.out.println("Enter a new hourly pay for comparison" 
                + " purposes: ");
            double newPayRate = input.nextDouble();
            user1.setPayRate(newPayRate);
            user1.calculate();
            System.out.printf("New gross pay: $%-8.2f\n", user1.getGrossPay());

            System.out.println("Enter any positive integer to continue or zero to exit: ");
            continueOrNot = input.nextInt();
        }

    }
}
