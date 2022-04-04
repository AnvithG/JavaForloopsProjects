import java.util.Scanner;
public class JavaForLoop {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to see it's multiplication table...");
        n = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n + " x " + i + " = "  + i * n);
            
            //prints out your choice of table you like
        }
    }
}
