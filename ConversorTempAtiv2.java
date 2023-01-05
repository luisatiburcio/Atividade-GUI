import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConversorTempAtiv2 extends JFrame implements ActionListener {

    private JLabel jlabel, jlabel2;
    protected JTextField jtext;
    private JButton jbutton;

    public ConversorTempAtiv2 (String titulo) {
		
        super(titulo);
		setLayout(new GridLayout(2, 2));

		jlabel = new JLabel("Celsius:");
        jlabel2 = new JLabel("32 Fahrenheit");
		jtext = new JTextField("0");
		jbutton = new JButton("Convert");

		add(jlabel);
		add(jtext);
        add(jlabel2);
		add(jbutton);

		jtext.addActionListener(this);
		jbutton.addActionListener(this);

    }

    @Override
	public void actionPerformed(ActionEvent event) {
        double temperaturaCelsius = Double.parseDouble(jtext.getText());
        double temperaturaFarenheit = ((temperaturaCelsius * 9/5) + 32);
        
        jlabel2.setText(temperaturaFarenheit + " Farenheit");
	}

    public static void main(String[] args) {

        ConversorTempAtiv2 conversor = new ConversorTempAtiv2("Conversor de Temperatura");
		conversor.setSize(350,130);
		conversor.setVisible(true);
    }

}
