import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int a =10;
//        for(int i=1;i<=a; i++){
//            System.out.println(i);
//        }
//        int sum=0;
//        for(int i=0; i<=100;i++){
//             sum +=i;
//        }
//        System.out.println(sum);

//        int result=1;
//        int num = scan.nextInt();
//        for(int i=1;i<=num;i++){
//            result *=i;
//        }
//        System.out.println(result);
//
//        for (int i = 1; i <= 10; i++) {
//            for (int j = 1; j <= 10; j++) {
//                System.out.print(i * j + "\t");
//            }
//            System.out.println();
//
//        }
        int num2 = scan.nextInt();
        if(num2%2==0){
            for(int i=1;i<=num2;i++) {
                if (i % 2 == 0) {
                    System.out.println("Четные числа: " + i);
                }
            }
        }
            if (num2%2!=0){
                for(int j=1;j<=num2;j++){
                    if(j%2!=0){
                        System.out.println("Нечетные числа: "+j);
                    }
                }

            }
        }

    }

