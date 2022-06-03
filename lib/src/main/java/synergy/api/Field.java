package synergy.api;

public class Field extends Component{
	private Boolean compulsory;
	private Process process;
	
	public Field() {
		this(null, null, null, null);
	}
	
	public Field(Integer id, String name, String description, Boolean compulsory) {
		super(id, name, description);
		this.compulsory = compulsory;
	}

	public Boolean getCompulsory() {
		return compulsory;
	}

	public void setCompulsory(Boolean compulsory) {
		this.compulsory = compulsory;
	}

	public Process getProcess() {
		return process;
	}

	public void setProcess(Process process) {
		this.process = process;
		if (!process.getFields().contains(this)) {
			process.addField(this);
		}
	}

	@Override
	public String toString() {
		return "Field [id=" + getId() +
				", name=" + getName() +
				", description=" + getDescription() +
				", compulsory=" + getCompulsory() + 
				", process=" + getProcess().toString() +
				"]";
	}
	
}
