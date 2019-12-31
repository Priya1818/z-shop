package zshop;

public class ZShopDemo {
@Override
	public String toString() {
		return "ZShopDemo [Income=" + Income + ", Profit=" + Profit + "]";
	}
private int Income;
private int Profit;
public ZShopDemo() {
	super();
	// TODO Auto-generated constructor stub
}
public int getIncome() {
	return Income;
}
public void setIncome(int income) {
	Income = income;
}
public int getProfit() {
	return Profit;
}
public void setProfit(int profit) {
	Profit = profit;
}
}
