package Ex_7;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Guitar {
    private final String m_brand;
    private final boolean m_is_electric;
    private final int m_number_of_strings;
    private float m_price;
    private boolean m_tuned;

    public void tuneGuitar(){
        System.out.println("The guitar is tuned ! ");
        m_tuned = true;
    }

    public Guitar(String m_brand, boolean m_is_electric, int m_number_of_strings, float m_price, boolean m_tuned) {
        this.m_brand = m_brand;
        this.m_is_electric = m_is_electric;
        this.m_number_of_strings = m_number_of_strings;
        this.m_price = m_price;
        this.m_tuned = m_tuned;
    }
    public Guitar(String m_brand, boolean m_is_electric) {
        this(m_brand,m_is_electric, 6, 50, true);
    }

    public Guitar(String m_brand) {
        this(m_brand, false);
    }
}
