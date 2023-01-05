/*
 * Professor a minha telinha ficou desformatada. Tanto os componentes da check box quanto os botões não estão 
 * juntos na mesma "linha". Mas o resto acho que está certo.
*/

import javax.swing.*;

public class telaDaAtiv3 extends JFrame {
    
    public void telinha() {
        
        JPanel panel = new JPanel();
        
        String[] cores = {"Vermelho", "Azul", "Cinza", "Rosa", "Verde"};
        String[] check = {"Fundo", "Letra"};
        String[] botoes = { "Ok", "Cancelar"};

        panel.add(new JComboBox<String>(cores));

        for (int i = 0; i < check.length; i++) {
            panel.add(new JCheckBox(check[i]));
        }
        for (int i = 0; i < botoes.length; i++) {
            panel.add(new JButton(botoes[i]));
        }

        add(panel);

        setSize(200, 200);
        setVisible(true);
        setResizable(false);
    }

    public static void main(String[] args) {
        
        telaDaAtiv3 ativ3 = new telaDaAtiv3();
        ativ3.telinha();
    }

}
