package adapter;

public class XpaytoPayDadapter implements PayD{
	private String CardID;
	private String CardOwner;
	private double Balance;
	private final Xpay xpay;
	
	public XpaytoPayDadapter (Xpay xpay) {
		this.xpay = xpay;
		setProp();
		
	}
	

	@Override
	public String getCardID() {
	
		
		return CardID;
	}

	@Override
	public String getCardOwner() {
		return CardOwner;
	}

	@Override
	public double getBalance() {
		return Balance;
	}

	@Override
	public void setCardID(String CardID) {
		this.CardID= CardID;
		
	}

	@Override
	public void setCardOwner(String CardOwner) {
	  this.CardOwner = CardOwner;
		
	}

	@Override
	public void setBalance(double Balance) {
		this.Balance = Balance;
		
	}
    private void setProp() {
    	setCardOwner(this.xpay.getCustName());
    	setCardID (this.xpay.getCardNo());
    	setBalance(this.xpay.getAmount());
    }
}
