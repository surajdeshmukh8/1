class ComplexNumber {
    double real, img;
    ComplexNumber(double r, double i) {
        this.real = r;
        this.img = i;
    }

    
    public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2) {
        
        ComplexNumber temp = new ComplexNumber(0, 0);
        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;
        System.out.println("Sum is " + temp.real + " + " + temp.img + "i");
        return temp;
    }
      public static ComplexNumber sub(ComplexNumber c1, ComplexNumber c2) {
        
        ComplexNumber temp = new ComplexNumber(0, 0);
        temp.real = c1.real - c2.real;
        temp.img = c1.img - c2.img;
        System.out.println("Sub is " + temp.real + " + " + temp.img + "i");
        return temp;
    }
     
      public static ComplexNumber mul(ComplexNumber c1, ComplexNumber c2) {
        
        ComplexNumber temp = new ComplexNumber(0, 0);
        temp.real = (c1.real*c2.real)-(c1.img*c2.img);
        temp.img = (c1.real*c2.img)+(c1.img*c2.real);
        System.out.println("mul is " + temp.real + " + " + temp.img + "i");
        return temp;
    }
    public static ComplexNumber div(ComplexNumber c1, ComplexNumber c2) {
        
        ComplexNumber temp = new ComplexNumber(0, 0);
        temp.real = c1.real - c2.real;
        temp.img = c1.img - c2.img;
        System.out.println("Sub is " + temp.real + " + " + temp.img + "i");
        return temp;
    }
     
     
 }
class Main{
    public static void main(String args[]) {
        ComplexNumber c1 = new ComplexNumber(5.5, 4);
        ComplexNumber c2 = new ComplexNumber(1.2, 3.5);
        ComplexNumber.sum(c1, c2);
        ComplexNumber.sub(c1,c2);
        ComplexNumber.mul(c1,c2);
         
    }
}