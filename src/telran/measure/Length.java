package telran.measure;

public class Length implements Comparable<Length> {
    private  float amount;
    private  LengthUnit unit;
    
    
	
	public Length(float amount, LengthUnit unit) {
		// TODO Auto-generated constructor stub
		super();
			
		this.amount = amount;
		this.unit = unit;
		
	}

	@Override
	public int compareTo(Length length) {
		//  Auto-generated method stub
		
		return Float.compare(amount, length.convert(unit).amount);
	}

	public Length convert(LengthUnit lengthUnit) {
		//  Auto-generated method stub
		return new Length( unit.getValue() * amount / lengthUnit.getValue(), lengthUnit);
	}
	
	@Override
	public boolean equals (Object obj) {
		
		boolean res = false;
		
		if (obj == this) {
			res = true;
		} else	if (obj != null &&  obj.getClass() == this.getClass()) {
		
		Length lenght = ((Length) obj).convert(this.unit);
		res =  (Float.compare(lenght.getAmount(), amount) == 0);
		}
		return res;
	}
	public float getAmount() {
		//  Auto-generated method stub
		return amount;
	}



	public LengthUnit getUnit() {
		//  null;
		return unit;
	}

	

	@Override
	public String toString() {
		//
		//return "Length [amount=" + amount + "]";
		return Float.toString(amount) + unit.toString();
	}

}
