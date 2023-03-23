package conversor;

import javax.swing.JOptionPane;

public class Principal {
	

	public static void main(String[] args) {
	
		int continuar = 0;
		do {
			//Cuadro diálogo - Menú principal
			
			String[] opcionMenu = {"Conversor de Monedas", "Conversor de temperatura"};
			
			String opcion = (String) JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", 
	                "Menu", JOptionPane.QUESTION_MESSAGE, null, opcionMenu, opcionMenu);
			
			if(opcion == null) {
				break;
			}
			
			String opcionElegida = "";
			
			if(opcion == "Conversor de Monedas") {
				//Cuadro de diálogo - Opciones de Moneda
				String[] opcionConvertir = {"COP a Dólar", "COP a Euros", "COP a Libras Esterlinas", "COP a Yen Japonés", "COP a Won sul-coreano", "Dólar a COP", "Euros a COP", "Libras Esterlinas a COP", "Yen Japonés a COP", "Won sul-coreano a COP"};
				
				opcionElegida = (String)JOptionPane.showInputDialog(null, "Elige la moneda a la que deseas convertir tu dinero", "Monedas", JOptionPane.QUESTION_MESSAGE, null, opcionConvertir, opcionConvertir);
				
				if(opcionElegida == null) {
					break;
				}
			}
			
			if(opcion == "Conversor de temperatura") {
				//Cuadro de diálogo - Opciones de temperatura
				String[] opcionConvertir = {"Celsius a Fahrenheit", "Fahrenheit a Celsius"};
				
				opcionElegida = (String)JOptionPane.showInputDialog(null, "Elige la temperatura a la que deseas convertir", "Temperatura", JOptionPane.QUESTION_MESSAGE, null, opcionConvertir, opcionConvertir);
				
				if(opcionElegida == null) {
					break;
				}
			}
			
		
					
			//Cuadro de diálogo - Entrada de valor
	
			String valorAConvert = null;
			Double cantidad = 0.0;
			do {
			    try {
			        valorAConvert = JOptionPane.showInputDialog("Ingrese la cantidad que deseas convertir");
			        if(valorAConvert == null) {
			        	break;
			        }
			        if(valorAConvert.matches("[0-9]+(\\.[0-9]+)?")) {
			            cantidad = Double.parseDouble(valorAConvert); 
			        } else {
			            throw new ValorNoNumericoException("Error. Debes ingresar solo números");
			        }
			    } catch(ValorNoNumericoException e) {
			        JOptionPane.showMessageDialog(null, e.getMessage());
			    } catch(Exception e) {
			        JOptionPane.showMessageDialog(null, "Error desconocido: " + e.getMessage());
			    }
			} while (!valorAConvert.matches("[0-9]+(\\.[0-9]+)?"));
			
			
	
			
			//Convirtiendo
			Double resultado = 0.0;
			String nombre = "";
			
			if(opcion == "Conversor de Monedas") {
				SelectorMoneda convertirMoneda = new SelectorMoneda();
				resultado = convertirMoneda.elegirCambio(opcionElegida, cantidad);
				nombre = convertirMoneda.getMoneda();
			}
			if(opcion == "Conversor de temperatura") {
				SelectorTemperatura convertirTemperatura = new SelectorTemperatura();
				resultado = convertirTemperatura.elegirCambio(opcionElegida, cantidad);
				nombre = convertirTemperatura.getTemperatura();
			}
			
			
			//Cuadro de diálogo - Valor de la conversión
			JOptionPane.showMessageDialog(null, "Usted tiene " + resultado + " " + nombre);
			
			//Cuadro continuar
			continuar = JOptionPane.showConfirmDialog(null, "¿Desea Continuar?");
			
		} while(continuar == 0);
		
		
		if(continuar == 1 || continuar == 2) {
			JOptionPane.showMessageDialog(null, "Programa terminado");
		}
	}

}
