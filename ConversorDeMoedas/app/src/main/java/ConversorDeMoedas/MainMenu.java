package ConversorDeMoedas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author bshenrique
 */
public class MainMenu {
    
    private List<String> mainMenuOptions;

    public MainMenu() {
        this.mainMenuOptions = new ArrayList<>();
        mainMenuOptions.add("Conversor de moeda");
        mainMenuOptions.add("Conversor de temperatura");
    }
    
    public int show(){
        // Generating an empty icon to pass as an argument to the showInputDialog
        ImageIcon icon = new ImageIcon();

        JOptionPane menu = new JOptionPane();
        Object menuOptionsSelection = JOptionPane.
                showInputDialog(null,"Escolha uma opção:","Menu",3,icon,mainMenuOptions.toArray(),mainMenuOptions.get(0));
        
        // If the user click on "cancel" or "X" button, the program finishes without error
        if (menuOptionsSelection == null) System.exit(0);
        
        if (menuOptionsSelection.equals(mainMenuOptions.get(0))) return 1;
        return 2;
    }
    
    public double inputValueToConvert() {
        JOptionPane menu = new JOptionPane();
        double inputValue = 0;
        boolean isInputValueAccepted = false;
        
        while (!isInputValueAccepted){
            try {
                inputValue = Double.parseDouble(menu.
                        showInputDialog(null,"Insira um valor:","Input",3));
                isInputValueAccepted = true;
            } catch(Exception e) {
                menu.showMessageDialog(null,"Você deve digitar um valor numérico.");
            }
        }
        return inputValue;
    }
    
   
    
}
