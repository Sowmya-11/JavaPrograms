package JavaPrograms;

import java.util.Scanner;

public class InputOutput2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        double d=sc.nextDouble();
        sc.nextLine();
        String s=sc.nextLine();
        sc.close();
        System.out.println("String: "+s);
        System.out.println("Double: "+d);
        System.out.println("Int: "+a);
        
    }
    
}
