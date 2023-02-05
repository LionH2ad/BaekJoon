import java.util.Scanner;

public class Main{
	public static void main(String[] args){
        int A = 0;
        int B = 0;
        int Sum = 0;
        boolean check = false;
        Scanner sc = new Scanner(System.in);
        
        while(!check){
            A = sc.nextInt();
            B = sc.nextInt();
            if(0<A && A<10){
                if(0<B && B<10){
                    check = true;
                }
            }
        }
        
        Sum = A + B;
		System.out.println(Sum);
	}
}