import java.util.*;

public class Operators {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // Arithmetic operator
        
        //Binary operator +,-,*,/,%
        int a1 = 10 ;  
        int b1 = 5;
        System.out.println(a1+b1);
        System.out.println(a1-b1);
        System.out.println(a1*b1);
        System.out.println(a1/b1);
        System.out.println(a1%b1);

        // Unary operator ++,-- 

        int a2 = 10;
        int b2 = a2++; // post increment 
        System.out.println(a2);
        System.out.println(b2);

        b2 = ++a2;// pre increment 
        System.out.println(b2);

        int a3 = 10 ;
        int b3= a3--; // post decrement
        System.out.println(a3);
        System.out.println(b3);

        b3 = --a3; //pre decrement 
        System.out.println(b3);

        // Relational operator 

        int A= 10;
        int B = 5;

        System.out.println(A == B);
        System.out.println(A != B);
        System.out.println(A > B);
        System.out.println(A < B);
        System.out.println(A <= B);
        System.out.println(A >= B);

        // Logical Operator used in conditional Statements if-else or switch

        System.out.println((3>2) && (5>3));
        System.out.println((3<2) && (5>2));
        System.out.println((3<2) && (5<3));
        System.out.println((3>2) || (5>3));
        System.out.println((3<2) || (5<2));
        System.out.println((3<2) || (5>3));
        System.out.println( !(3>0)) ;
        System.out.println( !(3<0)) ; 

        // Assignment Operator  helps with faster execution of code 

        int  C = 10;
        C += 10;  // C = C+10
        System.out.println(C);
        C -= 10;  // C = C-10
        System.out.println(C);
        C *= 10;  // C = C*10
        System.out.println(C);
        C /= 10;  // C = C/10
        System.out.println(C);









    

    }
    
}
