package patterns.creational.abstract_factory.application;

import patterns.creational.abstract_factory.components.button.Button;
import patterns.creational.abstract_factory.components.checkbox.Checkbox;
import patterns.creational.abstract_factory.factories.GUIFactory;

public class Application {
	private Button button;
	private Checkbox checkbox;

	public Application(GUIFactory guiFactory){
		button = guiFactory.createButton();
		checkbox = guiFactory.createCheckbox();
	}

	public void paint(){
		button.paint();
		checkbox.paint();
	}
}
