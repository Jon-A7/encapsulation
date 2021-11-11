package encapsulation;

public class Encapsulation {
	
	private String str;
	private int integer;
	private double doubleVar;
	private float floater;
	private long longVar;
	
	public Encapsulation() {
		
	}
	
	public Encapsulation(String str, int integer, double doubleVar,
			float floater, long longVar) {
		this.str = str;
		this.integer = integer;
		this.doubleVar = doubleVar;
		this.floater = floater;
		this.longVar = longVar;
		
	}
	
	public String getStr() {
		return str;
	}
	
	public void setStr(String str) {
		this.str = str;	
	}
//	Getters and setters do what the constructor can do
//	but can do it for individual variables.

	public int getInteger() {
		return integer;
	}

	public void setInteger(int integer) {
		this.integer = integer;
	}

	public double getDoubleVar() {
		return doubleVar;
	}

	public void setDoubleVar(double doubleVar) {
		this.doubleVar = doubleVar;
	}

	public float getFloater() {
		return floater;
	}

	public void setFloater(float floater) {
		this.floater = floater;
	}

	public long getLongVar() {
		return longVar;
	}

	public void setLongVar(long longVar) {
		this.longVar = longVar;
	}
	}
