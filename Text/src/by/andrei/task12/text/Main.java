//Создать объект класса Текст, 
//используя классы Предложение, Слово. 

//Методы: дополнить текст, вывести на консоль текст, 
//заголовок текста.


package by.andrei.task12.text;

public class Main {

	public static void main(String[] args) {
		Symbol symbol = new Symbol();
		Text text = new Text();
		
		Word symbolSpace = new Word(symbol.getSPACE());
		Word symbolDot = new Word(symbol.getDOT());
		Word symbolComma = new Word(symbol.getCOMMA());
		Word symbolQuestion = new Word(symbol.getQUESTION());
		Word symbolExclamation = new Word(symbol.getEXCLAMATION());
		
		Word word1 = new Word("Hello");
		Word word2 = new Word("user");
		Word word3 = new Word("How");
		Word word4 = new Word("are");
		Word word5 = new Word("you");
		Sentence sent1 = new Sentence();
		Sentence sent2 = new Sentence();	
		
		sent1.addWord(word1);
		sent1.addWord(symbolComma);
		sent1.addWord(symbolSpace);
		sent1.addWord(word2);
		sent1.addWord(symbolExclamation);
		sent1.addWord(symbolSpace);
		sent2.addWord(word3);
		sent2.addWord(symbolSpace);
		sent2.addWord(word4);
		sent2.addWord(symbolSpace);
		sent2.addWord(word5);
		sent2.addWord(symbolQuestion);
		sent2.addWord(symbolSpace);
		
		text.addSentence(sent1);
		text.addSentence(sent2);
		text.setHead("My text!");
		
		View view = new View();
		view.viewHeadText(text);
		view.viewText(text);
	}

}
