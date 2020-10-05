import java.util.Arrays;

public class User {
    private String firstname;
    private String lastname;
    private int age;
    private String email;
    private String status;
    private String timestamp;

    public User(String firstname, String lastname, int age, String email, String status, String timestamp) throws InvalidDateException {
        isDateValid(timestamp);
        isStatusValid(status);
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.email = email;
        this.status = status;
        this.timestamp = timestamp;
        UserList.addAccount(this);
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public static void isDateValid(String timestamp) throws InvalidDateException{
        String[] dateIn = timestamp.split("-");

        if(!(timestamp.length()==10)&&!(timestamp.charAt(4)=='-')&&!(timestamp.charAt(7)=='-')){
            throw new InvalidDateException("Invalid date format, should be yyyy-mm-dd");
        }

        if ((Integer.parseInt(dateIn[0])>2020)){
            throw new InvalidDateException("Invalid  date, year cannot be "+dateIn[0]);
        }
        if ((Integer.parseInt(dateIn[1])<1)&&(Integer.parseInt(dateIn[1])>12)){
            throw new InvalidDateException("Invalid date, month cannot be "+dateIn[1]);
        }

        if ((Integer.parseInt(dateIn[2])<1)&&(Integer.parseInt(dateIn[2])>31)) {
            throw new InvalidDateException("Invalid date, day cannot be " + dateIn[2]);
        }
    }

    public static void isStatusValid(String status) throws InvalidDateException{
        String st1 = "ACTIVE";
        String st2 = "INACTIVE";
        String st3 = "NEW";
        String st4 = "BLOCKED";
        if(!((status.equals(st1)) || (status.equals(st2)) || (status.equals(st3)) || (status.equals(st4)))){
            throw new InvalidDateException("Invalid status, status cannot be " + status);
        }

    }



    @Override
    public String toString() {
        return  "First name:" + firstname +
                ", Last name:" + lastname +
                ", age:" + age +
                ", email:" + email +
                ", status:" + status +
                ", timestamp:" + timestamp;
    }
}
