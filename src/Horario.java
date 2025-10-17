
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Horario extends JFrame{
	private JPanel pNorte, pSur, pOeste, pEste, pCentro;
	private JButton btnMenu, btnUsuario, btnHorarios, btnSalud;
	private JFrame ventanaActual, ventanaAnterior;
	
	public Horario(JFrame va) {
		ventanaActual = this;
		ventanaAnterior = va;
		setBounds(200, 200, 600, 400);
		setTitle("HORARIOS");
		
		pNorte = new JPanel();
		pSur = new JPanel();
		pOeste = new JPanel();
		pOeste.setLayout(new GridLayout(4, 1));
		pEste = new JPanel();
		pCentro = new JPanel();
		
		btnMenu = new JButton("MENU");
		btnUsuario = new JButton("USUARIO");
		btnHorarios = new JButton("HORARIOS");
		btnSalud = new JButton("SALUD");
		
		pOeste.add(btnMenu);
		pOeste.add(btnUsuario);
		pOeste.add(btnSalud);
		pOeste.add(btnHorarios);
		
		getContentPane().add(pEste, BorderLayout.EAST);
		getContentPane().add(pCentro, BorderLayout.CENTER);
		getContentPane().add(pNorte, BorderLayout.NORTH);
		getContentPane().add(pSur, BorderLayout.SOUTH);
		getContentPane().add(pOeste, BorderLayout.WEST);
		
		btnMenu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ventanaActual.setVisible(false);
				new Menu();
			}
		});
		
		btnUsuario.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ventanaActual.setVisible(false);
				new Usuario(ventanaActual);
			}
		});
		
		btnSalud.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ventanaActual.setVisible(false);
				new Salud(ventanaActual);
			}
		});
		
		setVisible(true);
	}
}

