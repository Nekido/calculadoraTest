package service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CalculadoraServiceTest {

    CalculadoraService calculadoraService;

    @Before
    public void before() {
        calculadoraService = new CalculadoraService();
        System.out.println("Before");
    }

    @Test
    public void deveSomarCorretamenteDoisValores() {
        calculadoraService.somar(5, 7);
    }

@Test
    public void deveSubtrairCorretamenteDoisValores() {
        calculadoraService.subtrair(12, 15);
}
@Test
    public void deveMultiplicarCorretaemnteDoisValores (){
        calculadoraService.multiplicar(6,7);
}
@Test
    public void DEveDividirCorretamenteDoisValores(){
        calculadoraService.dividir(65,8);
}
}
