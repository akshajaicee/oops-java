import java.util.Scanner;
class largest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Number1: ");
        int n1 = sc.nextInt();
        System.out.println("Number2: ");
        int n2 = sc.nextInt();
        System.out.println("Number3: ");
        int n3 = sc.nextInt();
        sc.close();
        
        if(n1<n2 && n1<n3){
            System.out.println("N1 is Smaller :" +n1);

        }
        else if(n2<n1 && n2<n3){
            System.out.println("N2 is Smallerr :" +n2);
        }
        else{
            System.out.println("N3 is Smaller :" +n3);
        }

    }
    
}