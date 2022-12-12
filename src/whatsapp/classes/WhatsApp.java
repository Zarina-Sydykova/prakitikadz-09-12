package whatsapp.classes;

public class WhatsApp {
    private long phoneNumber;
    private int password;
    private String nickName;

    public WhatsApp(long phoneNumber, int password, String nickName) {
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.nickName = nickName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "WhatsApp{" +
                "phoneNumber=" + phoneNumber +
                ", password=" + password +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
