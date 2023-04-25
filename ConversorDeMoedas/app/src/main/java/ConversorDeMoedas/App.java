package ConversorDeMoedas;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class App {

    public static void main(String[] args) {
        
        boolean continueToConvert = true;
        
        while (continueToConvert) {
            MainMenu mainMenu = new MainMenu();
            int convertionSelection = 0;
            convertionSelection = mainMenu.show();
            double valueToConvert = mainMenu.inputValueToConvert();

            switch (convertionSelection) {
                case 1:
                    Currency currencyConverter = new Currency(valueToConvert);
                    continueToConvert = currencyConverter.convert();
                    break;
                case 2:
                    Temperature temperaturaConverter = new Temperature(valueToConvert);
                    continueToConvert = temperaturaConverter.convert();
                    break;
                default:
                    //JOptionPane.showMessageDialog(null,"Programa finalizado");
                    break;
            }     
        }
        
        
    }
}
