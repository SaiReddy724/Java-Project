interface IGust{
    public void read();
}
interface Idevloper {
           public void write();
    
}
 interface IAdmin extends IGust,Idevloper {
    public void man();

    
} 
class User implements IAdmin{
    public void read(){
        System.out.println("read code");
    }
    public void write(){
        System.out.println("write the code");
    }
     public void man(){
        System.out.println("write the code");
     }  

   
    public static void main(String[] args) {
        User us =new User();
        us.read(); 
        us.write();
        us.man();
    }
}
