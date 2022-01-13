package JDBC快速入门;

/**
 * @author: zcl
 * @create: 2022/1/13 15:08
 */
public class User {
    private int id;
    private String username;
    private String password;
    private String nickname;
    //提供get/set方法 Alt+Insert public User()
    // { }
    // public User(int id, String username, String password, String nickname)
    // { this.id = id; this.username = username; this.password = password; this.nickname = nickname; }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", username='" + username + '\'' + ", password='" + password + '\'' + ", nickname='" + nickname + '\'' + '}';
    }
}

