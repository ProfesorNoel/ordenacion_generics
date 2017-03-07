package aaa.module4.java.generics.soccer.comparators;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrderByReverse<T> implements Comparator<T> {

	private String orderFieldName;
	private List <T> elements;
	
	public OrderByReverse (String orderFieldName, List <T> elements)
	{
		this.orderFieldName = orderFieldName;
		this.elements = elements;
	}
	
	public List <T> order()
	{
		Collections.sort(elements, this);
		
		return this.elements;
	}
	
	@Override
	public int compare(T o1, T o2) {
		
		Field field = null;
		
		int response = -1;
		
		try {
			field = o1.getClass().getDeclaredField(orderFieldName);
			field.setAccessible(true);			
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		
		String fieldFromOneToString = null;
		String fieldFromTwoToString = null;
		
		try {
			fieldFromOneToString = field.get(o1).toString();
			fieldFromTwoToString = field.get(o2).toString();
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
	
		response *= fieldFromOneToString.compareTo(fieldFromTwoToString);
		
		return response;
	}
}
