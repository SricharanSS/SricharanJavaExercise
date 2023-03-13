package MohanShopping;

public class ItemMaster {
	private int itemNo;
	private String itemDes;
	private int itemPrice;
	private int itemUnit;
	
	ItemMaster(int itemNo, String itemDes, int itemPrice, int itemUnit) {
		this.itemNo = itemNo;
		this.itemDes = itemDes;
		this.itemPrice = itemPrice;
		this.itemUnit = itemUnit;
	}
	
	
	/* Setter Methods */
	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}
	public void setItemDes(String itemDes) {
		this.itemDes = itemDes;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
	public void setItemUnit(int itemUnit) {
		this.itemUnit = itemUnit;
	}
	
	/* Getter Methods */
	public int getItemNo() {
		return itemNo;
	}
	public String getItemDes() {
		return itemDes;
	}
	public int getItemPrice() {
		return itemPrice;
	}
	public int getItemUnit() {
		return itemUnit;
	}
}
