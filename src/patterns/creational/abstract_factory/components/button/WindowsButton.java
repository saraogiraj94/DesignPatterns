package patterns.creational.abstract_factory.components.button;

public class WindowsButton implements Button{

	@Override
	public void paint() {
		System.out.println("WINDOWS - Painting Button");
	}
}
