package qum.model;

public class User {

    private int id;
    private String name;
    private String password;
    private String email;
    private int acc_lvl;
    private int coins;

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String pass) {
	this.password = pass;
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public int getAcc_lvl() {
	return acc_lvl;
    }

    public void setAcc_lvl(int acc_lvl) {
	this.acc_lvl = acc_lvl;
    }

}
