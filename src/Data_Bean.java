/**
 * Created by xuweijie on 2016/9/20.
 */
public class Data_Bean {
    private String User_name;
    private String Password;
    private String Email;
    private Observer observer;

    public Data_Bean(String user_name, String password, String email, Observer observer) {
        User_name = user_name;
        Password = password;
        Email = email;
        this.observer = observer;
    }

    public String getUser_name() {
        return User_name;
    }

    public void setUser_name(String user_name) {
        User_name = user_name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Observer getObserver() {
        return observer;
    }

    public void setObserver(Observer observer) {
        this.observer = observer;
    }
}
