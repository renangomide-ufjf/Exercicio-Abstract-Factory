package padroescriacao.abstractfactory.veiculo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VeiculoTest {

    @Test
    void deveFabricarMotorVeiculoEletrico() {
        FabricaAbstrata fabrica = new FabricaEletrico();
        Veiculo veiculo = new Veiculo(fabrica);
        assertEquals("Motor Elétrico", veiculo.fabricarMotor());
    }

    @Test
    void deveFabricarMotorVeiculoCombustao() {
        FabricaAbstrata fabrica = new FabricaCombustao();
        Veiculo veiculo = new Veiculo(fabrica);
        assertEquals("Motor a Combustão", veiculo.fabricarMotor());
    }

    @Test
    void deveFabricarCarroceriaVeiculoEletrico() {
        FabricaAbstrata fabrica = new FabricaEletrico();
        Veiculo veiculo = new Veiculo(fabrica);
        assertEquals("Carroceria para Veículo Elétrico", veiculo.fabricarCarroceria());
    }

    @Test
    void deveFabricarCarroceriaVeiculoCombustao() {
        FabricaAbstrata fabrica = new FabricaCombustao();
        Veiculo veiculo = new Veiculo(fabrica);
        assertEquals("Carroceria para Veículo a Combustão", veiculo.fabricarCarroceria());
    }
}
