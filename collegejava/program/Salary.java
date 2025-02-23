import java.util.*;

class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        float basic,hra,da,ma,np;
        System.out.println("Enter Basic Salary");
        basic = sc.nextFloat();
        // Basic salary
        hra = (basic*10)/100;// 10% of the hra
        da = (basic*50)/100;// 50% of da 
        ma = (basic*20)/100;// 20% of basic
        np = basic+hra+da+ma;
        System.out.println("Basic Salary : "+ basic);
        System.out.println("House Rent Allowance :" + hra);
        System.out.println("Daily Allowance : " + da);
        System.out.println("Medical Allowance : " + ma);
        System.out.println("NetPay :" + np);

    }
    
}