package Task_2;

public class Document {
    private String contractNum;
    private String email;
    private String phoneNum;

    public String getContractNum() {
        return contractNum;
    }

    public void setContractNum(String contractNum) {
        this.contractNum = contractNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "\ncontractNum = " + contractNum +
                ",\nemail = " + email +
                ",\nphoneNum = " + phoneNum + "\n";
    }
}
