package padroescriacao.abstractfactory.veiculo;

public class Veiculo {

    private Motor motor;
    private Carroceria carroceria;

    public Veiculo(FabricaAbstrata fabrica) {
        this.motor = fabrica.createMotor();
        this.carroceria = fabrica.createCarroceria();
    }

    public String fabricarMotor() {
        return this.motor.fabricar();
    }

    public String fabricarCarroceria() {
        return this.carroceria.fabricar();
    }
}
