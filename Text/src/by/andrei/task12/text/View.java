package by.andrei.task12.text;

public class View {
	public void viewText(Text text) {
		for (Sentence sent : text.getText()) {
			for (Word word : sent.getSentence()) {
				System.out.print(word.getWord());
			}
		}
	}
	
	public void viewHeadText(Text text) {
		System.out.println("The title of text: " + text.getHead() + "\n");
	}
}
