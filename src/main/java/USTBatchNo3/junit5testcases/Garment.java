package USTBatchNo3.junit5testcases;

public class Garment{
	private String item;
	private int prize;
	private int count;
	private double sales;
	public Garment(String item,int prize, int count,double sales) {
		this.item=item;
		this.prize = prize;
		this.count = count;
		this.sales=sales;
	}
	public void setItem(String item) {
		this.item=item;
	}
	public String getItem() {
		return item;
	}
	public int getPrize() {
		return prize;
	}
	public void setPrize(int prize) {
		this.prize = prize;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
}
