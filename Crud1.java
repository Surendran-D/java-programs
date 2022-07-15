import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JToggleButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JComboBox;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Crud1 {

	private JFrame frame;
	private JTextField txtRollNo;
	private JTextField txtName;
	private JTextField txtTamil;
	private JTextField txtEnglish;
	private JTextField txtMaths;
	private JTextField txtScience;
	private JTextField txtSocial;
	private String RollNo,Name,Tamil,English,Maths,Science,Social;

	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Crud1 window = new Crud1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public Crud1() throws ClassNotFoundException, SQLException {
		initialize();
		
		connect();
	}
	Connection con=null;
	PreparedStatement ps=null;

	private void connect() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		   Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","");
		   if(con!=null)
			   System.out.println("connection done!!!!");
		
		
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 531, 449);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("RollNo");
		lblNewLabel.setBounds(10, 77, 74, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 120, 74, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblTamil = new JLabel("Tamil");
		lblTamil.setBounds(10, 169, 74, 14);
		frame.getContentPane().add(lblTamil);
		
		JLabel lblTamil_1 = new JLabel("English");
		lblTamil_1.setBounds(10, 205, 74, 14);
		frame.getContentPane().add(lblTamil_1);
		
		JLabel lblTamil_2 = new JLabel("Maths");
		lblTamil_2.setBounds(10, 236, 74, 14);
		frame.getContentPane().add(lblTamil_2);
		
		JLabel lblTamil_2_1 = new JLabel("Science");
		lblTamil_2_1.setBounds(10, 275, 74, 14);
		frame.getContentPane().add(lblTamil_2_1);
		
		JLabel lblTamil_2_2 = new JLabel("Social");
		lblTamil_2_2.setBounds(10, 314, 74, 14);
		frame.getContentPane().add(lblTamil_2_2);
		
		txtRollNo = new JTextField();
		txtRollNo.setBounds(100, 74, 86, 20);
		frame.getContentPane().add(txtRollNo);
		txtRollNo.setColumns(10);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(100, 117, 86, 20);
		frame.getContentPane().add(txtName);
		
		txtTamil = new JTextField();
		txtTamil.setColumns(10);
		txtTamil.setBounds(100, 166, 86, 20);
		frame.getContentPane().add(txtTamil);
		
		txtEnglish = new JTextField();
		txtEnglish.setColumns(10);
		txtEnglish.setBounds(100, 202, 86, 20);
		frame.getContentPane().add(txtEnglish);
		
		txtMaths = new JTextField();
		txtMaths.setColumns(10);
		txtMaths.setBounds(100, 233, 86, 20);
		frame.getContentPane().add(txtMaths);
		
		txtScience = new JTextField();
		txtScience.setColumns(10);
		txtScience.setBounds(100, 264, 86, 20);
		frame.getContentPane().add(txtScience);
		
		txtSocial = new JTextField();
		txtSocial.setColumns(10);
		txtSocial.setBounds(100, 311, 86, 20);
		frame.getContentPane().add(txtSocial);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					connect();
				} catch (ClassNotFoundException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
				RollNo=txtRollNo.getText();
				Name=txtName.getText();
				Tamil=txtTamil.getText();
				English=txtEnglish.getText();
				Maths=txtMaths.getText();
				Science=txtScience.getText();
				Social=txtSocial.getText();
							
				try {
					String sql="insert into student (RollNo,Name,Tamil,English,Maths,Science,Social) values(?,?,?,?,?,?,?)";
					ps=con.prepareStatement(sql);
					ps.setString(0, RollNo);
					ps.setString(2, Name);
					ps.setString(3, Tamil);
					ps.setString(4, English);
					ps.setString(5, Maths);
					ps.setString(6, Science);
					ps.setString(7, Social);
					ps.executeUpdate();
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(97, 365, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Coimbatore Matriculation School");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setBackground(Color.PINK);
		lblNewLabel_1.setBounds(146, 11, 237, 34);
		frame.getContentPane().add(lblNewLabel_1);
	}
}        
