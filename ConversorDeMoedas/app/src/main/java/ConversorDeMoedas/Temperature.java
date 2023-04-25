package ConversorDeMoedas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * Handle the conversion of temperatures
 * @author bshenrique
 */
public class Temperature {
    
    private List<String> temperatureOptions;
    
    private double value;
   
    public Temperature(double value) {
        this.value = value;
        this.temperatureOptions = new ArrayList<>();
        temperatureOptions.add("De Celsius a Fahrenheit");
        temperatureOptions.add("De Celsius a Kelvin");
        temperatureOptions.add("De Fahrenheit a Celsius");
        temperatureOptions.add("De Kelvin a Celsius");
    }
    
    public boolean convert(){
        // Generating an empty icon to pass as an argument to the showInputDialog
        ImageIcon icon = new ImageIcon();
        
        Object currencyOptionsSelection = JOptionPane.
                showInputDialog(null,"Escolha a escala para a qual deseja converter sua temperatura:","Temperaturas",3,icon,temperatureOptions.toArray(),temperatureOptions.get(0));
        
        double finalResult = 0.0;
        
        if (currencyOptionsSelection.equals(temperatureOptions.get(0))) {
            finalResult = celsiusToFahrenheit(value);
            JOptionPane.showMessageDialog(null, String.format("O resultado da conversão é: %.2f ºF", finalResult));
        }
        
        if (currencyOptionsSelection.equals(temperatureOptions.get(1))) {
            finalResult = celsiusToKelvin(value);
            JOptionPane.showMessageDialog(null, String.format("O resultado da conversão é: %.2f ºK", finalResult));
        }
        
        if (currencyOptionsSelection.equals(temperatureOptions.get(2))){
            finalResult = fahrenheitToCelsius(value);
            JOptionPane.showMessageDialog(null, String.format("O resultado da conversão é: %.2f ºC", finalResult));
        }
        
        if (currencyOptionsSelection.equals(temperatureOptions.get(3))){
            finalResult = kelvinToCelsius(value);
            JOptionPane.showMessageDialog(null, String.format("O resultado da conversão é: %.2f ºC", finalResult));
        }
        
        int option = JOptionPane.showConfirmDialog(null,"Deseja realizar uma nova conversão?","Conversor",JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) return true;
        JOptionPane.showMessageDialog(null,"Programa finalizado");
        return false;
    }
    
    public double getValue(){
        return this.value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    
    public double celsiusToFahrenheit(double value) {
        return (value * 1.8) + 32;
    }
    
    public double celsiusToKelvin(double value) {
        return value + 273.15;
    }
    
    public double fahrenheitToCelsius(double value) {
        return (value - 32) / 1.8;
    }
    
    public double kelvinToCelsius(double value) {
        return value - 273.15;
    }
    
}
