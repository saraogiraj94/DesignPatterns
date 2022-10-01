package patterns.creational.abstract_factory;

import patterns.creational.abstract_factory.application.Application;
import patterns.creational.abstract_factory.factories.MacFactory;
import patterns.creational.abstract_factory.factories.WindowsFactory;

public class Demo {

	public static void main(String[] args) {
		Application app = configureApplication();
		app.paint();
	}

	private static Application configureApplication() {
		String osName = System.getProperty("os.name").toLowerCase();
		if (osName.contains("mac")) {
			return new Application(new MacFactory());
		} else {
			return new Application(new WindowsFactory());
		}
	}
}
