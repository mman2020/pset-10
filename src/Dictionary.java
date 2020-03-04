//package reading_file;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException; 
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

public class Dictionary {
	public static Words[] wordList;
	
	public static Words[] addAllWords() throws JsonSyntaxException, JsonIOException, FileNotFoundException {
		wordList = new Gson().fromJson(new FileReader(".\\JSON\\words.json"), Words[].class);
		return wordList;
	}
	
	public static ArrayList<String> listSpellings(Boolean ascending) {
		ArrayList<String> listOfWords = new ArrayList<String>();
		
		for (Words word : wordList) {
			listOfWords.add(word.getSpelling());
		}
		
		if (ascending) {
			Collections.sort(listOfWords, Collections.reverseOrder());	
		} else {
			Collections.sort(listOfWords);
		}
		return listOfWords;
	}
	
	//@SuppressWarnings("null")
	public static ArrayList<Words> sortObj(Boolean ascending, List<String> sortedSpellings) throws JsonSyntaxException, JsonIOException, FileNotFoundException {
		
		wordList = addAllWords();
		ArrayList<Words> sortedObj = new ArrayList<Words>();
		for (int i = 0; sortedObj.size() < sortedSpellings.size(); i++) {
		
			for (Words word : wordList) {
				if (sortedSpellings.get(i).equals(word.getSpelling())) {
					sortedObj.add(word);
					break;
				}
				
		}
		
	}
		return sortedObj;	
	}
	
	private void addWord() {
		//TODO implement adding words
	}
	
	private void delWord() {
		//TODO implement deleting words
	}
	
}