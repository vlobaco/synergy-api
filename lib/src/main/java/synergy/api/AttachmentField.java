package synergy.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class AttachmentField extends Field {
	private URL url;
	private BufferedReader reader = null;
	
	public AttachmentField() {
		this(null, null, null, null, null);
	}
	
	public AttachmentField(Integer id, String name, String description, Boolean compulsory, URL url) {
		super(id, name, description, compulsory);
		this.url = url;
	}

	public BufferedReader getReader() {
		if (reader == null) {
			try {
				reader = new BufferedReader(
						new InputStreamReader(getURL().openStream()));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return reader;
	}

	public URL getURL() {
		return url;
	}

	public void setURL(URL url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "AttachmentField [id=" + getId()
				+ ", name=" + getName()
				+ ", nescription=" + getDescription() 
				+ ", compulsory=" + getCompulsory() 
				+ ", url=" + url
				+ "]";
	}
	
	
}
