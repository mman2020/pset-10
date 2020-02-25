package app;

public class Words {
	private String word;
	private String Definition;
	private String[] synonyms;
	private String[] antonyms;
	
	public Words(String word, String Definition, String[] synonyms, String[] antonyms) {
		this.word = word;
		this.Definition = Definition;
		this.synonyms = synonyms;
		this.antonyms = antonyms;
	}
}
