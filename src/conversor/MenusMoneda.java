package conversor;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;
import javax.xml.transform.Templates;

public class MenusMoneda  extends Menus{
	 static int moneda;
	 static double valor;
	 static String cuenta;
	 

	public static void entradaValor() {
		String inputConversion = JOptionPane.showInputDialog(null,"Ingrese cantidad a convertir:" );
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
		String [] options = {"De Peso a Dolar","De Dolar a Peso"};
		Object m = JOptionPane.showInputDialog(null,"Seleccione moneda a la que desea convertir:","Menu",JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
		if(m=="De Peso a Dolar") {
			moneda=0;
			pesoADolar(valor);
		}else {
			moneda=1;
			dolarAPeso(valor);
		}
		valorConversion();
		
	}
	
	public  static  void valorConversion() {
		String text="";
		if(moneda==0) {
			text = "Dolares";
		}else {
			text="pesos";
		}
		JOptionPane.showMessageDialog(null, "Tienes $" + cuenta +" "+ text);
	}
	
	public static void valorNoPermitido() {
		JOptionPane.showMessageDialog(null, "Valor no Permitido ","Error", JOptionPane.ERROR_MESSAGE );
		Menus.deseaContinuar();
	}
	
	//valores de conversion actualizados para la fecha 22/02/2023
	public static  void pesoADolar(double valor) {
		valor = valor * 0.0051;
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		String formattedNumber = decimalFormat.format(valor);
		cuenta = formattedNumber;
		System.out.println(cuenta);
		
	}
	
public static void dolarAPeso(double valor) {
	valor = valor * 195.02;
	DecimalFormat decimalFormat = new DecimalFormat("#.##");
	String formattedNumber = decimalFormat.format(valor);
	cuenta = formattedNumber;
	System.out.println(cuenta);
		
	}
}
