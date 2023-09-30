import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Bienvenida extends JFrame implements ActionListener{

	private JLabel label1, label2, label3, label4;
	private JTextField inicio;
	private JButton ingresar;
	public static String texto = "";
	
	public Bienvenida(){
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Bienvenido");
		getContentPane().setBackground(new Color(255, 0, 0));
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

		ImageIcon imagen = new ImageIcon("images/logo-coca.png");
		label1 = new JLabel(imagen);
		label1.setBounds(25, 15, 300, 150);
		add(label1);

		label2 = new JLabel("Sistema de Control Vacacional");
		label2.setBounds(35, 135, 300, 30);
		label2.setFont(new Font("Andale Mono" , 3, 18));
		label2.setForeground(new Color(255, 255, 255));
		add(label2);

		label3 = new JLabel("Ingrese su nombre:");
		label3.setBounds(45, 212, 200, 30);
		label3.setFont(new Font("Andale Mono" , 1, 12));
		label3.setForeground(new Color(255, 255, 255));
		add(label3);
		
		label4 = new JLabel("©2017 The Coca-Cola Comapany");
		label4.setBounds(85, 375, 300, 30);
		label4.setFont(new Font("Andale Mono" , 1, 12));
		label4.setForeground(new Color(255, 255, 255));
		add(label4);

		inicio = new JTextField();
		inicio.setBounds(45, 240, 255, 25);
		inicio.setBackground(new Color(224, 224, 224));
		inicio.setFont(new Font("Andale Mono", 1, 14));
		inicio.setForeground(new Color(255, 0, 0));
		add(inicio);

		ingresar = new JButton("Ingresar");
		ingresar.setBounds(125, 280, 100, 30);
		ingresar.setBackground(new Color(255, 255, 255));
		ingresar.setFont(new Font("Andale Mono", 1, 14));
		ingresar.setForeground(new Color(255, 0, 0));
		ingresar.addActionListener(this);
		add(ingresar);
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource() == ingresar){
			texto = inicio.getText().trim();
			if(texto.equals("")){
				JOptionPane.showMessageDialog(null, "Debes ingresar un nombre");
			}else{
				Licencia window = new Licencia();
				window.setBounds(0, 0, 600, 380);
				window.setVisible(true);
				window.setResizable(false);
				window.setLocationRelativeTo(null);
				this.setVisible(false);
			}
		}
	}

	public static void main(String args[]){
		Bienvenida window = new Bienvenida();
		window.setBounds(0, 0, 350, 450);
		window.setVisible(true);
		window.setResizable(false);
		window.setLocationRelativeTo(null);
	}
}