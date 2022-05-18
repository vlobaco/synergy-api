package synergy.api;

import java.util.ArrayList;
import java.util.List;

public class Process extends Component {
	//private List<Field> fields;
	
	public Process() {
		this(null, null, null);
	}
	
	public Process(Integer id, String name, String description) {
		super(id, name, description);
		//fields = new ArrayList<>();
	}
	
	/*
	public List<Field> getFields() {
		return fields;
	}
	
	public void addField(Field field) {
		this.getFields().add(field);
		if (field.getProcess() != this) {
			field.setProcess(this);
		}
	}
	*/
	
	@Override
	public String toString() {
		return "Process [name=" + getName() 
		+ ", description=" + getDescription() 
		+ "]";
	}
	
	
}
