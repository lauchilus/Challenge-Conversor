package conversor;

import javax.swing.JOptionPane;

public class MenuTemperatura extends Menus{
	static int tipo;
	 static double valor;
	 static double cuenta;
	 
	 public void entradaValor() {
		String inputConversion = JOptionPane.showInputDialog(null,"Ingrese temperatura a convertir:" );
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
		String [] options = {"De Celsius a Fahrenheit","De Fahrenheit a Celsius"};
		Object m = JOptionPane.showInputDialog(null,"Seleccione moneda a la que desea convertir:","Menu",JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
		if(m=="De Celsius a Fahrenheit") {
			tipo=0;
			DeCelsiusAFahrenheit(valor);
		}else {
			tipo=1;
			DeFahrenheitACelsius(valor);
		}
		valorConversion();
		
	}
	
	public static  void valorConversion() {
		String text="";
		if(tipo==0) {
			text = "Grados Fahrenheit";
		}else {
			text="Grados Celsius";
		}
		JOptionPane.showMessageDialog(null, "Tienes º" + cuenta +" "+ text);
	}
	

	public  static void valorNoPermitido() {
		JOptionPane.showMessageDialog(null, "Valor no Permitido ","Error", JOptionPane.ERROR_MESSAGE );
	}
	
	public static  void DeCelsiusAFahrenheit(double valor) {
		cuenta = valor * 1.8 + 32;
		System.out.println(cuenta);
		
	}
	
public static void DeFahrenheitACelsius(double valor) {
	cuenta = (valor - 32)/1.8;
	System.out.println(cuenta);
		
	}
}
