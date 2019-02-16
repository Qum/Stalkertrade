package qum.model;

public class Product {

    private int id;
    private String prod_name;
    private int cost;
    private String desc;
    private int count;

    public int getCount() {
	return count;
    }

    public void setCount(int count) {
	this.count = count;
    }

    private String type;

    public String getType() {
	return type;
    }

    public void setType(String type) {
	this.type = type;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getProd_name() {
	return prod_name;
    }

    public void setProd_name(String prod_name) {
	this.prod_name = prod_name;
    }

    public int getCost() {
	return cost;
    }

    public void setCost(int cost) {
	this.cost = cost;
    }

    public String getDesc() {
	return desc;
    }

    public void setDesc(String desc) {
	this.desc = desc;
    }

}
