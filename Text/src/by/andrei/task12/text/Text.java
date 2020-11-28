package by.andrei.task12.text;

import java.util.ArrayList;
import java.util.List;

public class Text {
	private List<Sentence> text;
	private String head;
	
	public Text () {
		text = new ArrayList<Sentence>();
	}

	public List<Sentence> getText() {
		return text;
	}
	
	public void setHead (String head) {
		this.head = head;
	}
	
	public String getHead() {
		return head;
	}
	
	public void setText (List<Sentence> text) {
		this.text = text;
	}
	
	public void addSentence(Sentence s) {
		text.add(s);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((head == null) ? 0 : head.hashCode());
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Text other = (Text) obj;
		if (head == null) {
			if (other.head != null)
				return false;
		} else if (!head.equals(other.head))
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Text [text=" + text + ", head=" + head + "]";
	}
		
}
