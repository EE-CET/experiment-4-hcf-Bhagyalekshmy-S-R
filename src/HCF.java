import java.util.Scanner;

public class HCF {
    
      public static  int hcf(int a,int b){
               if(b==0){
                    return a;
                     }
                else{
                     return hcf(b,a%b);
                  }
    }
    public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
          int a =sc.nextInt();
          int b= sc.nextInt();
         
          System.out.println(hcf(a,b));

  }                 
}
