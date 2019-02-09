package qum.model;

public class Product {
    
    private int id;
    private String prod_name;
    private int cost;
    private String desc;
    
    public int getId() {
	return id;
    }
    public void setId(int id) {
	this.id = id;
    }
    /**
     * @return the prod_name
     */
    public String getProd_name() {
        return prod_name;
    }
    /**
     * @param prod_name the prod_name to set
     */
    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }
    /**
     * @return the cost
     */
    public int getCost() {
        return cost;
    }
    /**
     * @param cost the cost to set
     */
    public void setCost(int cost) {
        this.cost = cost;
    }
    /**
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }
    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

}
