public class User {
    String name;
    String password;
    int id;
    String gender;
    int age;
    Account userAcc;

    public User(String name, String password, int id, String gender, int age, Account userAcc) {
        this.name = name;
        this.password = password;
        this.id = id;
        this.gender = gender;
        this.age = age;
        this.userAcc = userAcc;
    }

}
