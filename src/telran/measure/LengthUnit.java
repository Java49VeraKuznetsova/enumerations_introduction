package telran.measure;



//import telran.measure.Length;

public enum LengthUnit {
M(1_000), KM(1_000_000), CM(10), MM(1), INCH(25.4f);
//	M(1), KM(1_000), CM(100), MM(0.001f);
private float value;

private LengthUnit(float value) {
	this.value = value;
}
public float getValue() {
	return value;
}


public Length between(Length length2, Length length1) {
	//TODO
	Length length1_cur = length1.convert(this);
	Length length2_cur = length2.convert(this);
	
	return new Length(length2_cur.getAmount() - length2_cur.getAmount(), this);
	//return length1_cur-length2_cur;
	
}
}
