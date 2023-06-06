package src;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

public class TalentsAchievements extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TalentsAchievements frame = new TalentsAchievements();
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
	public TalentsAchievements() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 972, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Home = new JButton("Home");
		Home.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LandingPage HME = new LandingPage();
				HME.setVisible(true);
				dispose();
				
			}
		});
		Home.setBounds(437, 448, 137, 42);
		contentPane.add(Home);
		
		JLabel lblNewLabel_3 = new JLabel("Basic Information\r\n");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(25, 217, 112, 35);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("Hobbies\r\n\r\n");
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(24, 251, 85, 35);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Talents & Achievements\r\n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1.setBounds(25, 285, 160, 35);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("FAQS\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(25, 317, 55, 35);
		contentPane.add(lblNewLabel);
		
		
		JLabel lblNewLabel1 = new JLabel("New label");
		lblNewLabel1.setIcon(new ImageIcon(TalentsAchievements.class.getResource("/images/Talents & Achievements.png")));
		lblNewLabel1.setBounds(0, -29, 961, 576);
		contentPane.add(lblNewLabel1);
	}
}
