
/**
 * Write a description of class Produk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class Product implements java.io.Serializable {
    
    public String pid;
    public String pname, type;
    public double qty;
    public double price;

    public Product(){}
    public Product(String pid, String pname, int qty, double price, String type) {
        this.pid = pid;
        this.pname = pname;
        this.qty = qty;
        this.price = price;
        this.type = type;
    }
    
    public void setPid(String pid) {
        this.pid = pid; 
    }

    public void setPname(String pname) {
        this.pname = pname; 
    }

    public void setType()
    {
        this.type =type;
     }

    public void setQty(int qty) {
        this.qty = qty; 
    }

    public void setPrice(double price) {
        this.price = price; 
    }

    public String getPid() {
        return (this.pid); 
    }

    public String getPname() {
        return (this.pname); 
    }

    public double getQty() {
        return (this.qty); 
    }
    
    public String getType()
    {
        return type;
    }
    
    
    public double getPrice() {
        return (this.price); 
    }

    public String toString() {
        String sep = System.getProperty("line.separator");
        StringBuffer buffer = new StringBuffer();
        buffer.append(sep);
        buffer.append("----- Product Detail ----- ");
        buffer.append(sep);
    buffer.append("\tpid = ");
        buffer.append(pid);
        buffer.append(sep);
        buffer.append("\tpname = ");
        buffer.append(pname);
        buffer.append(sep);
        buffer.append("\tqty = ");
        buffer.append(qty);
        buffer.append(sep);
        buffer.append("\tprice = ");
        buffer.append(price);
        buffer.append(sep);
        buffer.append("\ttype= ");
        buffer.append(price);
        buffer.append(sep);
        return buffer.toString();
    }//toString

}//class