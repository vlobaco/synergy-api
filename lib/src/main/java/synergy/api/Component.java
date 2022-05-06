package synergy.api;

public class Component {
	private Integer id;
	private String name;
	private String description;
	
	public Component() {
		this(null, null, null);
	}
	
	public Component(Integer id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return "Component [name=" + name + ", description=" + description + "]";
	}
	
	
}
