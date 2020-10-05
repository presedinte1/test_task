import java.time.LocalDate;
import java.util.Date;

public class Application {


    public static void main(String [] args) throws InvalidDateException {

        User user1 = new User("Ivan", "Ivanov", 25, "ivan@gmail.com", "NEW", "2020-01-05");
        User user2 = new User("Ecaterina", "Ivanov", 35, "ivan2@gmail.com", "NEW", "2020-10-02");
        User user3 = new User("Mihai", "Mihailov", 48, "mihai@gmail.com", "ACTIVE", "2020-05-25");
        User user4 = new User("Stanislav", "Mihailov", 18, "mihai22@gmail.com", "ACTIVE", "2020-08-19");
        User user5 = new User("Elena", "Sirbu", 21, "sirbu@gmail.com", "INACTIVE", "2017-12-22");
        User user6 = new User("Maria", "Sirbu", 36, "sirbu@gmail.com", "INACTIVE", "2020-09-16");
        User user7 = new User("Gheorg", "Silov", 44, "silov@gmail.com", "NEW", "2020-10-04");
        User user8 = new User("Irina", "Silova", 32, "silova@gmail.com", "NEW", "2020-04-17");

        UserList.getListofUsers();

        System.out.println("Today is the date: " + UserList.today);

        UserList.createActiveUsers();

        UserList.getListofUsers();

        UserList.makeBlockedUsers();

        UserList.getListofUsers();


    }



}
