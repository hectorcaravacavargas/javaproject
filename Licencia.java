import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener{

	private JButton continuar, aceptar;
	private JLabel logo, titulo;
	private JCheckBox acepto;
	private JTextArea textarea1;
	private JScrollPane scroll;
	String nombre = "";

	public Licencia(){
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(255, 0, 0));
		setTitle("Licencia de Uso");
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
		Bienvenida ventanaBienvenida = new Bienvenida();
		nombre = ventanaBienvenida.texto;
		
		titulo = new JLabel("TERMINOS Y CONDICIONES");
		titulo.setBounds(215, 5, 200, 30);
		titulo.setFont(new Font("Andale Mono", 1, 14));
		titulo.setForeground(new Color(0, 0, 0));
		add(titulo);

		textarea1 = new JTextArea();
		textarea1.setEditable(false);
		textarea1.setFont(new Font("Andale Mono", 0, 9));
		textarea1.setText("\n\n          TERMINOS Y CONDICIONES:"  +
                    "\n\n            A.  PROHIBIDA SU VENTA O DISTRIBUCION SIN AUTORIZACION DE LA GEEKIPEDIA DE ERNESTO." +
                    "\n            B.  PROHIBIDA LA ALTERACION DEL CODIGO FUENTE O DISEÑO DE LAS INTERFACES GRAFICAS." +
                    "\n            C.  LA GEEKIPEDIA DE ERNESTO NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
                    "\n\n          LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACION RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE" +
                    "\n          (LA GEEKIPEDIA DE ERNESTO Y EL AUTOR ERNESTO), NO SE RESPONSABILIZAN DEL USO QUE USTED" + 
                    "\n          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)" +
                    "\n          SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." + 
                    "\n\n          PARA MAYOR INFORMACION SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE" + 
                    "\n          http://www.youtube.com/ernestoperezm");
		scroll = new JScrollPane(textarea1);
		scroll.setBounds(10, 40, 575, 200);
		add(scroll);

		acepto  = new JCheckBox("Yo " + nombre + " Acepto");
		acepto.setBounds(10, 250, 300, 30);
		acepto.addChangeListener(this);
		add(acepto);

		continuar = new JButton("Continuar");
		continuar.setBounds(10, 290, 100, 30);
		continuar.addActionListener(this);
		continuar.setEnabled(false);
		add(continuar);

		aceptar = new JButton("No Acepto");
		aceptar.setBounds(120, 290, 100, 30);
		aceptar.addActionListener(this);	
		aceptar.setEnabled(true);
		add(aceptar);

		ImageIcon imagen = new ImageIcon("images/logo-coca.png");
		logo = new JLabel(imagen);
		logo.setBounds(315, 135, 300, 300);
		add(logo);
	}

	public void stateChanged(ChangeEvent e){
		if(acepto.isSelected() == true){
			continuar.setEnabled(true);
			aceptar.setEnabled(false);
		}else{
			continuar.setEnabled(false);
			aceptar.setEnabled(true);
		}
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource() == continuar){
			Principal window = new Principal();
			window.setBounds(0, 0, 640, 535);
			window.setVisible(true);
			window.setResizable(false);
			window.setLocationRelativeTo(null);
			this.setVisible(false);
		} else if(e.getSource() == aceptar){
			Bienvenida window = new Bienvenida();
			window.setBounds(0, 0, 350, 450);
			window.setVisible(true);
			window.setResizable(false);
			window.setLocationRelativeTo(null);
			this.setVisible(false);
		}
	}

	public static void main(String args[]){
		Licencia window = new Licencia();
		window.setBounds(0, 0, 610, 380);
		window.setVisible(true);
		window.setResizable(false);
		window.setLocationRelativeTo(null);
	}
}