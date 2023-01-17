package Ex_13;

public class FamilyDoctor {
    private boolean m_is_occupied;
    private String m_clinic;

    public boolean isM_is_occupied() {
        return m_is_occupied;
    }

    public void setM_is_occupied(boolean m_is_occupied) {
        this.m_is_occupied = m_is_occupied;
    }

    public String getM_clinic() {
        return m_clinic;
    }
    public void acceptClient(){
        if (m_is_occupied){
            System.out.println("The doc is busy.");
        }else m_is_occupied = true;
        System.out.println("Welcome ! ");
    }
    public  void finishApointment(){
        m_is_occupied = true;
    }
}
