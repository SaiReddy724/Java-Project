class Student{
    private int roll;
     private String name;
     private boolean isAttended; 
     public Student(int roll){
        this.roll=roll;
     }
     public void StudentAttendence(boolean isAttended){
        System.out.println("teach");
     }
     public boolean StudentAttend(){
          System.out.println("student");
           return isAttended;   
     } 
}
class EncapsulationEX{
    public static void main(String args[]){
        Student s=new Student(101);
        s.StudentAttendence(true);
        s.StudentAttend();
    }
}