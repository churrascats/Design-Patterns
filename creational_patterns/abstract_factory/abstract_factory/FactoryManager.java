package abstract_factory;

import abstract_factory.factories.AbstractFactory;
import abstract_factory.factories.ModernaFactory;
import abstract_factory.factories.OriginalFactory;
import abstract_factory.factories.VitorianaFactory;

public class FactoryManager {
    public static AbstractFactory getFactory(String type) {
        switch (type) {
            case "Original":
                return new OriginalFactory();
            case "Vitoriana":
                return new VitorianaFactory();
            case "Moderna":
                return new ModernaFactory();
            default:
                return null;
        }
    }
}
