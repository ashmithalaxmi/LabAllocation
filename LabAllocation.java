import java.util.Scanner;

public class LabAllocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int n = sc.nextInt();
        if(n<=x && n>y && n>z){
            System.out.println("L1");
        }
        else if (n>x && n<=y && n>z){
            System.out.println("L2");
        }
        else if(n>x && n>y && n<=z){
            System.out.println("L3");
        }
        else if(n<=x && n<=y && n<=z){
            if((x-n)<(y-n) && (x-n)<(z-n)){
                System.out.println("L1");
            }
            else if((y-n)<(x-n) && (y-n)<(z-n)){
                System.out.println("L2");
            }
            else if((z-n)<(y-n) && (z-n)<(x-n)){
                System.out.println("L3");
            }
        } else if (n<=x && n<=y && n>z){
            if((x-n)<(y-n)){
                System.out.println("L1");
            }
            else {
                System.out.println("L2");
            }
        }
        else if (n<=x && n>y && n<=z){
            if((x-n)<(z-n)){
                System.out.println("L1");
            }
            else {
                System.out.println("L3");
            }
        }
        else if (n>x && n<=y && n<=z){
            if((z-n)<(y-n)){
                System.out.println("L3");
            }
            else {
                System.out.println("L2");
            }
        }
    }
}
