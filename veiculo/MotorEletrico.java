package padroescriacao.abstractfactory.veiculo;

public class MotorEletrico implements Motor {

    @Override
    public String fabricar() {
        return "Motor Elétrico";
    }
}
