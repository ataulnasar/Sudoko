package parser;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		TextToXMLConverter main = new TextToXMLConverter();
		Stack<String> list = new Stack<String>();
		list = main.readFile("file.txt");
		main.textToXML(list, "file.xml");
	}

}
