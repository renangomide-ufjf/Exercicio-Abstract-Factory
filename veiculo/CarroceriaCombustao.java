package padroescriacao.abstractfactory.veiculo;

public class CarroceriaCombustao implements Carroceria {

    @Override
    public String fabricar() {
        return "Carroceria para Veículo a Combustão";
    }
}
