package src;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class LandingPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LandingPage frame = new LandingPage();
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
	public LandingPage() {
		setResizable(false);
		setAutoRequestFocus(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 972, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton BasicInformation = new JButton("Basic Information\r\n");
		BasicInformation.setFont(new Font("Tahoma", Font.BOLD, 14));
		BasicInformation.setBackground(Color.WHITE);
		BasicInformation.setBounds(150, 305, 171, 45);
		BasicInformation.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				BasicInformation BasicINFO = new BasicInformation();
				BasicINFO.setVisible(true);
				dispose();
				
			}
		});
		contentPane.add(BasicInformation);
		
		JButton Hobby = new JButton("Hobbies");
		Hobby.setFont(new Font("Tahoma", Font.BOLD, 14));
		Hobby.setBounds(351, 305, 98, 45);
		Hobby.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				 Hobby Hobbys = new Hobby();
				Hobbys.setVisible(true);
				dispose();
				
			}
		});
		
		contentPane.add(Hobby);
		
		JButton TalentsAchievement = new JButton("Talents & Achievements");
		TalentsAchievement.setFont(new Font("Tahoma", Font.BOLD, 14));
		TalentsAchievement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TalentsAchievements talent = new TalentsAchievements();
				talent.setVisible(true);
			}
		});
		TalentsAchievement.setBounds(471, 305, 214, 45);
		contentPane.add(TalentsAchievement);
		
		JButton FAQS = new JButton("FAQS\r\n");
		FAQS.setFont(new Font("Tahoma", Font.BOLD, 14));
		FAQS.setBounds(704, 305, 107, 45);
		FAQS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FAQS FAQ = new FAQS();
				FAQ.setVisible(true);
			}
		});
		contentPane.add(FAQS);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, -29, 961, 576);
		lblNewLabel.setLabelFor(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(LandingPage.class.getResource("/images/hello.png")));
		contentPane.add(lblNewLabel);
	}

}
