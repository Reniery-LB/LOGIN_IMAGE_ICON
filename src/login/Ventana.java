package login;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Ventana extends JFrame{

	public Ventana() {
		this.setTitle("USER LOGIN");
		this.setVisible(true);
		this.setSize(1000,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		ImageIcon icono = new ImageIcon("icono.png");
		Image imagen = icono.getImage();
		setIconImage(imagen);
		
		
		//this.add(this.calculadora());
		
	
		this.setLayout(new BorderLayout()); //LAYOUT MANAGER
		
		this.add(this.login(), BorderLayout.WEST); //JPANEL A LA IZQUIERDA
		this.add(this.logo(), BorderLayout.EAST); //JPANEL A LA DERECHA 
		//this.add(this.icono());
		
		//BARRA
		JMenuBar barra = new JMenuBar();
		JMenu file = new JMenu("Archivo");
		barra.add(file);

		
		//para las opciones del menu
		
		JMenuItem open = new JMenuItem("Abrir");
		file.add(open);
		
		JMenuItem close = new JMenuItem("Cerrar");
		file.add(close);
		
		JMenuItem guardar = new JMenuItem("Guardar");
		file.add(guardar);
		
		JMenuItem guardarComo = new JMenuItem("Guardar como");
		file.add(guardarComo);
		
		//MENU 2
		JMenu menu_2 = new JMenu("Ayuda");
		barra.add(menu_2);
		
		JCheckBoxMenuItem op_5 = new JCheckBoxMenuItem("Hola");
		menu_2.add(op_5); 
		
		
		this.setJMenuBar(barra);
		this.repaint();
		this.setVisible(true);
	}
	
	public JPanel login() 
	{
		//JPANEL
		
		JPanel mipanel = new JPanel();
		mipanel.setBackground(Color.decode("#EABDE6"));
		mipanel.setOpaque(true);
		mipanel.setSize(500,500);
		mipanel.setLocation(0,0);
		mipanel.setLayout(null); //QUITA EL MOLDE
		
		mipanel.setPreferredSize(new Dimension(500,500)); //AJUSTA EL TAMAÑO DEL PANEL DE LOGIN
		//--------------------------------
		//JLABEL
		
		//MI CUENTA
		JLabel mi_cuenta = new JLabel("MI CUENTA");
		mi_cuenta.setBounds(135, 0, 250, 100);
		mi_cuenta.setFont(new Font("Gill Sans MT",Font.BOLD,36));
		mi_cuenta.setForeground(Color.decode("#441752")); 
		
		mipanel.add(mi_cuenta); 

		//USUARIO
		JLabel usuario_label = new JLabel("Ingrese su usuario");
		usuario_label.setBounds(100, 100, 250, 100);
		usuario_label.setFont(new Font("Gill Sans MT",Font.BOLD,16));
		usuario_label.setForeground(Color.decode("#4B164C")); 
		
		mipanel.add(usuario_label);
		
		//CONTRASEÑA
		JLabel contra_label = new JLabel("Ingrese su contraseña");
		contra_label.setBounds(100, 180, 250, 100);
		contra_label.setFont(new Font("Gill Sans MT",Font.BOLD,16));
		contra_label.setForeground(Color.decode("#4B164C")); 
		
		
		mipanel.add(contra_label);
		
		//CREAR CUENTA
		JLabel cuenta = new JLabel("¿No tienes una cuenta?");
		cuenta.setBounds(158, 330, 250, 100);
		cuenta.setFont(new Font("Gill Sans MT",Font.BOLD,14));
		cuenta.setForeground(Color.BLACK);
		
		mipanel.add(cuenta);
		//--------------------------------
		//JTEXTFIELD
		JTextField usuario_field = new JTextField();
		usuario_field.setBounds(100, 170, 300, 30);
		usuario_field.setBorder(BorderFactory.createLineBorder(Color.decode("#441752"),2));
		
		mipanel.add(usuario_field);
		//--------------------------------
		//JPASSWORDFIELD
		JPasswordField contra_field = new JPasswordField();
		contra_field.setBounds(100, 250, 300, 30);
		contra_field.setBorder(BorderFactory.createLineBorder(Color.decode("#441752"),2));
		
		mipanel.add(contra_field);
		//--------------------------------
		//JLABEL - IMAGE ICON
		
		//USUARIO IMAGE ICON
		JLabel icon_usuario = new JLabel(new ImageIcon("usuario.png"));
		icon_usuario.setBounds(60, 170, 30, 30);
		
		mipanel.add(icon_usuario);
		
		JLabel cuadro_usuario = new JLabel();
		cuadro_usuario.setBounds(60, 170, 30, 30);
		cuadro_usuario.setBackground(Color.decode("#F8E7F6"));
		cuadro_usuario.setBorder(BorderFactory.createLineBorder(Color.decode("#4B164C"),2));
		cuadro_usuario.setOpaque(true);
		
		mipanel.add(cuadro_usuario);
		//CONTRASEÑA IMAGE ICON
		JLabel icon_contra = new JLabel(new ImageIcon("contraseña.png"));
		icon_contra.setBounds(60, 250, 30, 30);
		
		mipanel.add(icon_contra);
		
		JLabel cuadro_contra = new JLabel();
		cuadro_contra.setBounds(60, 250, 30, 30);
		cuadro_contra.setBackground(Color.decode("#F8E7F6"));
		cuadro_contra.setBorder(BorderFactory.createLineBorder(Color.decode("#4B164C"),2));
		cuadro_contra.setOpaque(true);
		
		mipanel.add(cuadro_contra);
		//--------------------------------
		//JBUTTON
		
		//ACCEDER
		JButton acceder = new JButton("ACCEDER");
		acceder.setBounds(160, 300, 150, 40);
		acceder.setBorder(BorderFactory.createLineBorder(Color.decode("#F8E7F6"),4));
		acceder.setFont(new Font("Gill Sans MT",Font.BOLD,16));
		acceder.setForeground(Color.decode("#F8E7F6"));
		acceder.setBackground(Color.decode("#4B164C"));
		acceder.setOpaque(true);
		
		mipanel.add(acceder);
		
		//REGISTRARSE
		JButton registrarse = new JButton("REGISTRARSE");
		registrarse.setBounds(145, 400, 180, 40);
		registrarse.setBorder(BorderFactory.createLineBorder(Color.decode("#F8E7F6"),4));
		registrarse.setFont(new Font("Gill Sans MT",Font.BOLD,16));
		registrarse.setForeground(Color.decode("#F8E7F6"));
		registrarse.setBackground(Color.decode("#4B164C"));
		registrarse.setOpaque(true);
		
		mipanel.add(registrarse);
		
		//--------------------------------
		//JLABEL FONDO
		JLabel fondo = new JLabel();
		fondo.setBounds(50, 110, 400, 250);
		fondo.setBorder(BorderFactory.createLineBorder(Color.decode("#441752"),2));
		fondo.setBackground(Color.decode("#F5F5F5"));
		fondo.setOpaque(true);
		
		mipanel.add(fondo);
		return mipanel;
	}
	
	public JPanel logo()
	{
		//JPANEL
		
		JPanel mipanel = new JPanel();
		mipanel.setBackground(Color.decode("#AA60C8")); 
		mipanel.setOpaque(true);
		mipanel.setSize(500,500);
		mipanel.setLocation(500,0);
		mipanel.setLayout(null); //QUITA EL MOLDE
		
		mipanel.setPreferredSize(new Dimension(500,500)); //AJUSTA EL TAMAÑO DEL PANEL DEL LOGO
		//--------------------------------
		//JLABEL - IMAGEICON
		JLabel logo = new JLabel(new ImageIcon("imagen.png"));
		logo.setBounds(80, 60, 350, 350);
		
		mipanel.add(logo);

		//NOMBRE
		JLabel nombre = new JLabel("NETFUSION");
		nombre.setBounds(135, 170, 250, 250);
		nombre.setFont(new Font("Gill Sans MT",Font.BOLD,36));
		
		mipanel.add(nombre);

		//COPYRIGHT
		JLabel copyright = new JLabel("copyright © NETFUSION. Todo los derechos reservados.");
		copyright.setBounds(115, 310, 350, 250);
		copyright.setFont(new Font("Gill Sans MT",Font.BOLD,10));
		copyright.setForeground(Color.DARK_GRAY);
		mipanel.add(copyright);
		
		return mipanel;
	}
	
	/*public Image icono() {
		Image icono = Toolkit.getDefaultToolkit().
			getImage(ClassLoader.getSystemResource("icono.png"));
		
		return icono;
	} */
	

	
	/*public JPanel calculadora() {
		//JPANEL
		
		JPanel mipanel = new JPanel();
		mipanel.setBackground(Color.decode("#EABDE6"));
		mipanel.setOpaque(true);
		mipanel.setLayout(new BorderLayout()); 
		
		JLabel results = new JLabel("20.00");
		results.setBackground(Color.WHITE);
		results.setOpaque(true);
		//results.setFont(fuente);
		mipanel.add(results,BorderLayout.NORTH);
		
		JPanel centro = new JPanel();
		centro.setBackground(Color.decode("#EAADE6"));
		centro.setOpaque(true);
		centro.setLayout(new BorderLayout());
		mipanel.add(centro,BorderLayout.CENTER));
		
		JPanel botones = new JPanel();
		botones.setLayout(new GridLayout(4,3));
		centro.add(botones,BorderLayout.CENTER);
		
		String[] textos = {"9", "8", "7", "6", "5", "4", "3", "2", "1", "0", "."};
		
		for (String texto_boton : textos) {
			
			JButton boton = new JButton(texto_boton);
			botones.add(boton);
		}
		
		JPanel grilla = new JPanel();
		grilla.setLayout(new GridLayout(6,1));
		centro.add(grilla, BorderLayout.LINE_END);
		
		String[] textos2 = {"+", "-", "*", "/", "=", "CE"};
		
		for (String texto_boton : textos2) {
			
			JButton boton = new JButton(texto_boton);
			grilla.add(boton);
		}
		
		return mipanel;
	} */
}
