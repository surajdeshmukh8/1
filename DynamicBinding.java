abstract class Shape {
    abstract public void Compute_Area(double a, double b);

    public void Calculate_Area() {
    }
}

class Triangle extends Shape {
    public double base;
    public double height;

    @Override
    public void Compute_Area(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void Calculate_Area() {
        System.out.println("Area of Triangle: " + (0.5 * (base * height)));
    }
}

class Rectangle extends Shape {
    public double length;
    public double breadth;

    @Override
    public void Compute_Area(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void Calculate_Area() {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }
}

class DynamicBinding {
    public static void main(String[] args) {
        Shape obj1 = new Triangle();
        obj1.Compute_Area(10.5, 20.5);
        obj1.Calculate_Area();

        Shape obj2 = new Rectangle();
        obj2.Compute_Area(5.30, 15.10);
        obj2.Calculate_Area();
    }
}