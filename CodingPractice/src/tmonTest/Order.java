package tmonTest;

import java.util.List;

public class Order {
	private String OrderId;
	private String UserId;
	private Product Product;
	private List<Option> OptionList;
	
	public Order(String orderId, String userId, Product product, List<Option> optionList){
		this.OrderId = orderId;
		this.UserId = userId;
		this.Product = product;
		this.OptionList = optionList;
	}
	
	public String getOrderId(){
		return this.OrderId;
	}
	public String getUserId(){
		return this.UserId;
	}
	
	public Product getProduct(){
		return this.Product;
	}
	
	public List<Option> getOptionList(){
		return this.OptionList;
	}
}
