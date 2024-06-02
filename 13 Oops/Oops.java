public class Oops {
    public static void main(String[] args) {
        Pen pen = new Pen();
        
        pen.setColor("Blue");
        System.out.println(pen.color);

        pen.tip = 6;
        System.out.println(pen.tip);

        Account myAcc = new Account();
        myAcc.username = "rahuldhakad";

        System.out.println(myAcc.username);

        myAcc.setPassword("rahul123");
        myAcc.getPassword();
    }    
}

class Pen {
    String color ;
    int tip ;

    void setColor(String newColor){
        color = newColor;
    }

    void setTipSize(int size){
        tip = size;
    }
}

class Account{
    public String username ;
    private String password;

    void setUsername(String username){
        this.username = username;
    }

    void setPassword(String password){
        this.password = password;
    }

    void getPassword(){
        System.out.println(this.password);
    }


}
