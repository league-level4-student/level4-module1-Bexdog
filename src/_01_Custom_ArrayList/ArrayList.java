package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	private T[] arr;
	public ArrayList() {
		this.arr = (T[]) new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
	if(loc>=arr.length||loc<0) {
		throw new IndexOutOfBoundsException("Error! Error! You went out of bounds. Error! Error! list.get("+loc+") returning improper value.");
	}
	else {
		return arr[loc];
	}
	}
	
	public void add(T val) {
		T[] temp = (T[]) new Object[arr.length+1];
		for(int i = 0; i<arr.length;i++) {
			temp[i] = arr[i];
		}
		temp[arr.length] = val;
		arr = temp;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		
	}
	
	public boolean contains(T val) {
		
		return false;
	}
}