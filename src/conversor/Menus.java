package conversor;

import javax.swing.JOptionPane;

public class Menus {
	
	static MenusMoneda moneda;
	static MenuTemperatura temp;
	static MenusDistancia dist;
	
	public Menus() {
		moneda  = new MenusMoneda();
		temp = new MenuTemperatura();
		dist = new MenusDistancia();
		
	}
	
	//Dependiendo la opcion que el usuario elija ejecuta la clase correspondiente
	public static void menuPrincipal() {
		String [] options = {"Conversor de Moneda","Conversor de Temperatura","Conversor de Distancias"};
		Object option = JOptionPane.showInputDialog(null,"Seleccione tipo de conversión:","Menu",JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
		if(option=="Conversor de Moneda") {
			moneda.entradaValor();
			deseaContinuar();
		}
		if(option=="Conversor de Temperatura") {
			temp.entradaValor();
			deseaContinuar();
		}
		if(option=="Conversor de Distancias") {
			dist.entradaValor();
			deseaContinuar();
		}
		}
	
	public static void programaTerminado() {
		JOptionPane.showMessageDialog(null, "Programa Terminado " );
	}

	public static void deseaContinuar() {
		Object[] opciones = {"Sí", "No", "Cancelar"};
		int respuesta = JOptionPane.showOptionDialog(null, "¿Desea Continuar?", "Eliminar archivo", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, opciones, opciones[2]);
		if (respuesta==0) {
			menuPrincipal();
		}else {
			programaTerminado();
		}
		
	}
}
