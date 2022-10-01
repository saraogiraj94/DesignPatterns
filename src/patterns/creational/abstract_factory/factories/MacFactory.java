package patterns.creational.abstract_factory.factories;

import patterns.creational.abstract_factory.components.button.Button;
import patterns.creational.abstract_factory.components.button.MacButton;
import patterns.creational.abstract_factory.components.checkbox.Checkbox;
import patterns.creational.abstract_factory.components.checkbox.MacCheckbox;

public class MacFactory implements GUIFactory{

	@Override
	public Button createButton() {
		return new MacButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new MacCheckbox();
	}
}
