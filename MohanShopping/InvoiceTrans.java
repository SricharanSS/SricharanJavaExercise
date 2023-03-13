package MohanShopping;

public class InvoiceTrans {
	private int invoiceNo;
	private int itemNo;
	private int itemQty;
	
	InvoiceTrans(int invoiceNo, int itemNo, int itemQty) {
		this.invoiceNo = invoiceNo;
		this.itemNo = itemNo;
		this.itemQty = itemQty;
	}
	
	/* Setter Methods */
	public void setInvoiceNo(int invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}
	public void setItemQty(int itemQty) {
		this.itemQty = itemQty;
	}
	
	/* Getter Methods */
	public int getInvoiceNo() {
		return invoiceNo;
	}
	public int getItemNo() {
		return itemNo;
	}
	public int getItemQty() {
		return itemQty;
	}
}
