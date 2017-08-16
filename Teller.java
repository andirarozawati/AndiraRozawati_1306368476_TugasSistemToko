import java.util.*;
/**
 * Write a description of class Teller here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Teller
{
    public static int chs;
    public Teller()
    {
        
    }
    
    public static void main (String[] args)
    {
        System.out.println ("Masukkan nomer jenis barang yang ingin Anda beli: ");
        System.out.println ("1. Eceran \n2. Kodian \n3. Kiloan");
        Scanner s = new Scanner (System.in);
        chs = s.nextInt();
        switch (chs)
        {
            case 1:
                listBarang t1 = new productSatuan();
                t1.buy();
                break;
            case 2:
                listBarang t2 = new barangKodian();
                t2.buy();
                break;
            case 3:
               listBarang t3 = new barangKiloan();
               t3.buy();
               break;       
         }
    }
    
}
