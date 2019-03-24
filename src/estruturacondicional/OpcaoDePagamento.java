
package estruturacondicional;

import javax.swing.JOptionPane;

public class OpcaoDePagamento {
    public static void main(String[] args) {
        String v = JOptionPane.showInputDialog("Qual o valor da compra: ");
        double valor = Double.valueOf(v);
                
        String escolha = JOptionPane.showInputDialog("Digite o  valor de pagamento:\nD - dinheiro\n"
                + "C - Crédito\n2 - Crediario 2x\n3 - Crediadio 3x");
         
        switch(escolha){
            case "d":
                valor = valor - (valor * 15)/100;
                JOptionPane.showMessageDialog(null,"O valor da compra é de: "+ Math.round(valor) +" R$");
                break;
            case "c":
                valor = (valor * 5)/100 + valor;
                JOptionPane.showMessageDialog(null,"O valor da compra é de: "+ Math.round(valor) +" R$");
                break;
            case "2":
                JOptionPane.showMessageDialog(null,"O valor da compra é de: "+ Math.round(valor) +" R$\n"
                        + "Parcelas: 2 vezes de "+ valor /2+" Reais");
            case "3":
                 JOptionPane.showMessageDialog(null,"O valor da compra é de: "
                        + Math.round(valor + (valor *10)/100) +" R$\n"
                        + "Parcelas: 3 vezes de " + Math.round(valor /3)+" Reais");
        }
    }
}
