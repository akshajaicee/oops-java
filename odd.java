import java.util.Scanner;


class odd{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        sc.close();
        if(n%2==0){
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }
        

    }
}