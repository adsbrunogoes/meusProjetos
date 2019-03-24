
package estruturacondicional;

import javax.swing.JOptionPane;

public class Ordenando {
    public static void main(String[] args) {
        String resposta = JOptionPane.showInputDialog("Escreva o 1º numero: ");
        int n1 = Integer.valueOf(resposta);
        resposta = JOptionPane.showInputDialog("Escreva o 2º numero: ");
        int n2 = Integer.valueOf(resposta);
        resposta = JOptionPane.showInputDialog("Escreva o 3º numero: ");
        int n3 = Integer.valueOf(resposta);
        
            if (n1 > n2){
                if ( n2 > n3){
                JOptionPane.showMessageDialog(null, n1 + " - "+ n2 +" - "+ n3);
                }else if (n1 > n3){
                JOptionPane.showMessageDialog(null, n1 + " - "+ n3 +" - "+ n2);
                    }else{
                    JOptionPane.showMessageDialog(null, n3 + " - "+ n1 +" - "+ n2);
                    }   
            }else if(n2 > n3){
                if (n1 > n3){
                    JOptionPane.showMessageDialog(null, n2 + " - "+ n1 +" - "+ n3);
                }else {
                    JOptionPane.showMessageDialog(null, n2 + " - "+ n3 +" - "+ n1);
                }
            }else {
                JOptionPane.showMessageDialog(null, n3 + " - "+ n2 +" - "+ n1);
            }
    }
}   
