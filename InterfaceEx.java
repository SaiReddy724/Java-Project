interface Bike{
    public void color();
    public void speed();
    public void weight();
}
class Tvs implements Bike{
    public void color(){
        System.out.println("Red color");
    }
    public void speed(){
        System.out.println("60km");
    }
    public void weight(){
        System.out.println("150kg");
    }
    public void capacity(){
        System.out.println("two person");
    }
    
}
class Fz implements Bike{
    public void color(){
        System.out.println("black color");
    }
    public void speed(){
        System.out.println("120km");
    }
    public void weight(){
        System.out.println("180kg");
    }
    

}
class Ktm implements Bike{
    public void color(){
        System.out.println("green color");
    }
    public void speed(){
        System.out.println("150km");
    }
    public void weight(){
        System.out.println("200kg");
    }
    
}
class Re implements Bike{
    public void color(){}

}
public class InterfaceEx {
    public static void main(String[] args) {
    Tvs in = new Tvs();
    Fz it=new Fz();
    in.color();
    in.weight();
    in.speed(); 
    in.capacity(); 
    it.color();
    it.weight();
    it.speed(); 
    it.breake(); 
    Bike.num();

}
}