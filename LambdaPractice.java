package Java8Features;

interface FirstLambda{

    void test(int a, String b);

    default void show (){
        System.out.println("default method of interface");
    }
}
public class LambdaPractice {

    public static void main(String[] args) {

        FirstLambda ref = (int c, String d)->{

            System.out.println(c);
            System.out.println(d);
        };
        ref.test(1000, "Java programing");
    }

}
