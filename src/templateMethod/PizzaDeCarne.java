
package templateMethod;


public class PizzaDeCarne {
	
	public void PrepararPizza(){
		HacerMasa();
		AgregarSalsaDeTomate();
		AgregarQuesoRayado();
		AgregarTopingDeCarne();
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
	
	public void AgregarTopingDeCarne(){
		System.out.println("Se agrego una capa de Tocino, pollo y carne ");
	}
	
	

}
