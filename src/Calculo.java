import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	int altura;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculo frame = new Calculo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		JLabel lblResultado = new JLabel("New label");
		lblResultado.setBounds(282, 71, 142, 14);

		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Area Cuadrado/Rectangulo");
		btnNewButton.setBounds(111, 136, 178, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					int base = Integer.parseInt(textField.getText());
					int altura = Integer.parseInt(textField_1.getText());
					
					int area = base * altura;
					
					lblResultado.setText("El area es " + area);
					
				}
				
		            
				
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Perimetro");
		btnNewButton_1.setBounds(159, 170, 89, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double base = Double.parseDouble(textField.getText());
	            double altura = Double.parseDouble(textField_1.getText());

	            double perimetro;
	            if (altura <= 0) {
	                perimetro = 4 * base; // Cuadrado
	            } else {
	                perimetro = 2 * (base + altura); // Rectángulo
	                
	                lblResultado.setText("El perimetro es " + perimetro);
	                
			}
			}
		});
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Area Circulo");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double radio = Double.parseDouble(textField_2.getText());
	            double area = Math.PI * Math.pow(radio, 2);
	            
	            lblResultado.setText("El area es " + area);
			}
		});
		btnNewButton_2.setBounds(155, 204, 111, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("Base:");
		lblNewLabel.setBounds(62, 55, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Altura:");
		lblNewLabel_1.setBounds(62, 94, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(159, 52, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(159, 91, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		contentPane.add(lblResultado);
		
		JLabel lblNewLabel_2 = new JLabel("Radio:");
		lblNewLabel_2.setBounds(62, 30, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(159, 21, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
	}
}
