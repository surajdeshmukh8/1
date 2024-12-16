interface Vehical{
    public void Speed_up(int a);
    public void Gear_change(int b);
    public void Apply_break();
}
class Bicycle implements Vehical{
    int speed;
    int Gear;
    public void Speed(int speed){
        this.speed=speed;
    }
    public void Speed_up(int a){
        speed=speed+a;
    }
    public void Gear(int gear){
        this.Gear=gear;
    }
    public void Gear_change(int b){
       this.Gear=b;
    }
    public void Apply_break(){
        speed=speed-speed;
    }
    public void Display(){
        System.out.println("\n\nBicycle changes");
        System.out.println("speed of Bicycle is  "+speed+"k/m");
        System.out.println("Gear of Bicycle is "+Gear);
       
    }
}

class Car implements Vehical{
    int speed;
    int Gear;
    public void Speed(int speed){
        this.speed=speed;
    }
    public void Speed_up(int a){
        speed=speed+a;
    }
    public void Gear(int gear){
        this.Gear=gear;
    }
    public void Gear_change(int b){
       this.Gear=b;
    }
    public void Apply_break(){
        speed=speed-speed;
    }
    public void Display(){
        System.out.println("\n\nCar stutas");
        System.out.println("speed of Bicycle is  "+speed+"k/m");
        System.out.println("Gear of Bicycle is "+Gear);
       
    }
}






class Interface {
    public static void main(String[] args) {
        Bicycle b1 = new Bicycle();
        b1.Speed(50);
        b1.Gear(3);
        b1.Display();
        b1.Speed_up(30);
        b1.Gear_change(4);
        b1.Display();
        b1.Apply_break();
        b1.Gear_change(0);
        b1.Display();
        
        Car c1= new Car();
        c1.Speed(80);
        c1.Gear(4);
        c1.Display();
        c1.Speed_up(60);
        c1.Gear_change(6);
        c1.Display();
        c1.Apply_break();
        c1.Gear_change(1);
        c1.Display();
    }
}