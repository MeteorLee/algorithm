package 문제풀이.문자열.이론;

public class StringEx {
    public static void main(String[] args) {

        String str_literal1 = "test";
        String str_literal2 = "test";
        String str_object1 = new String("test");
        String str_object2 = new String("test");

        System.out.println("(str_literal1 == str_literal2) = " + (str_literal1 == str_literal2));
        System.out.println("(str_literal1 == str_object1) = " + (str_literal1 == str_object1));
        System.out.println("(str_object1 == str_object2) = " + (str_object1 == str_object2));

        System.out.println("str_literal1.equals(str_literal2) = " + str_literal1.equals(str_literal2));
        System.out.println("(str_literal1.equals(str_object1)) = " + (str_literal1.equals(str_object1)));
        System.out.println("(str_object1.equals(str_object2)) = " + (str_object1.equals(str_object2)));


    }
}
