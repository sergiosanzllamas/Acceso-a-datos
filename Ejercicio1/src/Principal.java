
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int den1 = 0;
		int num2 = 0;
		int den2 = 0;
		int num1 = 0;
		Operacion op =  new Operacion(num1, num2, den1, den2);
		long numdni= 0;
		Nif nif =  new Nif(numdni);
		double resultado = op.sumar(1, 1, 1, 1);
		System.out.println(resultado);
		char letra  = nif.calcularLetra(50489472);
		System.out.println(letra);
	}

}
