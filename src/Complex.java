public class Complex {
    private double x;
    private double y;

    public Complex(){}

    public Complex(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Complex add(Complex Number){
        return new Complex(x+Number.getX(),y+Number.getY());
    }

    public Complex sub(Complex Number){
        return new Complex(x-Number.getX(),y-Number.getY());
    }

    public Complex mul(Complex Number){
        return new Complex(x*Number.getX()-y*Number.getY(),x*Number.getY()+y*Number.getX());
    }

    public Complex div(Complex Number){
        return new Complex((x*Number.getX()+y*Number.getY())/(Math.pow(Number.getX(), 2)+Math.pow(Number.getY(), 2)),(y*Number.getX()-x*Number.getY())/(Math.pow(Number.getX(), 2)+Math.pow(Number.getY(), 2)));
    }

    public Double abs(){
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }

    public Boolean equals(Complex Number){
        return x==Number.getX()&&y==Number.getY();
    }

    public String str() {
        return "("+x+"+"+y+"i)";
    }
}