package Java8Features;

interface Addition{

    int add (int a, int b);
}

public class practice1 {

    public static void main(String[] args) {

        Addition ref = (int a, int b)->{

            int result = a + b;
            System.out.println("sum of two numbers: "+result);
            return result;
        };
        ref.add(10,20);

//        Addition sumCalculator = (x, y) -> x + y;
//        int result = sumCalculator.add(7, 6);
//        System.out.println("Sum 7,6): " + result);
//        result = sumCalculator.add(15, -35);
//        System.out.println("Sum 15, -35): " + result);
    }
}
