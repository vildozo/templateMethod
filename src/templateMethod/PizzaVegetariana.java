package templateMethod;

public class PizzaVegetariana {
	
	public void PrepararPizza(){
		HacerMasa();
		AgregarSalsaDeTomate();
		AgregarQuesoRayado();
		AgregarTopingDeVegetales();
	}
	
	public void HacerMasa(){
		System.out.println("Masa esta preparada");
	}
	
	public void AgregarSalsaDeTomate(){
		System.out.println("Se puso Salsa de Tomata sobre la Masa de pizza");
	}
	
	public void AgregarQuesoRayado(){
		System.out.println("Se Agrego Queso Rayado a la pizza");
	}
	
	public void AgregarTopingDeVegetales(){
		System.out.println("Se agrego Piña, Pimentones y Champiñones ");
	}

}
