package Ex_7;

public class TestGuitar {
    public static void main(String[] args) {
        Guitar g = new Guitar("Korg", false, 6, 50, true);
        g.tuneGuitar();
        System.out.println(g);
        System.out.println(g.getM_number_of_strings());
        System.out.println(g.getM_price());
    }
}
