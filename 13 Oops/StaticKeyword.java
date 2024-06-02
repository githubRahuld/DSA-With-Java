public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Rahul");
        System.out.println(s1.getName());

        s1.schoolName = "JUET";

        Student s2 = new Student();
        System.out.println(s2.schoolName);
        s2.schoolName = "Jay Jyoti School";
        System.out.println(s1.schoolName);
    }    
}

class Student{
    String name ;
    int rollNum;

    static String schoolName;

    static int percentage(int math,int phy,int chem){
        return (math+phy+chem)/3;
    }


    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }

}
