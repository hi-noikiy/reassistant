package edu.isistan.reassistant.providers;

import org.eclipse.jface.viewers.LabelProvider;

import edu.isistan.reassistant.query.UIMAProjectQueryAdapter;
import edu.isistan.uima.unified.typesystems.nlp.Sentence;

public class SentenceLabelProvider extends LabelProvider {
	private UIMAProjectQueryAdapter uimaRoot;
	
	public SentenceLabelProvider(UIMAProjectQueryAdapter uimaRoot) {
		super();
		this.uimaRoot = uimaRoot;
	}
	
	@Override
	public String getText(Object element) {
		Sentence sentence = (Sentence) element;
		int number = uimaRoot.indexOf(sentence, uimaRoot.getSentences());
		String numberText = String.valueOf(number);
		String coveredText = uimaRoot.getCoveredText(sentence);
		return "[" + numberText + "] " + coveredText;
	}
}
