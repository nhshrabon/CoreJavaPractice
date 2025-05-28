/*
 * Problem statement:
 *  Write a java program that calculate payable income tex for a company anual income/sales to be paid to goverment text office.
 *  
 *  Note:
 *      1.There are several income slot of different text retern rate.
 *          Such as:
 *             Income Slot  Tax Ratio(%)
 *              2.5L- 5.0L   -->   5
 *              5.0L - 10.0L -->  10
 *              Above 10.0 L -->  30     
 *      2.All data should be provided by users.
 * 
 * Author: Md.Noor Hossain Shrabon
 */
import java.util.Scanner;

public class IncomeTaxCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input commpany's last year sales(In BDT): ");
        double annulSales = sc.nextDouble();
        System.out.print("Input commpany's last year cost(In BDT):  ");
        double annualCost = sc.nextDouble();
        // calculate annual income
        double annualIncome = annulSales - annualCost;
        // convert annual income in lakhs 
        double annualIncomeLakhs = annualIncome/100000;
       
        // applying tax base on income tax slot
        double payableTex = 0.0;
        if (annualIncomeLakhs > 10.0) {
            payableTex = (annualIncomeLakhs - 10)*30/100;
            annualIncomeLakhs = 10.0;
        }

        if (annualIncomeLakhs > 5.0) {
            payableTex += (annualIncomeLakhs - 5.0)*10/100;
            annualIncomeLakhs = 5.0;
        }

        if (annualIncomeLakhs >= 2.5) {
            payableTex += (annualIncomeLakhs - 2.5)*5/100;
        }

        payableTex *= 100000;
        System.out.printf("Payable tex for last year is %.2f BDT", payableTex);
        System.out.println();
    }
}
