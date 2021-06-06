public class Main {

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.print("A:");
        int A = scan.nextInt();
        System.out.print("B:");
        int B = scan.nextInt();
        System.out.print("C:");
        int C = scan.nextInt();
        int largest = A>B?(A>C?A:C):(B>C?B:C);
        System.out.println("Largest no is: "+largest);
    }

}

