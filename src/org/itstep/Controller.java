package org.itstep;

import org.itstep.Model;
import org.itstep.View;

public class Controller {
	View view;
	Model model;

	public Controller(View view, Model model) {
		super();
		this.view = view;
		this.model = model;
	}

	public Controller() {
		super();
	}

	public void enteringSentence() {
			view.printMesage(view.INPUT_SENTENSE);
			if (model.inputWordByScaner1(model.getWord()) != null) {
				view.printMesageAndWord(view.OUR_WORD, model.getWord());
			} else {
				view.printMesage(view.WRONG_INPUT);
			}
			view.printMesage(view.INPUT_SENTENSE);
			if (model.inputWordByScaner2(model.getNumber()) != 0) {
				view.printMesageAndNumber(view.OUR_WORD, model.getNumber());
			} else {
				view.printMesage(view.WRONG_INPUT);
			}
		view.printMesageAndWord(view.OUR_SENTENCE, model.writeSentence(model.getWord(), model.getNumber()));
	}
}
