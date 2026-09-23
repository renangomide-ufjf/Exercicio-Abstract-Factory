package padroescriacao.abstractfactory.veiculo;

public interface FabricaAbstrata {
    Motor createMotor();
    Carroceria createCarroceria();
}
