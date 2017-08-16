import java.util.*;
/**
 * Write a description of class barangKodian here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class barangKiloan extends listBarang
{

        
    // instance variables - replace the example below with your own
    public double diskon, totalPrice;
    public String pname, buying;
     public void cetakPrint()
    {
        listProduct();
        System.out.println("Berikut product yang dapat anda beli secara satuan");
        for (int i = 0; i < product.size(); i++)
        {
            if (product.get(i).type.equals("product Satuan"))
            {
               
                System.out.println (" " +product.get(i).pname);
                System.out.println ("  Stok: " +product.get(i).qty);
            }
        }
    }
    
    public void updateQty()
    {
        for (int i = 0; i < product.size(); i++)
        {
            if (product.get(i).type.equals("product Satuan"))
            {
                if (product.get(i).pname.equals(buying))
                {
                    product.get(i).qty = product.get(i).qty - jumlah;
                    System.out.println ("jumlah product " +product.get(i).pname + " adalah " +product.get(i).qty);
                    
                }
            }
        }
    }
    
    public void totalPrice()
    {
        for (int i = 0; i < product.size(); i++)
        {
            if (product.get(i).type.equals("Eceran"))
            {
                if (product.get(i).pname.equals(buying))
                {
                    if (product.get(i).qty > jumlah)
                    {
                        if (jumlah >= 10)
                        {
                            totalPrice = jumlah * product.get(i).price;
                            diskon = totalPrice - (0.05 * totalPrice);
                            System.out.println ("Harga Akhir "+diskon);
                        }
                        else
                        {
                            /*
                             * menghitung harga product yang dibeli
                             */
                            totalPrice = jumlah * product.get(i).price;
                            System.out.println ("Total harga adalah "+totalPrice);
                        }
                        updateQty();
                    }
                    else
                    {
                        System.out.println ("Maaf stok tidak tersedia");
                        System.out.println ("Stok yang ada adalah "+product.get(i).qty);
                    }
                }
            }
        }
    }
    
    
    public void buy()
    {
        cetakPrint();
        Scanner s = new Scanner (System.in);
        System.out.println ("Masukkan nama product : ");
        buying= s.next();
        System.out.println ("Masukkan berapa jumlah yang akandi beli: ");
        jumlah = s.nextInt();
        for (int i = 0; i < product.size(); i++)
        {
            if (product.get(i).type.equals("Satuan"))
            {
                if (buying.equals(product.get(i).pname))
                {
                    totalPrice();
                }
            }
        }
}
}
