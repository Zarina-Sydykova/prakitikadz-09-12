package whatsapp.classes;

import whatsapp.enums.Gender;
import whatsapp.enums.Region;
import whatsapp.enums.Status;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Profile {
   private long ID;
   private String userName;
   private String password;
   private Integer phoneNumber;
   private List<String> message = new ArrayList<>();
   private Status status;

    public Profile(long ID, String userName, String password, Integer phoneNumber, List<String> message, Status status) {
        this.ID = ID;
        this.userName = userName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.message = message;
        this.status = status;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<String> getMessage() {
        return message;
    }

    public void setMessage(List<String> message) {
        this.message = message;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "ID=" + ID +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", message=" + message +
                ", status=" + status +
                '}';
    }
}
