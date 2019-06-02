package dto;

public class StudentDTO {
    private String stId;
    private String name;
    private String nic;
    private int tpNo;

    public StudentDTO() {
    }

    public StudentDTO(String stId, String name, String nic, int tpNo) {
        this.stId = stId;
        this.name = name;
        this.nic = nic;
        this.tpNo = tpNo;
    }

    public String getStId() {
        return stId;
    }

    public void setStId(String stId) {
        this.stId = stId;
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

    @Override
    public String toString() {
        return "StudentDTO{" +
                "stId='" + stId + '\'' +
                ", name='" + name + '\'' +
                ", nic='" + nic + '\'' +
                ", tpNo=" + tpNo +
                '}';
    }
}
