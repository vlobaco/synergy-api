package synergy.api;

public class NumberField extends Field {
	private Double number;
	private Double min;
	private Double max;
	
	public NumberField() {
		this(null, null, null, null, null, null, null);
	}
	
	public NumberField(Integer id, String name, String description, Boolean compulsory, Double min, Double max, Double number) {
		super(id, name, description, compulsory);
		this.min = min;
		this.max = max;
		this.number = number;
	}

	public Double getNumber() {
		return number;
	}

	public void setNumber(Double number) {
		this.number = number;
	}

	public Double getMin() {
		return min;
	}

	public void setMin(Double min) {
		this.min = min;
	}

	public Double getMax() {
		return max;
	}

	public void setMax(Double max) {
		this.max = max;
	}

	@Override
	public String toString() {
		return "NumberField [id" + getId()
		+ ", name=" + getName() 
		+ ", description=" + getDescription() 
		+ ", compulsory=" + getCompulsory()  
		+ ", min=" + min 
		+ ", max=" + max 
		+ ", number=" + getNumber()
		+ "]";
	}
	
	
}
