public class Constructor {
    public static void main(String[] args) {
        Student st = new Student();
        Student st2 = new Student("Rahul");
    }    
}

class Student{
    String name;
    int rollNum;

    Student(){
        System.out.println("Student contructor is called");
    }

    Student(String name){
        this.name = name;
    }
    
}
