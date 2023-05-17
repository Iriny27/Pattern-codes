package adapter;

public interface PayD {
	public String getCardID();
	public String getCardOwner();
	public double getBalance();
	public void setCardID(String CardID);
	public void setCardOwner(String CardOwner);
	public void setBalance(double Balance);
}
