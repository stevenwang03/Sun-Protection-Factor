public class SPFTester {
    
     public static void main(String[] args) {
        
         SPF s = new SPF(18, 30);
         s.sunscreenTime();
         s.precentUVB();
         System.out.println(s.getUVB());
         System.out.println(s.getBurnTime());
     }
}
