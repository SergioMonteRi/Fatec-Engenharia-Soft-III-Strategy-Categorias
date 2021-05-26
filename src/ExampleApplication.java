import java.util.Scanner;

public class ExampleApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Context object = new Context();
		
		System.out.print("Primeiro número: ");
		int n1 = sc.nextInt();
		System.out.print("Segundo número: ");
		int n2 = sc.nextInt();
		
		System.out.println();
		
		System.out.print("Deseja somar | 1, multiplicar | 2  ou subtrair | 3 ?");
		int opcao = sc.nextInt();
		
		if (opcao == 1) {
			object.setStrategy(new ConcreteStrategyAdd());
		}
		
		if (opcao == 2) {
			object.setStrategy(new ConcreteStrategyMultiply());
		}
		
		if (opcao == 3) {
			object.setStrategy(new ConcreteStrategySubtract());
		}
		
		int resultado = object.getStrategy().execute(n1, n2);
		
		System.out.println(resultado);
		
	}

}
