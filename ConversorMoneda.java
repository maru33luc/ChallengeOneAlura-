import javax.swing.*;

public class ConversorMoneda {
    public static void main(String[] args) {

        int opcion;

        do {
            String[] opciones = {"Pesos a Moneda", "Moneda a Pesos", "Salir"};
            opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Conversor de Moneda",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
            if (opcion == 0) {
                double pesos = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad de pesos:"));
                String[] opcionesMoneda = {"Dólares", "Euros", "Yen", "Libras Esterlinas"};
                int opcionMoneda = JOptionPane.showOptionDialog(null, "Seleccione la moneda a convertir:", "Conversor de Moneda",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcionesMoneda, opcionesMoneda[0]);
                double tipoCambio = 0;
                switch (opcionMoneda) {
                    case 0:
                        tipoCambio = 0.0047;
                        break;
                    case 1:
                        tipoCambio = 0.0043;
                        break;
                    case 2:
                        tipoCambio = 0.63;
                        break;
                    case 3:
                        tipoCambio = 0.0038;
                        break;
                }
                double conversion = pesos * tipoCambio;
                JOptionPane.showMessageDialog(null, "La conversión es de: " + String.format("%.2f", conversion));
            } else if (opcion == 1) {
                String[] opcionesMoneda = {"Dólares", "Euros", "Yen", "Libras Esterlinas"};
                int opcionMoneda = JOptionPane.showOptionDialog(null, "Seleccione la moneda a convertir:", "Conversor de Moneda",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcionesMoneda, opcionesMoneda[0]);
                double moneda = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad de la moneda:"));
                double tipoCambio = 0;
                switch (opcionMoneda) {
                    case 0:
                        tipoCambio = 211.21;
                        break;
                    case 1:
                        tipoCambio = 230.16;
                        break;
                    case 2:
                        tipoCambio = 1.60;
                        break;
                    case 3:
                        tipoCambio = 262.33;
                        break;
                }
                double conversion = moneda * tipoCambio;
                JOptionPane.showMessageDialog(null, "La conversión es de: " + String.format("%.2f", conversion) + " pesos");
            }
        } while (opcion != 2);
    }
}
