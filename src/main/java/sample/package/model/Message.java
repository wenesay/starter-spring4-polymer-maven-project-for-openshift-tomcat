/**
 * 
 */
package sample.package.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Girishn
 *
 */
@XmlRootElement(name = "pizza")
public class Message {

	String name;
	String text;

	/**
	 * 
	 */
	public Message() {
		// TODO Auto-generated constructor stub
	}

	public Message(String name, String text) {
		this.name = name;
		this.text = text;
	}

	@XmlElement
	public String getName() {
		return name;
	}

	@XmlElement
	public String getText() {
		return text;
	}

}
