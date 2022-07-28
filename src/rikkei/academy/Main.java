package rikkei.academy;

public class Main {
    public static void main(String[] args) {
        Fan fan1= new Fan(3,true,10,"yellow" );
        Fan fan2= new Fan(2,false,5, "blue");
//        fan1.setSpeed(3);
//        fan1.setRadius(10);
//        fan1.setColor("yellow");
//        fan1.setStatus(true);
        System.out.println("fan1====="+fan1);
        System.out.println("fan2====="+fan2);
    }

}
