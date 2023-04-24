package ConversorDeMoedas;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class App {

    public static void main(String[] args) {
        
        String[] menuOptions = new String[2];
        menuOptions[0] = "Conversor de moeda";
        menuOptions[1] = "Conversor de temperatura";
        
        // Generating an empty icon to pass as an argument to the showInputDialog
        ImageIcon icon = new ImageIcon();

        JOptionPane menu = new JOptionPane();
        Object menuOptionsSelection = JOptionPane.
                showInputDialog(null,"Escolha uma opção:","Menu",3,icon,menuOptions,menuOptions[0]);
        
        // If the user click on "cancel" or "X" button, the program finishes without error
        if (menuOptionsSelection == null) System.exit(0);
        
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
        /*
        if (menuOptionsSelection.equals(menuOptions[0])) {
            menu.showMessageDialog(null,"Você escolher a primeira opção, ".concat(Double.toString(inputValue)));
        } else if (menuOptionsSelection.equals(menuOptions[1])) {
            menu.showMessageDialog(null,"Você escolher a segunda opção, ".concat(Double.toString(inputValue)));
        } else {
            menu.showMessageDialog(null,"Obrigado e até a próxima!");
        }
        */
        
    }
}
