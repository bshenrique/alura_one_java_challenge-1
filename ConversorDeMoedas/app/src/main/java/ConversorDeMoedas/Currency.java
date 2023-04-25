package ConversorDeMoedas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * Handle the conversion of currencies
 * @author bshenrique
 */
public class Currency {
    
    private List<String> currencyOptions;
    private double value;
    
    private final double USD_TO_BRL = 5.052;
    private final double EUR_TO_BRL = 5.574;
    private final double GBP_TO_BRL = 6.298;
    private final double JPY_TO_BRL = 0.0376;

    public Currency(double value) {
        this.value = value;
        this.currencyOptions = new ArrayList<>();
        currencyOptions.add("De Reais a Dólares");
        currencyOptions.add("De Reais a Euros");
        currencyOptions.add("De Reais a Libras");
        currencyOptions.add("De Reais a Yenes");
        currencyOptions.add("De Dólares a Reais");
        currencyOptions.add("De Euros a Reais");
        currencyOptions.add("De Libras a Reais");
        currencyOptions.add("De Yenes a Reais");
    }
    
    public boolean convert(){
        // Generating an empty icon to pass as an argument to the showInputDialog
        ImageIcon icon = new ImageIcon();
        
        Object currencyOptionsSelection = JOptionPane.
                showInputDialog(null,"Escolha a moeda para a qual você deseja converter seu dinheiro:","Moedas",3,icon,currencyOptions.toArray(),currencyOptions.get(0));
        
        double finalResult = 0.0;
        
        if (currencyOptionsSelection.equals(currencyOptions.get(0))) {
            finalResult = brlToUsd(value);
            JOptionPane.showMessageDialog(null, String.format("O resultado da conversão é: US$ %.2f", finalResult));
        }
        
        if (currencyOptionsSelection.equals(currencyOptions.get(1))) {
            finalResult = brlToEur(value);
            JOptionPane.showMessageDialog(null, String.format("O resultado da conversão é: € %.2f", finalResult));
        }
        
        if (currencyOptionsSelection.equals(currencyOptions.get(2))){
            finalResult = brlToGbp(value);
            JOptionPane.showMessageDialog(null, String.format("O resultado da conversão é: £ %.2f", finalResult));
        }
        
        if (currencyOptionsSelection.equals(currencyOptions.get(3))){
            finalResult = brlToJpy(value);
            JOptionPane.showMessageDialog(null, String.format("O resultado da conversão é: ¥ %.2f", finalResult));
        }
        
        if (currencyOptionsSelection.equals(currencyOptions.get(4))) {
        finalResult = usdToBrl(value);
        JOptionPane.showMessageDialog(null, String.format("O resultado da conversão é: R$ %.2f", finalResult));
        }
        
        if (currencyOptionsSelection.equals(currencyOptions.get(5))) {
            finalResult = eurToBrl(value);
            JOptionPane.showMessageDialog(null, String.format("O resultado da conversão é: R$ %.2f", finalResult));
        }
        
        if (currencyOptionsSelection.equals(currencyOptions.get(6))){
            finalResult = gbpToBrl(value);
            JOptionPane.showMessageDialog(null, String.format("O resultado da conversão é: R$ %.2f", finalResult));
        }
        
        if (currencyOptionsSelection.equals(currencyOptions.get(7))){
            finalResult = jpyToBrl(value);
            JOptionPane.showMessageDialog(null, String.format("O resultado da conversão é: R$ %.2f", finalResult));
        }
        
        
        int option = JOptionPane.showConfirmDialog(null,"Deseja realizar uma nova conversão?","Conversor",JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) return true;
        JOptionPane.showMessageDialog(null,"Programa finalizado");
        return false;
    
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    
    public double brlToUsd(double value){
        return value / USD_TO_BRL;
    }
    public double usdToBrl(double value){
        return value * USD_TO_BRL;
    }
    
    public double brlToEur(double value){
        return value / EUR_TO_BRL;
    }
    
    public double eurToBrl(double value){
        return value * EUR_TO_BRL;
    }
    
    public double brlToGbp(double value){
        return value / GBP_TO_BRL;
    }
    
    public double gbpToBrl(double value){
        return value * GBP_TO_BRL;
    }
    
    public double brlToJpy(double value){
        return value / JPY_TO_BRL;
    }
    
    public double jpyToBrl(double value){
        return value * JPY_TO_BRL;
    }
    
    
    
    
    
}
