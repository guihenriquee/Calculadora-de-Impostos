/*Crie uma classe que calcule uma determinada porcentagem(30%) 
de um dado salário(2.500) 
*/ 

public class CalculadoraImposto {
    public static void main(String[] args) {
        float salario = 2500.00F;
        float porcentagem = 30;
        float porcentagemDoSalario = salario * (porcentagem / 100);
        System.out.println(porcentagemDoSalario);
    }
}
