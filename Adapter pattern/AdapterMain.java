package adapter;

public class AdapterMain {
   public static void main (String [] args) {
	   Xpay xpay = new XpayImpl();
	   xpay.setCustName("Warner");
	   xpay.setCardNo("58796243");
	   xpay.setAmount(100000);
	   
	   PayD payD = new XpaytoPayDadapter(xpay);
	   testPayD(payD);
	   
	   
   }
   
   private static void testPayD(PayD payD){
	   System.out.println(payD.getCardOwner());
	   System.out.println(payD.getCardID());
	   System.out.println(payD.getBalance());
	   }
}
