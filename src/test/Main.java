package test;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a;
    int b=1;
  /* int c;
    System.out.print("1-sonni kiriting: ");
    a = sc.nextInt();
    System.out.print("2-sonni kiriting: ");
    b = sc.nextInt();
    System.out.print("3-sonni kiriting: ");
    c = sc.nextInt();

    if(b>c && a>c){
      System.out.println("Kichik son: "+c);
    }else if(a>b && b<c){
      System.out.println("Kichik son: "+b);
    }else {
      System.out.println("Kichik son: " + a);
    }*/

    /*System.out.print("Sonni kiriting:");
    a = sc.nextInt();
   *//* System.out.print("2-sonni kiriting:");
    b = sc.nextInt();
    a = a + b;
    b = a - b;
    a = a - b;

    System.out.println("1-son:" + a);
    System.out.println("2-son:" + b);
*//*


    for (int i = 1; i <= a; i++) {
      b *= i;
    }

    System.out.printf("%d ning faktoriali:%d",a,b);*/


    a = sc.nextInt();

    for (int i = 1; i < a; i++) {
      System.out.println(i);
    }

  }

}
