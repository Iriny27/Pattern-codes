package adapter;

public interface Xpay {
	public String getCardNo();
	public String getCustName();
	public double getAmount();
	public void setCardNo(String CardNo);
	public void setCustName(String CustomerName);
	public void setAmount(double Amount);

}
