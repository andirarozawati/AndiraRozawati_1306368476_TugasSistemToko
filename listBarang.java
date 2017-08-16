import java.util.*;
/**
 * Write a description of class listBarang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class listBarang
{
    // instance variables - replace the example below with your own
   
    public String pid;
    public String pname;
    public int qty;
    public double price, jumlah;
    public static ArrayList<Product> product = new ArrayList<Product>();
    /**
     * Constructor for objects of class listBarang
     */
    public listBarang()
    {
        // initialise instance variables
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getQty()
    {
        return qty;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public String getPname()
    {
        return pname;
    }
    
    public void setPname()
    {
        this.pname = pname;
    }
    
    public void setQty()
    {
        this.qty = qty;
    }
    
    public void setPrice()
    {
        this.price = price;
    }
    
    public void listProduct()
    {
        Product p1 = new Product ("01" , "Mie instan" , 10 , 1000,"Barang Satuan");
        Product p2 = new Product ("02" , "Telor", 20, 500, "Barang Satuan");
        Product p3 = new Product ("03" , "Kecap", 20, 5000,"Barang Satuan");
        Product p4 = new Product ("04" , "Kopi kemasan", 30, 1500,"Barang Satuan");
        Product p5 = new Product ("05" , "Gula", 40, 3500, "Barang Kiloan");
        Product p6 = new Product ("06" , "Beras", 50, 6500, "Barang Kiloan");
        Product p7 = new Product ("07" , "Tepung", 30, 4500, "Barang Kiloan");
        Product p8 = new Product ("08" , "Telur Kiloan", 30, 7500, "Barang Kiloan");
        
        product.add(p1);
        product.add(p2);
        product.add(p3);
        product.add(p4);
        product.add(p5);
        product.add(p6);
        product.add(p7);
        product.add(p8);
       
        
    }
    
    public void daftarProduct()
    {
        for (int i = 0; i < product.size(); i++)
        {
            System.out.println (" " +product.get(i).pname + "(" +product.get(i).qty   +product.get(i).price + ")");
        }
    }
    
   
    abstract void cetakPrint();
    
    
    abstract void buy();
    
    
    abstract void totalPrice();
    
    abstract void updateQty();
}
