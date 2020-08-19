
public class OrderedKeyValue implements Comparable<String>{

	private String key;
	private int value;
	
	public OrderedKeyValue(String key, int value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public int getValue() {
		return value;
	}

	@Override
	public int compareTo(String s) {
		// TODO Auto-generated method stub
		return key.compareTo(s);
	}
	
	

}
