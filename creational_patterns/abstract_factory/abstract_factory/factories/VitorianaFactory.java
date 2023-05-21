package abstract_factory.factories;

import abstract_factory.cadeira.Cadeira;
import abstract_factory.cadeira.CadeiraVitoriana;
import abstract_factory.mesa_de_centro.MesaDeCentro;
import abstract_factory.mesa_de_centro.MesaDeCentroVitoriana;
import abstract_factory.sofa.Sofa;
import abstract_factory.sofa.SofaVitoriano;

public class VitorianaFactory implements AbstractFactory{
    @Override
    public Cadeira criarCadeira() {
        return new CadeiraVitoriana();
    }

    @Override
    public MesaDeCentro criarMesaDeCentro() {
        return new MesaDeCentroVitoriana();
    }

    @Override
    public Sofa criarSofa() {
        return new SofaVitoriano();
    }

}
