package Ex_13;

public class Doctor {
    private final int m_doctor_id;
    private final String m_doctor_name;
    private String m_hospital;

    public Doctor(int mDoctorId, String mDoctorName, String mHospital) {
        m_doctor_id = mDoctorId;
        m_doctor_name = mDoctorName;
        m_hospital = mHospital;
    }

    public int getM_doctor_id() {
        return m_doctor_id;
    }

    public String getM_doctor_name() {
        return m_doctor_name;
    }

    public String getM_hospital() {
        return m_hospital;
    }

    public void setM_hospital(String m_hospital) {
        this.m_hospital = m_hospital;
    }
}
