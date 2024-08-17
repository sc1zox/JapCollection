package WiSe_19_20_F;

public class User {
    private String username;
    private String password;

    public User(String username,String password){
        this.username=username;
        this.password=password;
    }

    public String getUsername() {
        return username;
    }
    public boolean changePassword(String oldPwd, String newPwd) {
        if(oldPwd.equals(this.password) && !oldPwd.equals(newPwd)){
            this.password = newPwd;
            return true;
        }else{
            System.err.println("Password wrong\n");
        }
        return false;
    }
}