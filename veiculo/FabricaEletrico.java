package padroescriacao.abstractfactory.veiculo;

public class FabricaEletrico implements FabricaAbstrata {

    @Override
    public Motor createMotor() {
        return new MotorEletrico();
    }

    @Override
    public Carroceria createCarroceria() {
        return new CarroceriaEletrico();
    }
}
