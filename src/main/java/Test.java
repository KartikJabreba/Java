import java.util.ArrayList;

public class Test {
    public static boolean toCity(String[] cities, String city) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < cities.length; i++) {
            arrayList.add(cities[i]);

        }
        if (arrayList.contains(city)) return true;
        return false;
    }

    public static void main(String[] args) {
        String[] cities = {"A", "B", "C", "D"};
        if (toCity(cities, "e")) System.out.println("true");
        else System.exit(123);
    }
}