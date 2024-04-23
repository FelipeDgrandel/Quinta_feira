import javax.swing.JOptionPane;

public class TesteLaço1 {
    public static void main(String[] args) {
        int contador = 1;
        String sequencia = "";
        while (contador <= 100) {
            sequencia = sequencia + contador + " ";
            contador++;
        } // dessa maneira ele ira mostra uma caixa de mensagem, sem quebra de linha.
         // sem uso de "if"
        JOptionPane.showMessageDialog(null,sequencia," String montada",1);
    }
}
