import java.util.*;
    public class triangl {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a <= 0 || b <= 0 || c <= 0)
                System.out.println("InvalidInput");
            if(a >= (b+c) || c >= (b+a) || b >= (a+c) )
                System.out.println("");
            if(a==b && b==c)
                System.out.println("Равносторонний треугольник");
            else if (((a * a) + (b * b)) == (c * c) || ((a * a) + (c * c)) == (b * b) || ((c * c) + (b * b)) == (a * a))
                System.out.println("Прямоугольный треугольник");
            else if(a!=b && b!=c && c!=a)
                System.out.println("Ступенчатый треугольник");
            else if ((a==b && b!=c ) || (a!=b && c==a) || (c==b && c!=a))
                System.out.println("Равнобедренный треугольник");

        }
    }