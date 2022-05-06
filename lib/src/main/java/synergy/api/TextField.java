package synergy.api;

public class TextField extends Field {
	private String text;
	private Integer maxSize;
	
	public TextField() {
		this(null, null, null, null, null, null);
	}

	public TextField(Integer id, String name, String description, Boolean compulsory, Integer maxSize, String text) {
		super(id, name, description, compulsory);
		this.maxSize = maxSize;
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Integer getMaxSize() {
		return maxSize;
	}

	public void setMaxSize(Integer maxSize) {
		this.maxSize = maxSize;
	}

	@Override
	public String toString() {
		return "TextField [name=" + getName()
				+ ", description=" + getDescription()
				+ ", compulsory=" + getCompulsory()
				+ ", maxSize=" + maxSize 
				+ ", text=" + getText()
				+ "]";
	}

}
