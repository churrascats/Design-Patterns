package abstract_factory.factories;

import abstract_factory.cadeira.Cadeira;
import abstract_factory.cadeira.CadeiraModerna;
import abstract_factory.mesa_de_centro.MesaDeCentro;
import abstract_factory.mesa_de_centro.MesaDeCentroModerna;
import abstract_factory.sofa.Sofa;
import abstract_factory.sofa.SofaModerno;

public class ModernaFactory implements AbstractFactory{
    @Override
    public Cadeira criarCadeira() {
        return new CadeiraModerna();
    }

    @Override
    public MesaDeCentro criarMesaDeCentro() {
        return new MesaDeCentroModerna();
    }

    @Override
    public Sofa criarSofa() {
        return new SofaModerno();
    }

}
