import java.math.BigDecimal;

public class monetary {
    public static void main(String[] args) {
        // BigDecimal b1 = new BigDecimal(2.1);
        // BigDecimal b2 = new BigDecimal(2.2);

        // BigDecimal b3 = b1.add(b2);
        // System.out.println(b3);

        // BigDecimal b1 = BigDecimal.valueOf(2.1);
        // BigDecimal b2 = BigDecimal.valueOf(2.2);
        // BigDecimal b3 = b1.add(b2);
        // System.out.println("Example : " + b3);
        
        BigDecimal b1 = new BigDecimal("2.1");
        BigDecimal b2 = new BigDecimal("2.2");
        BigDecimal b3 = b1.add(b2);
        System.out.println(b3);
    }
}
