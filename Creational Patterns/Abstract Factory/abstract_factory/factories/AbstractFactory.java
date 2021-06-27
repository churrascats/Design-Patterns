package abstract_factory.factories;

import abstract_factory.cadeira.Cadeira;
import abstract_factory.mesa_de_centro.MesaDeCentro;
import abstract_factory.sofa.Sofa;

public interface AbstractFactory {
    public Cadeira criarCadeira();
    public MesaDeCentro criarMesaDeCentro();
    public Sofa criarSofa();
}