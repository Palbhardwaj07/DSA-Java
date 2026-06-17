
public class AP {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // 2,5,8,11,...,n


        // 1st Way-----


        // for(int i=2;i<=3*n-1;i=i+3){
        //     System.out.print(i + " ");
        // }   
        

        // 2nd Way------

        // int a = 2, d = 3;
        // for(int j=1;j<=n;j++){
        //     System.out.print(a + " ");
        //     a += d;
        // }


        // 99,95,91,...,upto positive integer

        for(int i=99;i>0;i=i-4){
            System.out.print(i + " ");
        }
    }
}
