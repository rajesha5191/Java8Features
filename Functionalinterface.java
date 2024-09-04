package Java8Features;

interface ABCD {

    void display();

    //void show();

    default void show (){
        System.out.println("This default method of ABCD interface");
    }
}

interface EFGH {

    void display ();

    default void show (){

        System.out.println("This default method of EFGH interface");
    }
}

public class Functionalinterface implements ABCD, EFGH{


    @Override
    public void display() {

    }

    @Override
    public void show() {
        EFGH.super.show();
    }

    public static void main(String[] args) {

        Functionalinterface obj = new Functionalinterface();
        obj.show();

    }

}
