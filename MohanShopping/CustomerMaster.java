package MohanShopping;

public class CustomerMaster {
	private int customerId;
	private String customerName;
	private String customerAddress;
	
	CustomerMaster(int customer_id, String customer_name, String customer_address) {
		this.customerId = customer_id;
		this.customerName = customer_name;
		this.customerAddress = customer_address;
	}
	
	/* Setter Methods */
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	/* Getter Methods */
	public int getCustomerId() {
		return customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
}
