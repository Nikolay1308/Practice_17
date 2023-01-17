package Ex_13;

public class Surgeon extends Doctor{
    private String m_department;
    private int m_yearsOfExperience;

    public Surgeon(int mDoctorId, String mDoctorName, String mHospital) {
        super(mDoctorId, mDoctorName, mHospital);
    }

    public String getM_department() {
        return m_department;
    }

    public void setM_department(String m_department) {
        this.m_department = m_department;
    }

    public int getM_yearsOfExperience() {
        return m_yearsOfExperience;
    }

    public void setM_yearsOfExperience(int m_yearsOfExperience) {
        this.m_yearsOfExperience = m_yearsOfExperience;
    }
    public  void operate(){
        System.out.println("Starting to operate... ");
    }
}
