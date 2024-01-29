public class User {
    String name;
    String password;
    int id;
    String gender;
    int age;
    Account userAcc;

    public User(String name, String password, int id, String gender, int age) {
        this.name = name;
        this.password = password;
        this.id = id;
        this.gender = gender;
        this.age = age;
    }
    public String getName() {
        return this.name;
    }
    public int getId() {
        return this.id;
    }

}
