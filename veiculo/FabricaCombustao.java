package padroescriacao.abstractfactory.veiculo;

public class FabricaCombustao implements FabricaAbstrata {

    @Override
    public Motor createMotor() {
        return new MotorCombustao();
    }

    @Override
    public Carroceria createCarroceria() {
        return new CarroceriaCombustao();
    }
}
