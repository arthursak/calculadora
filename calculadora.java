import javax.swing.JOptionPane;

public class DesafioCalculadora {
	public static void main(String[] args) {
		
		System.out.println("/////Bem vindo a calculadora/////");
		String num1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
		String num2 = JOptionPane.showInputDialog("Digite o segundo número: ");
		String opera = JOptionPane.showInputDialog("Digite a operação desejada: ");
		
		double val1 = Double.parseDouble(num1);
		double val2 = Double.parseDouble(num2);
		
		double calculadora = "+".equals(opera) ? val1 + val2 : 0;
		calculadora = "-".equals(opera) ? val1 - val2 : calculadora;
		calculadora = "*".equals(opera) ? val1 * val2 : calculadora;
		calculadora = "/".equals(opera) ? val1 / val2 : calculadora;
		calculadora = "%".equals(opera) ? val1 % val2 : calculadora;

        System.out.println("O resultado da operação" + num1 + opera + num2 + " é: " + calculadora);
        
	}
}
