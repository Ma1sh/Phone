import java.util.Scanner;

public class Creatingaclass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите коорденату x");
        double x = scan.nextDouble();
        System.out.println("Введите коорденату y");
        double y = scan.nextDouble();
        System.out.println("Введите коорденату z");
        double z = scan.nextDouble();


    }
    private double x;
    private double y;
    private double z;

    public  Creatingaclass(double x, double z, double y) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double methodvektor(){
        return Math.sqrt(x*x+y*y+z*z);
    }

//    public double scal(Creatingaclass creatingaclass){
//        return (x*creatingaclass.x+y*creatingaclass.y+z*creatingaclass.z);
//    }
//
//    public Creatingaclass vektorproizved(Creatingaclass creatingaclass){
//     return new Creatingaclass(y*creatingaclass.z-z*creatingaclass.y,z*creatingaclass.x-x*creatingaclass.z,x*creatingaclass.y-y*creatingaclass.x);
//    }
//    public Creatingaclass vektorsum(Creatingaclass creatingaclass){
//        return new Creatingaclass(x+creatingaclass.x,y+creatingaclass.y,z+creatingaclass.z);
//    }
//
//    public Creatingaclass vektorrazn(Creatingaclass creatingaclass){
//        return new Creatingaclass(x-creatingaclass.x,y-creatingaclass.y,z-creatingaclass.z);
//    }

}
