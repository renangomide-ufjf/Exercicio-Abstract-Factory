package padroescriacao.abstractfactory.veiculo;

public class CarroceriaEletrico implements Carroceria {

    @Override
    public String fabricar() {
        return "Carroceria para Veículo Elétrico";
    }
}
