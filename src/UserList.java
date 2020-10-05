import java.time.LocalDate;
import java.util.ArrayList;

public class UserList {
    static LocalDate today = LocalDate.now();
    static LocalDate yesterday = LocalDate.now().minusDays(1);
    static LocalDate oneMonthAgo = LocalDate.now().minusMonths(1);

    private static ArrayList <User> userList = new ArrayList<>();

    public static int getNumberOfUsers(){
        return userList.size();
    }

    public static void addAccount(User user){
        userList.add(user);
    }

    public static void getListofUsers(){
        int match = 0;
        for (int i=0; i<userList.size(); i++) {
            System.out.println(userList.get(i).toString());
        }
        System.out.println();
    }

    public static void createActiveUsers(){
        for (int i=0; i<userList.size(); i++) {
            LocalDate timestampDate = LocalDate.parse(userList.get(i).getTimestamp());
            if (timestampDate.isBefore(yesterday) && userList.get(i).getStatus()=="NEW"){
                userList.get(i).setStatus("ACTIVE");
            }
        }
    }

    public static void makeBlockedUsers(){
        for (int i=0; i<userList.size(); i++) {
            LocalDate timestampDate = LocalDate.parse(userList.get(i).getTimestamp());
            if (timestampDate.isBefore(oneMonthAgo) && userList.get(i).getStatus()=="INACTIVE"){
                userList.get(i).setStatus("BLOCKED");
            }
        }
    }

}
