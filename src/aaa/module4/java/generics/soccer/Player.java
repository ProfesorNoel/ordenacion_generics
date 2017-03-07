package aaa.module4.java.generics.soccer;

public class Player {
	
	private Integer number;
	private String name;
	
	public Player (Integer number, String name){
		this.number = number;
		this.name = name;
	}
	
	public Integer getNumber() {
		return number;
	}
	
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString()aaa.module4.java.generics{
		return this.number.toString() + " - " + this.name; 
	}
}
