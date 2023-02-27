import javax.swing.JOptionPane;
   public class teste_calc {
    public static void main(String[] args) {    
        int x = Integer.parseInt(JOptionPane.showInputDialog("1-soma  2-subtracao  3-multiplicacao  4-divisao"));
        double v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        double v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
        
        if (x == 1) {
            Double resultado1 = v1 + v2; 
            JOptionPane.showMessageDialog(null, "soma = " +  resultado1 );
        }
        else if (x == 2) {
            Double resultado2 = v1 - v2;
            JOptionPane.showMessageDialog(null, "subtracao = " +  resultado2 );
        }
        else if (x == 3) {
            Double resultado3 = v1 * v2;
            JOptionPane.showMessageDialog(null, "multiplicacao = " +  resultado3 );
        }
        else if (x == 4) {
            Double resultado4 = v1 / v2;
            JOptionPane.showMessageDialog(null, "divisao = " +  resultado4 );
        }
        else {
            JOptionPane.showMessageDialog(null, "ERRO! você não escolheu uma operação válida");
        }
    }   
}    
    

