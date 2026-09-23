package padroescriacao.abstractfactory.veiculo;

public class MotorCombustao implements Motor {

    @Override
    public String fabricar() {
        return "Motor a Combustão";
    }
}
