package qedge.mar6;

public class StringFunctions {

	public static void main(String[] args) {
		/*length*/
		String str  ="I am learning java";
		System.out.println(str.length());
		System.out.println("===============================");
		/*equals*/
		String x =("google");
          String y =("google");
          String z =("Google");
          System.out.println(x.equals(y));//true
          System.out.println(x.equals(z));//False
          System.out.println("===========================");
          /*equalsIgnoreCase*/
          System.out.println(x.equalsIgnoreCase(z));//true
          System.out.println("===========================");
          /*contains*/
          String a ="iam so lazy to workout";
          System.out.println(a.contains("lazy")); //true
          System.out.println(a.contains(" "));//true
          System.out.println(a.contains("out"));//true
          System.out.println(a.contains("Out"));//false
          System.out.println("==========================");
          /*concat*/
       String str1="APJ Abdul";
       String str2="kalam";   
       System.out.println(str1.concat(str2)); 
       System.out.println("====================");
       /*starts with and ends with*/
       String str3="https://learn.qedgetech.com";
       System.out.println(str3.startsWith("https")); //true
       System.out.println(str3.endsWith("com")); //true
       System.out.println(str3.startsWith("learn")); //false
         System.out.println("=======================");
         /*charAt*/
         String str4="hello";
         System.out.println(str4.charAt(4));
         System.out.println("=======================");
         /*for reverse purpose */
         String str5="ayvid si siht";
         for(int i=str5.length()-1;i>=0;i--)
         System.out.print(str5.charAt(i));
         System.out.println("=======================");
         /*for trim purpose */
         String str6="      hello";
         String str7="divya      goutham";//wont take middle space
         String str8="minnu               ";
         String str9="     junnu          ";
         System.out.println(str6.trim());
         System.out.println(str7.trim());
         System.out.println(str8.trim());
         System.out.println(str9.trim());
}
}
