package conversor;

import javax.swing.JOptionPane;

public class MenusDistancia {

	 static int distancia;
	 static double valor;
	 static double cuenta;
	
	 //Usuario ingresa valor que solo permite numeros y punto para poder ingresar numeros decimales
	 
	public static void entradaValor() {
		String inputConversion = JOptionPane.showInputDialog(null,"Ingrese distancia a convertir:" );
		if(!inputConversion.matches("^\\d+(\\.\\d+)?$")) {
			valorNoPermitido();
			Menus.deseaContinuar();
		}else {
			valor = Double.parseDouble(inputConversion);
			System.out.println(valor);
			opciones();
		}
	}
	
	public static  void opciones() {
		String [] options = {"De Kilometro a Milla","De Milla a Kilometro"};
		Object m = JOptionPane.showInputDialog(null,"Seleccione moneda a la que desea convertir:","Menu",JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
		if(m=="De Kilometro a Milla") {
			distancia=0;
			kmAMillas(valor);
		}else {
			distancia=1;
			millasAKm(valor);
		}
		valorConversion();
		
	}
	
	public  static  void valorConversion() {
		String text="";
		if(distancia==0) {
			text = "Millas";
		}else {
			text="Kilometros";
		}
		JOptionPane.showMessageDialog(null, "La distancia es " + cuenta +" "+ text+ " aproximadamente.");
	}
	
	public static void valorNoPermitido() {
		JOptionPane.showMessageDialog(null, "Valor no Permitido ","Error", JOptionPane.ERROR_MESSAGE );
		Menus.deseaContinuar();
	}
	
	public static  void kmAMillas(double valor) {
		cuenta = valor * 0.62;
		System.out.println(cuenta);
		
	}
	
public static void millasAKm(double valor) {
	cuenta = valor * 1.6;
	System.out.println(cuenta);
		
	}
}
