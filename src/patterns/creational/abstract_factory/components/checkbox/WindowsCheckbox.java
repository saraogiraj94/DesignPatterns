package patterns.creational.abstract_factory.components.checkbox;

public class WindowsCheckbox implements Checkbox{

	@Override
	public void paint() {
		System.out.println("WINDOWS - Painting Checkbox");
	}
}
