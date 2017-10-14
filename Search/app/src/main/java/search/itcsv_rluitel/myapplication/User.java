package search.itcsv_rluitel.myapplication;

/**
 * Created by itcsv_rluitel on 10/13/17.
 */

public class User{
    private String username;
    private String fullname;
    private String password;
    private int age;
    private String phone;
    private String email;
    private String gender;
    private String address;
    private String admin;
    private String avatar;


    public User(String username, String fullname, String password, int age,String gender,
                String address, String phone,String email,String admin, String avatar) {
        this.username = username;
        this.fullname = fullname;
        this.password = password;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
        this.address = address;
        this.admin = admin;
        this.avatar = avatar;
    }
    public void setFullName(String nfullname){
        fullname = nfullname;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setPhone(String nphone){
        phone = nphone;
    }
    public void setPassword(String npassword)
    {
        password = npassword;
    }
    public void setEmail(String nemail) {
        email=nemail;
    }
    public void setAddress(String naddress){
        address=naddress;
    }
    public void setGender(String ngender){
        gender=ngender;
    }
    public void setAdmin(String admin) {
        this.admin = admin;
    }
    public void setName(String username) {
        this.username = username;
    }
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAdmin() {
        return admin;
    }
    public String getFullName(){
        return fullname;
    }
    public String getPassword()
    {
        return password;
    }
    public String getPhone(){
        return phone;
    }
    public int getAge(){
        return  age;
    }
    public String getEmail(){
        return email;
    }
    public String getGender(){
        return gender;
    }
    public String getAddress() {
        return address;
    }
    public String getName() {
        return username;
    }
    public String getAvatar() {
        return avatar;
    }


}
