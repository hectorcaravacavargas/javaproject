import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener{

	private JMenuBar mb;
	private JMenu menuOpciones, menuCalcular, menuAcercaDe, menuColorFondo;
	private JMenuItem miCalculo, miRojo, miNegro, miMorado, miElCreador, miSalir, miNuevo;
	private JLabel logo, bienvenido, titulo, nombre, apellido1, apellido2, departamento, antiguo, resultado, footer;
	private JTextField nombreTrabajador, ap1, ap2;
	private JComboBox comboDepartamento, comboAntiguo;
	private JScrollPane scroll;
	private JTextArea textarea1;
	String nombreFinal =  "";

	public Principal(){
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Pantalla Principal");
		getContentPane().setBackground(new Color(255, 0, 0));
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
		Licencia ventanaLicencia = new Licencia();
		nombreFinal = ventanaLicencia.nombre;

		mb = new JMenuBar();
		mb.setBackground(new Color(255, 0, 0));
		setJMenuBar(mb);

		menuOpciones = new JMenu("Opciones");
		menuOpciones.setBackground(new Color(255, 0, 0));
		menuOpciones.setFont(new Font("Andale Mono", 1, 14));
		menuOpciones.setForeground(new Color(255, 255, 255));
		mb.add(menuOpciones);

		menuCalcular = new JMenu("Calcular");
		menuCalcular.setBackground(new Color(255, 0, 0));
		menuCalcular.setFont(new Font("Andale Mono", 1, 14));
		menuCalcular.setForeground(new Color(255, 255, 255));
		mb.add(menuCalcular);

		menuAcercaDe = new JMenu("Acerca De");
		menuAcercaDe.setBackground(new Color(255, 0, 0));
		menuAcercaDe.setFont(new Font("Andale Mono", 1, 14));
		menuAcercaDe.setForeground(new Color(255, 255, 255));
		mb.add(menuAcercaDe);

		menuColorFondo = new JMenu("Color de Fondo");
		menuColorFondo.setFont(new Font("Andale Mono", 1, 14));
		menuColorFondo.setForeground(new Color(255, 0, 0));
		menuOpciones.add(menuColorFondo);

		miCalculo = new JMenuItem("Vacaciones");
		miCalculo.setFont(new Font("Andale Mono", 1, 14));
		miCalculo.setForeground(new Color(255, 0, 0));
		menuCalcular.add(miCalculo);
		miCalculo.addActionListener(this);

		miRojo = new JMenuItem("Rojo");
		miRojo.setFont(new Font("Andale Mono", 1, 14));
		miRojo.setForeground(new Color(255, 0, 0));
		menuColorFondo.add(miRojo);
		miRojo.addActionListener(this);

		miNegro = new JMenuItem("Negro");
		miNegro.setFont(new Font("Andale Mono", 1, 14));
		miNegro.setForeground(new Color(0, 0, 0));
		menuColorFondo.add(miNegro);
		miNegro.addActionListener(this);

		miMorado = new JMenuItem("Morado");
		miMorado.setFont(new Font("Andale Mono", 1, 14));
		miMorado.setForeground(new Color(128, 0, 128));
		menuColorFondo.add(miMorado);
		miMorado.addActionListener(this);

		miNuevo = new JMenuItem("Nuevo");
		miNuevo.setFont(new Font("Andale Mono", 1, 14));
		miNuevo.setForeground(new Color(255, 0, 0));
		miNuevo.addActionListener(this);
		menuOpciones.add(miNuevo);

		miSalir = new JMenuItem("Salir");
		miSalir.setFont(new Font("Andale Mono", 1, 14));
		miSalir.setForeground(new Color(255, 0, 0));
		miSalir.addActionListener(this);
		menuOpciones.add(miSalir);
	
		miElCreador = new JMenuItem("Sobre el creador");
		miElCreador.setFont(new Font("Andale Mono", 1, 14));
		miElCreador.setForeground(new Color(255, 0, 0));
		miElCreador.addActionListener(this);
		menuAcercaDe.add(miElCreador);

		ImageIcon imagen = new ImageIcon("images/logo-coca.png");
		logo = new JLabel(imagen);
		logo.setBounds(5, 5, 250, 100);
		add(logo);

		bienvenido = new JLabel("Bienvenido " + nombreFinal);
		bienvenido.setBounds(280, 30, 300, 50);
		bienvenido.setFont(new Font("Andale Mono", 1, 32));
		bienvenido.setForeground(new Color(255, 255, 255));
		add(bienvenido);

		titulo = new JLabel("Datos del trabajador para el calculo de vacaciones");
		titulo.setBounds(45, 140, 900, 25);
		titulo.setFont(new Font("Andale Mono", 1, 24));
		titulo.setForeground(new Color(255, 255, 255));
		add(titulo);
		
		nombre = new JLabel("Nombre completo: ");
		nombre.setBounds(25, 188, 180, 25);
		nombre.setFont(new Font("Andale Mono", 1, 12));
		nombre.setForeground(new Color(255, 255, 255));
		add(nombre);

		nombreTrabajador = new JTextField();
		nombreTrabajador.setBounds(25, 213, 150, 25);
		nombreTrabajador.setBackground(new java.awt.Color(224, 224, 224));
		nombreTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
		nombreTrabajador.setForeground(new java.awt.Color(255, 0, 0));
		add(nombreTrabajador);
		
		apellido1 = new JLabel("Primer Apellido:");
		apellido1.setBounds(25, 248, 180, 25);
		apellido1.setFont(new Font("Andale Mono", 1, 12));
		apellido1.setForeground(new Color(255, 255, 255));
		add(apellido1);

		ap1 = new JTextField();
		ap1.setBounds(25, 273, 150, 25);
		ap1.setBackground(new java.awt.Color(224, 224, 224));
		ap1.setFont(new java.awt.Font("Andale Mono", 1, 14));
		ap1.setForeground(new java.awt.Color(255, 0, 0));
		add(ap1);
		
		apellido2 = new JLabel("Segundo Apellido:");
		apellido2.setBounds(25, 308, 180, 25);
		apellido2.setFont(new Font("Andale Mono", 1, 12));
		apellido2.setForeground(new Color(255, 255, 255));
		add(apellido2);

		ap2 = new JTextField();
		ap2.setBounds(25, 334, 150, 25);
		ap2.setBackground(new java.awt.Color(224, 224, 224));
		ap2.setFont(new java.awt.Font("Andale Mono", 1, 14));
		ap2.setForeground(new java.awt.Color(255, 0, 0));
		add(ap2);

		departamento = new JLabel("Selecciona el Departamento:");
		departamento.setBounds(220, 188, 200, 25);
		departamento.setFont(new Font("Andale Mono", 1, 14));
		departamento.setForeground(new Color(255, 255, 255));
		add(departamento);

		comboDepartamento = new JComboBox();
		comboDepartamento.setBounds(220, 213, 220, 25);
		comboDepartamento.setBackground(new java.awt.Color(224, 224, 224));
		comboDepartamento.setFont(new java.awt.Font("Andale Mono", 1, 14));
		comboDepartamento.setForeground(new java.awt.Color(255, 0, 0));
		add(comboDepartamento);
		comboDepartamento.addItem("");
		comboDepartamento.addItem("Atencion al Cliente");
		comboDepartamento.addItem("Departamento de logistica");
		comboDepartamento.addItem("Departamento de gerencia");
		
		antiguo = new JLabel("Selecciona la Antiguedad:");
		antiguo.setBounds(220, 248, 180, 25);
		antiguo.setFont(new Font("Andale Mono", 1, 14));
		antiguo.setForeground(new Color(255, 255, 255));
		add(antiguo);

		comboAntiguo = new JComboBox();
		comboAntiguo.setBounds(220, 273, 220, 25);
		comboAntiguo.setBackground(new java.awt.Color(224, 224, 224));
		comboAntiguo.setFont(new java.awt.Font("Andale Mono", 1, 14));
		comboAntiguo.setForeground(new java.awt.Color(255, 0, 0));
		add(comboAntiguo);
		comboAntiguo.addItem("");
		comboAntiguo.addItem("1 Año de servicio");
		comboAntiguo.addItem("2 a 6 años de servicio");
		comboAntiguo.addItem("7 o más años de servicio");

		resultado = new JLabel("Resultado del Calculo:");
		resultado.setBounds(220, 307, 180, 25);
		resultado.setFont(new Font("Andale Mono", 1, 14));
		resultado.setForeground(new Color(255, 255, 255));
		add(resultado);

		textarea1 = new JTextArea();
		textarea1.setEditable(false);
		textarea1.setBackground(new Color(224, 224, 224));
		textarea1.setFont(new Font("Andale Mono", 1, 11));
		textarea1.setForeground(new Color(255, 0, 0));
		textarea1.setText("\n    Aqui aparece el resultado del calculo de las vacaciones.");
		scroll = new JScrollPane(textarea1);
		scroll.setBounds(220, 333, 385, 90);
		add(scroll);

		footer = new JLabel("©2017 The Coca-Cola Comapany | Todos los derechos reservados");
		footer.setBounds(135, 445, 500, 30);
		footer.setFont(new Font("Andale Mono", 1, 14));
		footer.setForeground(new Color(255, 255, 255));
		add(footer);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == miCalculo){
			String nTrabajador = nombreTrabajador.getText();
			String AP1 = ap1.getText();
			String AP2 = ap2.getText();
			String dep = comboDepartamento.getSelectedItem().toString();
			String ant = comboAntiguo.getSelectedItem().toString();
			
			if(nTrabajador.equals("") || AP1.equals("") || AP2.equals("") || dep.equals("") || ant.equals("")){
				JOptionPane.showMessageDialog(null, "Debes llenar todos los campos :)");
			}else{

				if(dep.equals("Atencion al Cliente")){

					if(ant.equals("1 Año de servicio")){
						textarea1.setText("\n  El trabajador " + nTrabajador  + " " + AP1 + " " + AP2 +
									     "\n  quien labora en " + dep + " con " + ant + " recibe 6 dias de"+
									     "\n  vacaciones");
					}

					if(ant.equals("2 a 6 años de servicio")){
						textarea1.setText("\n  El trabajador " + nTrabajador  + " " + AP1 + " " + AP2 +
									     "\n  quien labora en " + dep + " con " + ant + " recibe 14 dias de"+
									     "\n  vacaciones");

					}

					if(ant.equals("7 o más años de servicio")){
						textarea1.setText("\n  El trabajador " + nTrabajador  + " " + AP1 + " " + AP2 +
									     "\n  quien labora en " + dep + " con " + ant + " recibe 20 dias de"+
									     "\n  vacaciones");

					}
				}

				if(dep.equals("Departamento de logistica")){

					if(ant.equals("1 Año de servicio")){
						textarea1.setText("\n  El trabajador " + nTrabajador  + " " + AP1 + " " + AP2 +
									     "\n  quien labora en " + dep + " con " + ant + " recibe 7 dias de"+
									     "\n  vacaciones");
					}

					if(ant.equals("2 a 6 años de servicio")){
						textarea1.setText("\n  El trabajador " + nTrabajador  + " " + AP1 + " " + AP2 +
									     "\n  quien labora en " + dep + " con " + ant + " recibe 15 dias de"+
									     "\n  vacaciones");

					}

					if(ant.equals("7 o más años de servicio")){
						textarea1.setText("\n  El trabajador " + nTrabajador  + " " + AP1 + " " + AP2 +
									     "\n  quien labora en " + dep + " con " + ant + " recibe 22 dias de"+
									     "\n  vacaciones");

					}
				}	

				if(dep.equals("Departamento de gerencia")){

					if(ant.equals("1 Año de servicio")){
						textarea1.setText("\n  El trabajador " + nTrabajador  + " " + AP1 + " " + AP2 +
									     "\n  quien labora en " + dep + " con " + ant + " recibe 10 dias de"+
									     "\n  vacaciones");
					}

					if(ant.equals("2 a 6 años de servicio")){
						textarea1.setText("\n  El trabajador " + nTrabajador  + " " + AP1 + " " + AP2 +
									     "\n  quien labora en " + dep + " con " + ant + " recibe 20 dias de"+
									     "\n  vacaciones");

					}

					if(ant.equals("7 o más años de servicio")){
						textarea1.setText("\n  El trabajador " + nTrabajador  + " " + AP1 + " " + AP2 +
									     "\n  quien labora en " + dep + " con " + ant + " recibe 30 dias de"+
									     "\n  vacaciones");

					}
				}	
			}
		}
	
		if(e.getSource() == miRojo){
			getContentPane().setBackground(new Color(255, 0, 0));
		}

		if(e.getSource() == miNegro){
			getContentPane().setBackground(new Color(0, 0, 0));
		}

		if(e.getSource() == miMorado){
			getContentPane().setBackground(new Color(128, 0, 128));
		}

		if(e.getSource() == miNuevo){
			ap1.setText("");
			ap2.setText("");
			nombreTrabajador.setText("");
			comboDepartamento.setSelectedIndex(0);
			comboAntiguo.setSelectedIndex(0);
			textarea1.setText("\n  Aqui aparece el resultado del calculo de las vacaciones.");
		}

		if(e.getSource() == miSalir){
			Bienvenida window = new Bienvenida();
			window.setBounds(0, 0, 350, 450);
			window.setVisible(true);
			window.setResizable(false);
			window.setLocationRelativeTo(null);
			this.setVisible(false);
		}
	
		if(e.getSource() == miElCreador){
			JOptionPane.showMessageDialog(null, "Desarrollado por Hector. Mi contacto: +506 8333 9684\n CREDITOS: \nhttps://www.youtube.com/@LaGeekipediaDeErnesto\n");
		}
	}
	
	public static void main(String args[]){
		Principal window = new Principal();
		window.setBounds(0, 0, 640, 535);
		window.setVisible(true);
		window.setResizable(false);
		window.setLocationRelativeTo(null);
	}
	
}