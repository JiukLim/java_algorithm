package tmonTest;

public class Option {
	private String Code;
	private Integer Price;
	private String Name;
	private String Description;
	public Option(String code, Integer price, String name, String description){
		this.Code = code;
		this.Price = price;
		this.Name = name;
		this.Description = description;
	}
	public void setCode(String code){
		this.Code = code;
	}
	public String getCode(){
		return this.Code;
	}
	public void setPrice(Integer price){
		this.Price = price;
	}
	public Integer getPrice(){
		return this.Price;
	}
	public void setName(String name){
		this.Name = name;
	}
	public String getName(){
		return this.Name;
	}
	public void setDescription(String description){
		this.Description = description;
	}
	public String getDescription(){
		return this.Description;
	}
	
}
