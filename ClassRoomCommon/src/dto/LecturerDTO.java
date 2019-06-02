package dto;

public class LecturerDTO implements SuperDTO{

    private String lecid;
    private String name;
    private String nic;
    private int tpNo;
    private String lessonId;

    public LecturerDTO() {
    }

    public LecturerDTO(String lecid, String name, String nic, int tpNo, String lessonId) {
        this.lecid = lecid;
        this.name = name;
        this.nic = nic;
        this.tpNo = tpNo;
        this.lessonId = lessonId;
    }

    public String getLecid() {
        return lecid;
    }

    public void setLecid(String lecid) {
        this.lecid = lecid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public int getTpNo() {
        return tpNo;
    }

    public void setTpNo(int tpNo) {
        this.tpNo = tpNo;
    }

    public String getLessonId() {
        return lessonId;
    }

    public void setLessonId(String lessonId) {
        this.lessonId = lessonId;
    }

    @Override
    public String toString() {
        return "LecturerDTO{" +
                "lecid='" + lecid + '\'' +
                ", name='" + name + '\'' +
                ", nic='" + nic + '\'' +
                ", tpNo=" + tpNo +
                ", lessonId='" + lessonId + '\'' +
                '}';
    }
}
