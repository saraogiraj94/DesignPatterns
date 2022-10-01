package patterns.creational.abstract_factory.factories;

import patterns.creational.abstract_factory.components.button.Button;
import patterns.creational.abstract_factory.components.button.WindowsButton;
import patterns.creational.abstract_factory.components.checkbox.Checkbox;
import patterns.creational.abstract_factory.components.checkbox.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new WindowsCheckbox();
	}
}
