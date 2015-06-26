package Praktikum_9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FormRegistrasi extends JFrame{
	JButton button1, button2, button3;
	JLabel lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl8;
	JTextField txt1, txt2;
	JComboBox combo;
	JTextArea textarea;
	JCheckBox checkbox1, checkbox2, checkbox3;
	JRadioButton radiobutton1, radiobutton2;
	
	public FormRegistrasi() {
		super("Form Registrasi");
		setLayout(null);
		setSize(500, 300);
		createLayout();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void createLayout() {
		lbl1 = new JLabel("FORM REGISTRASI");
		lbl1.setBounds(150, 5, 200, 25);
		add(lbl1);
		
		lbl2 = new JLabel("Nama:");
		lbl2.setBounds(10, 30, 50, 25);
		add(lbl2);
		
		txt1 = new JTextField();
		txt1.setBounds(90, 30, 150, 25);
		add(txt1);
		
		lbl3 = new JLabel("No. Tlp:");
		lbl3.setBounds(10, 60, 50, 25);
		add(lbl3);
		
		txt2 = new JTextField();
		txt2.setBounds(90, 60, 150, 25);
		add(txt2);
		
		lbl4 = new JLabel("Agama:");
		lbl4.setBounds(10, 90, 50, 25);
		add(lbl4);
		
		String agama[]={"Islam","Kristen"};
		combo = new JComboBox(agama);
		combo.setBounds(90, 90, 150, 25);
		add(combo);
		
		lbl5 = new JLabel("Alamat:");
		lbl5.setBounds(10, 120, 200, 25);
		add(lbl5);
				
		textarea=new JTextArea(50,50);  
	    textarea.setBounds(90,120,150,70); 
		add(textarea);
		
		lbl6 = new JLabel("Jenis Kelamin:");
		lbl6.setBounds(270, 30, 150, 25);
		add(lbl6);
		
		radiobutton1 = new JRadioButton("Laki-laki");
		radiobutton1.setBounds(370, 30, 150, 25);
		add(radiobutton1);
		
		radiobutton2 = new JRadioButton("Perempuan");
		radiobutton2.setBounds(370, 60, 150, 25);
		add(radiobutton2);
		
		ButtonGroup group = new ButtonGroup();
	    group.add(radiobutton1);
	    group.add(radiobutton2);
		
		lbl7 = new JLabel("Hobby:");
		lbl7.setBounds(270, 90, 150, 25);
		add(lbl7);
		
		checkbox1 = new JCheckBox("Belajar");
		checkbox1.setBounds(350, 90, 150, 25);
		add(checkbox1);
		
		checkbox2 = new JCheckBox("Online");
		checkbox2.setBounds(350, 120, 150, 25);
		add(checkbox2);
		
		checkbox3 = new JCheckBox("Main Game");
		checkbox3.setBounds(350, 150, 150, 25);
		add(checkbox3);
		
		button1 = new JButton("Simpan");
		button1.setBounds(5, 200, 80, 30);
		add(button1);
		
		button2 = new JButton("Reset");
		button2.setBounds(100, 200, 80, 30);
		add(button2);
		
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				txt1.setText("");
				txt2.setText("");
				textarea.setText("");
				group.clearSelection();
				checkbox1.setSelected(false);
				checkbox2.setSelected(false);
				checkbox3 .setSelected(false);
			}
		});
		
		button3 = new JButton("Keluar");
		button3.setBounds(200, 200, 80, 30);
		add(button3);
		button3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new FormRegistrasi();

	}

}
