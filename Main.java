import java.util.Scanner;

public class Main 
{

	public static void main(String[] args)
	
	{
		
		
		Scanner salida = new Scanner(System.in);

		FabricaStandalone f1 = new FabricaStandalone();
		
		FabricaWeb f2 = new FabricaWeb();

		System.out.println("oprima 0 para iniciar la fabrica standalone ");
		System.out.println("oprima 1 para iniciar la fabrica web ");
		System.out.print("numero seleccionado ---> ");
		int a = salida.nextInt();

		if(a == 0) 
		{

			System.out.println("Fabrica standalone");
			System.out.println("oprima 0 para hacer un boton ó 1 para hacer un cuadro");
		}
		System.out.print("numero seleccionado ---> ");
		
		int b = salida.nextInt();
		
		if(b == 0) 
		{
			f1.crearBoton();
			System.out.println(f1);
		}
		if(a == 1) 
		{
			f1.crearCuadro();
			System.out.println(f1);
		}

		if(b == 1) 
		{
			System.out.println("fabrica web");
			
		
			System.out.println("oprima 0 para hacer un boton ó 1 para hacer un cuadro");
			System.out.print("numero seleccionado ---> ");
			
			int c = salida.nextInt();
			
			if(b == 1) 
			{
				f2.crearBoton();

				System.out.println(f2);
			}
			
			if(a == 1) 
			{
				f2.crearCuadro();
				System.out.println(f2);
			}

		}

	}

}
