import abstract_factory.FactoryManager;
import abstract_factory.cadeira.Cadeira;
import abstract_factory.factories.AbstractFactory;
import abstract_factory.mesa_de_centro.MesaDeCentro;
import abstract_factory.sofa.Sofa;

public class Main {

        public static void main(String[] args) {
                AbstractFactory factory = FactoryManager.getFactory("Vitoriana"); //Allows 3 different Object Families: Original, Vitoriana, Moderna

                Cadeira cadeira = factory.criarCadeira();
                MesaDeCentro mesaDeCentro = factory.criarMesaDeCentro();
                Sofa sofa = factory.criarSofa();

        
                cadeira.sentar();
                mesaDeCentro.colocarCafeEmCima();
                sofa.deitar();
        }

}