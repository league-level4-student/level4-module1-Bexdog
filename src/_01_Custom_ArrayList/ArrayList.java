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
		if(loc>=arr.length||loc<0) {
			throw new IndexOutOfBoundsException("Error! Error! You went out of bounds. Error! Error! list.get("+loc+") returning improper value.");
		}
		else {
			arr[loc] = val;
		}
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] temp = (T[]) new Object[arr.length-1];
		if(loc>=arr.length||loc<0) {
			throw new IndexOutOfBoundsException("Error! Error! You went out of bounds. Error! Error! list.get("+loc+") returning improper value.");
		}
		else {
			
			for(int i = 0; i<arr.length-1;i++) {
				if(i>=loc) {
					temp[i] = arr[i+1];
					
				}
				else {
				temp[i] = arr[i];
				
				}
			}
			arr = temp;
		}
		
		
	}
	
	public boolean contains(T val) {
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]==val) {
				return true;
			}
		}
		return false;
	}

	public int size() {
		
		return arr.length;
	}
}