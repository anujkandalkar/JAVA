class Singleton{

    private static Singleton obj = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){

        return obj;

    }

}

public class SingletoneDesign{

    public static void main(String args[]){

        Singleton conn1=Singleton.getInstance();

        Singleton conn2=Singleton.getInstance();

        System.out.println(conn1==conn2);

    }

}