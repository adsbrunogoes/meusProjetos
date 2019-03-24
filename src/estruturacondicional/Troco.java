
package estruturacondicional;

import javax.swing.JOptionPane;

public class Troco {
    public static void main(String[] args) {
        String resposta = JOptionPane.showInputDialog("Digite o  valor da compra: ");
        int valorCompra = Integer.valueOf(resposta);
        resposta = JOptionPane.showInputDialog("Digite o valor pago: ");
        int pagamento = Integer.valueOf(resposta);
        int troco = pagamento -  valorCompra;
        JOptionPane.showMessageDialog(null,"Valor do troco : \n"+ troco + " R$");
        
        switch (troco){
            case 1:
                JOptionPane.showMessageDialog(null,"1 moeda de 1 Real");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"1 nota de 2 Reais");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"1 nota de 2 Reais\n1 moeda de 1 Real");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"2 nota de 2 Reais");
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"1 nota de 5 Reais");
                break;
            case 6:
                JOptionPane.showMessageDialog(null,"1 nota de 5 Reais\n1 moeda de 1 Real");
                break;
            case 7:
                JOptionPane.showMessageDialog(null,"1 nota de 5 Reais\n1 nota 2 Reais");
                break;
            case 8: 
                JOptionPane.showMessageDialog(null,"1 nota de 5 Reais\n1 nota de 2 Reais\n"
                        + "1 moeda de 1 Real");
                break;
            case 9:
                JOptionPane.showMessageDialog(null,"1 nota de 5 Reais\n2 notas de 2 Reais");
            case 10:
                JOptionPane.showMessageDialog(null,"1 nota de 10 Reais"); 
                break;
            case 11:
                JOptionPane.showMessageDialog(null,"1 nota de 10 Reais\n1 moeda de 1 Real"); 
                break; 
            case 12:
                JOptionPane.showMessageDialog(null,"1 nota de 10 Reais\n1 nota de 2 Reais"); 
                break; 
            case 13:
                JOptionPane.showMessageDialog(null,"1 nota de 10 Reais\n1nota de 2 Reais\n"
                        + "1 moeda de 1 Real"); 
                break;  
            case 14:
                JOptionPane.showMessageDialog(null,"1 nota de 10 Reais\n2 notas de 2 Reais"); 
                break;
            case 15:
                JOptionPane.showMessageDialog(null,"1 nota de 10 Reais\n1 nota de 5 Reais"); 
                break; 
            case 16:
                JOptionPane.showMessageDialog(null,"1 nota de 10 Reais\n3 notas de 2 Reais"); 
                break; 
            case 17:
                JOptionPane.showMessageDialog(null,"1 nota de 10 Reais\n1 nota de 5 Reais\n1 nota de 2"); 
                break;  
            case 18:
                JOptionPane.showMessageDialog(null,"1 nota de 10 Reais\n1 nota de 5 Reais\n"
                        + "1 nota de 2 Reais\n1 moeda de 1 Real");
                break;
            case 19:
                JOptionPane.showMessageDialog(null,"1 nota de 10 Reais\n2 notas de 2 Reais"); 
                break; 
            case 20:
                JOptionPane.showMessageDialog(null,"1 nota de 20 Reais"); 
                break; 
            case 21:
                JOptionPane.showMessageDialog(null,"1 nota de 20 Reais\n1 moeda de 1 Real"); 
                break; 
            case 22:
                JOptionPane.showMessageDialog(null,"1 nota de 20 Reais\n1 nota de 2 Reais"); 
                break; 
            case 23:
                JOptionPane.showMessageDialog(null,"1 nota de 20 Reais\n1nota de 2 Reais\n"
                        + "1 moeda de 1 Real"); 
                break;  
            case 24:
                JOptionPane.showMessageDialog(null,"1 nota de 20 Reais\n2 notas de 2 Reais"); 
                break;
            case 25:
                JOptionPane.showMessageDialog(null,"1 nota de 20 Reais\n1 nota de 5 Reais"); 
                break; 
            case 26:
                JOptionPane.showMessageDialog(null,"1 nota de 20 Reais\n3 notas de 2 Reais"); 
                break; 
            case 27:
                JOptionPane.showMessageDialog(null,"1 nota de 20 Reais\n1 nota de 5 Reais\n1 nota de 2"); 
                break;  
            case 28:
                JOptionPane.showMessageDialog(null,"1 nota de 20 Reais\n1 nota de 5 Reais\n"
                        + "1 nota de 2 Reais\n1 moeda de 1 Real");
                break;
            case 29:
                JOptionPane.showMessageDialog(null,"1 nota de 20 Reais\n2 notas de 2 Reais"); 
                break;  
            case 30:
                JOptionPane.showMessageDialog(null,"1 nota de 20 Reais\n1 nota de 10 Reais"); 
                break; 
            case 31:
                JOptionPane.showMessageDialog(null,"1 nota de 20 Reais\n1 nota de 10 Reais"
                        + "\n1 moeda de 1 Real"); 
                break; 
            case 32:
                JOptionPane.showMessageDialog(null,"1 nota de 20 Reais\n1 nota de 10 Reais"
                        + "\n1 nota de 2 Reais"); 
                break; 
            case 33:
                JOptionPane.showMessageDialog(null,"1 nota de 20 Reais\n1 nota de 10 Reais"
                        + "\n1nota de 2 Reais\n1 moeda de 1 Real"); 
                break;  
            case 34:
                JOptionPane.showMessageDialog(null,"1 nota de 20 Reais\n1 nota de 10 Reais"
                        + "\n2 notas de 2 Reais"); 
                break;
            case 35:
                JOptionPane.showMessageDialog(null,"1 nota de 20 Reais\n1 nota de 10 Reais"
                        + "\n1 nota de 5 Reais"); 
                break; 
            case 36:
                JOptionPane.showMessageDialog(null,"1 nota de 20 Reais"
                        + "\n1 nota de 10 Reais\n3 notas de 2 Reais"); 
                break; 
            case 37:
                JOptionPane.showMessageDialog(null,"1 nota de 20 Reais\n1 nota de 10 Reais"
                        + "\n1 nota de 5 Reais\n1 nota de 2"); 
                break;  
            case 38:
                JOptionPane.showMessageDialog(null,"1 nota de 20 Reais\n1 nota de 10 Reais"
                        + "\n1 nota de 5 Reais\n"
                        + "1 nota de 2 Reais\n1 moeda de 1 Real");
                break;
            case 39:
                JOptionPane.showMessageDialog(null,"1 nota de 20 Reais\n1 nota de 10 Reais\n"
                        + "1 nota de 5 Reais\n2 notas de 2 Reais"); 
                break;
            case 40:
                JOptionPane.showMessageDialog(null,"2 nota de 20 Reais"); 
                break; 
            case 41:
                JOptionPane.showMessageDialog(null,"2 nota de 20 Reais\n1 moeda de 1 Real"); 
                break; 
            case 42:
                JOptionPane.showMessageDialog(null,"2 nota de 20 Reais\n1 nota de 2 Reais"); 
                break; 
            case 43:
                JOptionPane.showMessageDialog(null,"2 nota de 20 Reais\n1nota de 2 Reais\n"
                        + "1 moeda de 1 Real"); 
                break;  
            case 44:
                JOptionPane.showMessageDialog(null,"2 nota de 20 Reais\n2 notas de 2 Reais"); 
                break;
            case 45:
                JOptionPane.showMessageDialog(null,"2 nota de 20 Reais\n1 nota de 5 Reais"); 
            case 46:
                JOptionPane.showMessageDialog(null,"2 nota de 20 Reais\n3 notas de 2 Reais"); 
                break; 
            case 47:
                JOptionPane.showMessageDialog(null,"2 nota de 20 Reais\n1 nota de 5 Reais\n1 nota de 2"); 
                break;  
            case 49:
                JOptionPane.showMessageDialog(null,"2 nota de 20 Reais\n1 nota de 5 Reais\n"
                        + "2 nota de 2 Reais");
                break;  
            case 50:
                JOptionPane.showMessageDialog(null,"1 nota de 50 Reais"); 

                    
     
     
     
                
        
        }       
    }
}
