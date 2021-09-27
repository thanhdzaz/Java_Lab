package exam;

/**
 *
 * @author robin
 */
import java.util.*;
import java.util.Map.Entry;

public class main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, String> details = new HashMap<String, String>();

        String ten = null;
        String sdt;
        int a = 0;
        while(a<10) {
            System.out.println("sv "+(a+1));
            System.out.println("nhap ten (nhap x de dung lai): ");
            ten = sc.nextLine();
            if((ten.equals("x") == true) || (ten.equals("X") == true)) break;
            System.out.println("nhap sdt: ");
            sdt = sc.nextLine();
            details.put(ten, sdt);
            a++;
        }
        Set<Entry<String, String>> set = details.entrySet();

        Iterator<Entry<String, String>> i = set.iterator();

        while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            System.out.print("ten: "+me.getKey());
            System.out.println("   sdt: "+me.getValue());
        }
        System.out.println();
    }
}
