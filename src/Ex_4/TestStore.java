package Ex_4;

public class TestStore {
    public static void main(String[] args) {
        Store s = new Store("Ronbi", "Ahad Ha'Am", "Nikolay" );
        System.out.println(s.getM_owner_name());
        System.out.println(s.getName());
        System.out.println(s.getAddress());

    }
}
