package synergy.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateField extends Field {
	private Date date;
	private SimpleDateFormat format;
	
	public DateField() {
		this(null, null, null, null, null);
	}

	public DateField(Integer id, String name, String description, Boolean compulsory, Date date) {
		super(id, name, description, compulsory);
		this.date = date;
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	private SimpleDateFormat getFormat() {
		if (format == null) {
			format = new SimpleDateFormat("dd-MM-yyyy hh:mm");
		}
		return format;
	}

	public void parce(String formattedDate) {
		try {
			setDate(getFormat().parse(formattedDate));
		} catch (ParseException e) {
			e.printStackTrace();
		};
	}
	
	public String getDateAsString() {
		return getFormat().format(date);
	}

	@Override
	public String toString() {
		return "DateField [id=" + getId()
			+ ", name=" + getName() 
			+ ", description=" + getDescription()
			+ ", compulsory=" + getCompulsory() 
			+ ", date=" + getDateAsString()
			+ "]";
	}

}
