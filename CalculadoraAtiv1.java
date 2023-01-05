import javax.swing.*;
import java.awt.*;

public class CalculadoraAtiv1 extends JFrame {

    public void calc() {
        
        JTextField espacoDigitacao = new JTextField(16);
        espacoDigitacao.setEditable(false);

        String[] botoes = { "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", " ", "=", "+"};

        JPanel panel = new JPanel();

        panel.add(espacoDigitacao);
        for (int i = 0; i < botoes.length; i++) {
            panel.add(new JButton(botoes[i]));
        }

        panel.setBackground(Color.gray);

        add(panel);
        setSize(230, 200);
        setVisible(true);
        setResizable(false);
    }

    public static void main(String[] args) {
        
        CalculadoraAtiv1 calculadora = new CalculadoraAtiv1();
        calculadora.calc();
    }
}

