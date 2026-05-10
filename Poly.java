class Cal{
    public void add(){
        System.out.println("hello");

    }

}
class sub extends Cal{
    public void add(){
        System.out.println("world");
    }

}
class Poly{
    public static void main(String args[]){
        sub c=new sub();
        c.add();

    }
}
