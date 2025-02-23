// calculate salrey

class Hello {
public static void main(String[] args) {
    float basic ,hra,da,ma,g_pay,it,np;

    basic = 20000;
    hra = (basic*10)/100;
    da = (basic*50)/100;
    ma = (basic*15)/100;
    g_pay = basic+ hra+ da + ma;
     it = (g_pay*15)/100;
     np = g_pay - it ;
     System.out.println("basic " + basic);
     System.out.println("hra " + hra);
     System.out.println("da  " + da);
     System.out.println("ma " + ma);
     System.out.println("g_pay " + g_pay);
     System.out.println("it  " + it);
     System.out.println("np " + np);

}
    
}