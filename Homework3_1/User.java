package Homework3_1;

public class User {
    private String GameName;
    private int password;

    public void setGameName(String GameName) {
        this.GameName = GameName;
    }

    public String getGameName(){
        return GameName;
    }
    public void setpassword(int password){
        this.password = password;
    }
    public int getpassword(){
        return password;
    }

//    public User(String gameName, int password) {
//        GameName = gameName;
//        this.password = password;
//    }

    public User() {
    }
}
