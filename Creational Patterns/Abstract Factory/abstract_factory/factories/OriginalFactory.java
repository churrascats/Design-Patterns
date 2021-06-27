package abstract_factory.factories;

import abstract_factory.cadeira.Cadeira;
import abstract_factory.cadeira.CadeiraOriginal;
import abstract_factory.mesa_de_centro.MesaDeCentro;
import abstract_factory.mesa_de_centro.MesaDeCentroOriginal;
import abstract_factory.sofa.Sofa;
import abstract_factory.sofa.SofaOriginal;

public class OriginalFactory implements AbstractFactory {

    @Override
    public Cadeira criarCadeira() {
        return new CadeiraOriginal();
    }

    @Override
    public MesaDeCentro criarMesaDeCentro() {
        return new MesaDeCentroOriginal();
    }

    @Override
    public Sofa criarSofa() {
        return new SofaOriginal();
    }

}
