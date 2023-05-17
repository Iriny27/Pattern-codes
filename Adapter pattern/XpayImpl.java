package adapter;

public class XpayImpl implements Xpay {
	private String CardNo;
	private String CustomerName;
	private double Amount;

	@Override
	public String getCardNo() {
	
		return CardNo;
	}

	@Override
	public String getCustName() {
		return CustomerName;
	}

	@Override
	public double getAmount() {
		return Amount;
	}

	@Override
	public void setCardNo(String CardNo) {
	  this.CardNo = CardNo;
		
	}

	@Override
	public void setCustName(String CustomerName) {
		this.CustomerName = CustomerName;
		
	}

	@Override
	public void setAmount(double Amount) {
		 this.Amount=Amount;	
	}

}
