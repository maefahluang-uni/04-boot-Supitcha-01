package th.mfu.boot;

public class User {

    private String username ;
    private String firstname;
    private String lastname;
    private String email;

public User(){}
public User (String username , String firstname ,String lastname,String email){
        this.username=username;
        this.firstname=firstname;
        this.lastname=lastname;
        this.email=email;
}
public String getUsername(){
    reeturn=username;
}
public String getFirstname(){
    reeturn=firstname;
}
public String getLastname(){
    reeturn=lastname;
}
public String getEmail(){
    reeturn=email;
}
}