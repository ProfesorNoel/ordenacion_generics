package aaa.module4.java.generics.soccer;

import java.util.ArrayList;
import java.util.List;

import aaa.module4.java.generics.soccer.comparators.OrderByReverse;

public class Team <T>{
	
	private List <T> members;
	
	public Team(){
		super();
	}
	
	public Team (List <T> members){
		this.members = members;
	}
	
	public void addMember(T member){
		if(this.members == null)
		{
			this.members = new ArrayList <T> ();
		}
		
		this.members.add(member);
	}
	
	public void setMembers (List <T> members){
		this.members = members;
	}
	
	public List <T> getMembersByFieldReverse(String fieldName){
		@SuppressWarnings({ "rawtypes", "unchecked" })
		OrderByReverse <T> comp = new OrderByReverse (fieldName, this.members);
		
		return comp.order();
	}

	public List <T> getMembers(){
		return this.members;
	}
}
