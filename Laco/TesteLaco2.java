import javax.swing.JOptionPane;

public class TesteLaco2 {
    public static void main(String[] args) {
        int contador = 1 ;
        String sequencia = " ";
        while (contador <= 100) {
            sequencia = sequencia + contador + "";
            // se caso o resto da conta for "0" ele faz a operacao " if ".
            if (contador %20 == 0 ) {
                // Quebra de linha
                sequencia = sequencia + "\n";
            }
            contador++;
        } // mostra a msg na tela
        JOptionPane.showMessageDialog(null,sequencia,"String montada",1);;
    }
}
