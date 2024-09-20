package codigo;
import java.util.Scanner;
public class Volumenes2 {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("** Calculo de volumenes **");
		System.out.println("\n Grupo A \n Salcedo Cordova Mauricio \n Gomez Ibarra Eduardo Manuel \n Morales Belman Alan Ouseiri \n Vargas Amezquita Gonzalo \n Ramirez Ramirez Miguel Angel \n Martinez Mendoza Gloria Isabel \n Valencia Perez Alejandro");

		String Respuesta;
		do {
			int Opcion = menu();
			switch (Opcion) {
			case 1:
				System.out.println("\n** Cubo **\n");
				cubo();
				break;
			case 2:
				System.out.println("\n** Prisma rectangular recto **\n");
				prismaRectangularRecto();
				break;
			case 3:
				System.out.println("\n** Prisma oblicuo **\n");
				prismaOblicuo();
				break;
			case 4:
				System.out.println("\n** Piramide rectangular recta **\n");
				piramideRectangularRecta();
				break;
			case 5:
				System.out.println("\n** Piramide truncada **\n");
				piramideRectangularTruncada();
				break;
			case 6:
				System.out.println("\n** Cilindro **\n");
				cilindro();
				break;
			case 7:
				System.out.println("\n** Cilindro hueco **\n");
				cilindroHueco();
				break;
			case 8:
				System.out.println("\n** Cono circular **\n");
				conoCircular();
				break;
			case 9:
				System.out.println("\n** Cono truncado **\n");
				ConoTruncado();
				break;
			case 10:
				System.out.println("\n** Esfera **\n");
				Esfera();
				break;
			case 11:
				System.out.println("\n** Segmento esferico **\n");
				SegmentoEsferico();
				break;
			case 12:
				System.out.println("\n** Segmento esferico truncado **\n");
				SegmentoEsfericoTruncado();
				break;
			case 13:
				System.out.println("\n** Sector esferico **\n");
				sectorEsferico();
				break;
			case 14:
				System.out.println("\n** Esfera con perforacion cilindrica **\n");
				EsferaPerforacionCilindrica();
				break;
			case 15:
				System.out.println("\n** Esfera con perforaciones conicas **\n");
				EsferaPerforacionConica();
				break;
			case 16:
				System.out.println("\n** Toro **\n");
				toro();
				break;
			case 17:
				System.out.println("\n** Cilindro con corte inclinado **\n");
				cilindroCorteInclinado();
				break;
			case 18:
				System.out.println("\n** Cuna cilindrica **\n");
				cunaCilindrica();
				break;
			case 19:
				System.out.println("\n** Barril **\n");
				barril();
				break;
			case 20:
				System.out.println("\n** Prismatoide **\n");
				prismatoide();
				break;
			}
			System.out.print("\n\n¿Desea hacer otro calculo? (si/no): ");
			Respuesta = scanner.next();
		} while (Respuesta.equalsIgnoreCase("si"));
		System.out.print("\n** Fin del programa **");
	}

	private static void piramideRectangularRecta() {
		double lado, ancho, altura;
		System.out.print("Ingresa la medida del lado: ");
		lado = scanner.nextDouble();
		System.out.print("Ingresa la medida del ancho: ");
		ancho = scanner.nextDouble();
		System.out.print("Ingresa la medida de la altura: ");
		altura = scanner.nextDouble();
		System.out.print("El volumen de la piramide rectangular recta es: " + (lado * ancho * altura / 3));
	}

	public static void barril() {
		double radioMayor, radioMenor, altura, volumen;
		System.out.print("Ingresa la medida del radio menor: ");
		radioMayor = scanner.nextDouble();
		System.out.print("Ingresa la medida del radio mayor: ");
		radioMenor = scanner.nextDouble();
		System.out.print("Ingresa la medida de la altura: ");
		altura = scanner.nextDouble();
		volumen = (Math.PI * altura) * (2 * (Math.pow(radioMayor, 2))) + Math.pow(radioMenor, 2) - (2 / 5 * (radioMayor - radioMenor)); 
		System.out.print("El volumen del barril es: " + volumen);
	}

	public static void cunaCilindrica() {
		double radio, teta, volumen;
		System.out.print("Ingresa la medida del radio: ");
		radio = scanner.nextDouble();
		System.out.print("Ingresa la medida de teta: ");
		teta = scanner.nextDouble();
		volumen = ((2*(Math.pow(radio, 3 ))) * teta)/3;
		System.out.print("El volumen del barril es: " + volumen);
	}

	public static void prismatoide() {
		double baseInf, baseSuperior, altura, volumen, planoMedio;
		System.out.print("Ingresa la medida de la base inferior: ");
		baseInf = scanner.nextDouble();
		System.out.print("Ingresa la medida de la base superior: ");
		baseSuperior = scanner.nextDouble();
		System.out.print("Ingresa la medida del plano medio: ");
		planoMedio = scanner.nextDouble();
		System.out.print("Ingresa la medida de la altura: ");
		altura = scanner.nextDouble();
		volumen = 1/6 * (baseInf+(4*planoMedio) + baseSuperior) * altura;
		System.out.print("El volumen del prismatoide es: " + volumen);
	}

	private static void piramideRectangularTruncada() {
		double area1, area2, altura;
		System.out.print("Ingresa la medida del area de la base menor: ");
		area1 = scanner.nextDouble();
		System.out.print("Ingresa la medida del area de la base mayor: ");
		area2 = scanner.nextDouble();
		System.out.print("Ingresa la medida de la altura: ");
		altura = scanner.nextDouble();
		System.out.print("El volumen de la piramide rectangular truncada es: " + (altura/3)*(area1 + area2+(Math.sqrt(area1 * area2))));
	}

	public static void cilindro(){
		double radio, altura;
		System.out.print("Ingresa la medida del radio: ");
		radio = scanner.nextDouble();
		System.out.print("Ingresa la medida de la altura: ");
		altura = scanner.nextDouble();
		System.out.print("El volumen del cilindro es: "+ Math.PI * (radio * radio) * altura);
	}

	public static void cilindroCorteInclinado() {
		double radio, altura1, altura2;
		System.out.print("Ingresa la medida del radio: ");
		radio = scanner.nextDouble();
		System.out.print("Ingresa la medida de la altura del lado mas corto: ");
		altura1 = scanner.nextDouble();
		System.out.print("Ingresa la medida de la altura del lado mas largo: ");
		altura2 = scanner.nextDouble();
		System.out.print("El volumen del cilindro con corte inclinado es: " + 1/2 * Math.PI * (Math.pow(radio, 2)) * (altura1 + altura2));
	}

	public static void cilindroHueco() {
		double radio1, radio2, altura;
		System.out.print("Ingresa la medida del radio 1: ");
		radio1 = scanner.nextDouble();
		System.out.print("Ingresa la medida del radio 2: ");
		radio2 = scanner.nextDouble();
		System.out.print("Ingresa la medida de la altura: ");
		altura = scanner.nextDouble();
		System.out.print("El volumen del cilindro hueco es: " + Math.PI * altura * ((radio1 * radio1) - (radio2 * radio2)));
	}

	public static void conoCircular() {
		double radio, altura;
		System.out.print("Ingresa la medida del radio: ");
		radio = scanner.nextDouble();
		System.out.print("Ingresa la medida de la altura: ");
		altura = scanner.nextDouble();
		System.out.print("El volumen del cono circular es: " + (1/3) * Math.PI * (Math.pow(radio, 2)) * altura);
	}

	public static void sectorEsferico() {
		double radio, altura;
		System.out.print("Ingresa la medida del radio: ");
		radio = scanner.nextDouble();
		System.out.print("Ingresa la medida de la altura: ");
		altura = scanner.nextDouble();
		System.out.print("El volumen del cono esferico es: " + (2 / 3) * Math.PI * (Math.pow(radio, 2)) * altura);
	}

	public static void toro() {
		double radioExt, radioInt;
		System.out.print("Ingresa la medida del radio exterior: ");
		radioExt = scanner.nextDouble();
		System.out.print("Ingresa la medida del radio interior: ");
		radioInt = scanner.nextDouble();
		System.out.print("El volumen del toro es: " + (2 * Math.PI * radioExt * Math.pow(radioInt, 2)));
	}

	public static void EsferaPerforacionCilindrica() {
		double radio, altura, volumenCilindro, volumenEsfera;
		System.out.print("Ingresa la medida del radio del cilindro: ");
		radio = scanner.nextDouble();
		System.out.print("Ingresa la medida de la altura: ");
		altura = scanner.nextDouble();
		volumenCilindro = Math.PI * (radio * radio) * altura;
		volumenEsfera = (4 / 3) * Math.PI * (Math.pow(altura/2, 3));
		System.out.print("El volumen de la esfera con perforacion cilindrica es: " + (volumenEsfera - volumenCilindro));
	}

	public static void EsferaPerforacionConica() {
		double radio, altura, volumenCono, volumenEsfera;
		System.out.print("Ingresa la medida del radio del cilindro: ");
		radio = scanner.nextDouble();
		System.out.print("Ingresa la medida de la altura: ");
		altura = scanner.nextDouble();
		volumenCono = (1 / 3) * Math.PI * (Math.pow(radio, 2)) * altura;
		volumenEsfera = (4 / 3) * Math.PI * (Math.pow(altura / 2, 3));
		System.out.print("El volumen de la esfera con perforacion conica es: " + (volumenEsfera - (volumenCono*2)));
	}

	private static void prismaOblicuo() {
		double lado, ancho, altura;
		System.out.print("Ingresa la medida del lado: ");
		lado = scanner.nextDouble();
		System.out.print("Ingresa la medida del ancho: ");
		ancho = scanner.nextDouble();
		System.out.print("Ingresa la medida de la altura: ");
		altura = scanner.nextDouble();
		System.out.print("El volumen del prisma oblicuo es: " + (lado * ancho * altura));
                
                
	}

	private static void prismaRectangularRecto() {
		double lado, ancho, altura;
		System.out.print("Ingresa la medida del lado: ");
		lado = scanner.nextDouble();
		System.out.print("Ingresa la medida del ancho: ");
		ancho = scanner.nextDouble();
		System.out.print("Ingresa la medida de la altura: ");
		altura = scanner.nextDouble();
		System.out.print("El volumen del prisma rectangular recto es: " + (lado * ancho * altura));

	}

	private static void cubo() {
		System.out.print("Ingresa la medida del lado: ");
		double lado = scanner.nextDouble();
		System.out.print("El volumen del cubo es: " + (lado * lado * lado));
	}

	private static void ConoTruncado() {
		System.out.print("Ingresa la altura del cono: ");
		double altura = scanner.nextDouble();
		System.out.print("Ingresa el radio mayor del cono: ");
		double radio_Mayor = scanner.nextDouble();
		System.out.print("Ingresa el radio menor del cono: ");
		double radio_Menor = scanner.nextDouble();
		double volumen = ((altura * Math.PI)/3) * (Math.pow(radio_Mayor, 2) + (radio_Mayor * radio_Menor) + Math.pow(radio_Menor, 2));
		System.out.print("El volumen del cono truncado es: " + volumen);
	}

	private static void Esfera() {
		System.out.print("Ingresa el radio de la esfera: ");
		double radio_esfera = scanner.nextDouble();
		
		double volumen = 1.33333333 * Math.PI * Math.pow(radio_esfera, 3);
		System.out.print("El volumen de la esfera es: " + volumen);
	}

	private static void SegmentoEsferico() {
		System.out.print("Ingresa el radio de la esfera: ");
		double radio_esfera = scanner.nextDouble();
		System.out.print("Ingresa la altura de la esfera: ");
		double altura = scanner.nextDouble();

		double volumen = (Math.PI * Math.pow(altura, 2)) * (radio_esfera - (altura/3));
		System.out.print("El volumen del segmento esferico es: " + volumen);
	}

	private static void SegmentoEsfericoTruncado() {
		System.out.print("Ingresa la altura del segmento: ");
		double altura = scanner.nextDouble();
		System.out.print("Ingresa el radio mayor del segmento: ");
		double radio_Mayor = scanner.nextDouble();
		System.out.print("Ingresa el radio menor del segmento: ");
		double radio_Menor = scanner.nextDouble();

		double volumen = ((Math.PI * altura)/6) * ((3* Math.pow(radio_Mayor, 2)) + (3* Math.pow(radio_Menor, 2)) + Math.pow(altura, 2));
		System.out.print("El volumen del segmento esferico truncado es: " + volumen);
	}

	private static int menu() {
		int Opcion;
		do {
			System.out.println("\n** Menu **\n\nElige una figura\n");
			System.out.println("1.- Cubo");
			System.out.println("2.- Prisma rectangular recto");
			System.out.println("3.- Prisma oblicuo");
			System.out.println("4.- Piramide rectangular recta");
			System.out.println("5.- Piramide truncada");
			System.out.println("6.- Cilindro");
			System.out.println("7.- Cilindro hueco");
			System.out.println("8.- Cono circular");
			System.out.println("9.- Cono truncado");
			System.out.println("10.- Esfera");
			System.out.println("11.- Segmento esferico");
			System.out.println("12.- Segmento esferico truncado");
			System.out.println("13.- Sector esferico");
			System.out.println("14.- Esfera con perforacion cilindrica");
			System.out.println("15.- Esfera con perforaciones conicas");
			System.out.println("16.- Toro");
			System.out.println("17.- Cilindro con corte inclinado");
			System.out.println("18.- Cuna cilindrica");
			System.out.println("19.- Barril");
			System.out.println("20.- Prismatoide");
			System.out.print("\nOpcion elegida:");
			Opcion = scanner.nextInt();
			if (Opcion > 20 || Opcion < 1){
				System.out.println("\nOpcion no valida, intente de nuevo");
                        }
		} while (Opcion > 20 || Opcion < 1);
		return Opcion;
	}
}