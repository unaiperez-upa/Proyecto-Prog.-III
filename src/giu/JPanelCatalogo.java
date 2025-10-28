package giu;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import domain.Producto;

import javax.swing.JTable;

public class JPanelCatalogo extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private int filaTablaProductos = -1;
	public JTextField display;
	
	private List<Producto> producto;
	
	private JTable tablaProductos;
	private DefaultTableModel modeloDatosProductos;
	private JScrollPane scrollPaneProductos;
	private JTextField txtFiltro;
	private JTable tablaExplicacion;
	private DefaultTableModel modeloDatosExplicacion;
	private JScrollPane scrollPaneExplicacion;
	
	

	JPanel panelCatalogo = new JPanel(new BorderLayout());
	
	
	public void PanelCatalogo(List<Producto> producto) {
		
		this.producto = producto;
		
		JScrollPane scrollPaneProductos = new JScrollPane(this.tablaProductos);
		scrollPaneProductos.setBorder(new TitledBorder("Productos"));
		this.tablaProductos.setFillsViewportHeight(true);
		
		this.txtFiltro = new JTextField(20);
	
		JPanel panel = new JPanel(new GridLayout(1, 2, 10, 10));
		JPanel panelCatalogo = new JPanel();
		JPanel panelIzquierdo = new JPanel(new GridLayout(2, 1, 10, 10));
		
		
		
		MouseMotionAdapter miMouseMotionListener = new MouseMotionAdapter() {
			
				public void mouseMoved(MouseEvent e) {
				
				Point puntoRaton = new Point(e.getX(), e.getY());
				filaTablaProductos = tablaProductos.rowAtPoint(puntoRaton);
				tablaProductos.repaint();				
			
				}
			};
				
			MouseAdapter miMouseAdapter = new MouseAdapter() {
				@Override
			
				public void mouseExited(MouseEvent e) {
					filaTablaProductos = -1;
				}
			};
		
		
		this.tablaProductos.addMouseMotionListener(miMouseMotionListener);
		this.tablaProductos.addMouseListener(miMouseAdapter);
		
		
		JPanel panelFiltro = new JPanel();
		panelFiltro.add(new JLabel("Filtro: "));
		panelFiltro.add(txtFiltro);
		
		JPanel panelProductos = new JPanel();
		panelProductos.setLayout(new BorderLayout());
		panelProductos.add(BorderLayout.CENTER, scrollPaneProductos);
		panelProductos.add(BorderLayout.NORTH, panelFiltro);
		
		
		
		
		
		
		
		
		
	
	}
}