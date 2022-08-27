package program;
import java.util.Scanner;

 class rectangle {

    public static void main(String[] args)
    {
        int l,b ,area;
        System.out.print("Enter vlaue for sides");
        Scanner r=new Scanner(System.in);
        l = r.nextInt();
        b = r.nextInt();
        area= l*b;
        System.out.println("Area of rectangle"+area);
    }
    
} 