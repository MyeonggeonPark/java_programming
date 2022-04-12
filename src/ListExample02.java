import java.util.ArrayList;

public class ListExample02 {
    public static void main(String[] args) {
        ArrayList<String> foods = new ArrayList<String>();

        foods.add("치킨");
        foods.add("피자");

        foods.remove("치킨");

        System.out.println(foods);
    }
}
