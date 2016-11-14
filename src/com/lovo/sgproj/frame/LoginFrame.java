package com.lovo.sgproj.frame;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame{
	
	private Container contentP;
	
	private JLabel titleLab;
	
	private JLabel nameLab;
	
	private JLabel pwdLab;
	
	private JTextField nameTxt;
	
	private JPasswordField pwdTxt;
	
	private JButton loginBtn;
	
	
	public LoginFrame(){
		Toolkit tk = Toolkit.getDefaultToolkit();
		this.setIconImage(tk.createImage("image/hp.JPG"));
		this.setTitle("宿舍管理系统");
		this.setLocation(440, 230);
		this.setSize(400, 300);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.init();
		
		this.setVisible(true);
		
	}
	
	private void init(){
		
		
		this.contentP = this.getContentPane();
		this.contentP.setBackground(Color.WHITE);
		this.contentP.setLayout(null);
				
		this.titleLab = new JLabel();
		this.titleLab.setText("LOVO宿管系统");
		this.titleLab.setFont(new Font("微软雅黑",Font.ITALIC,28));
		this.titleLab.setForeground(new Color(153,71,133));		
		this.titleLab.setBounds(100, 0, 200, 50);
		this.contentP.add(this.titleLab);
		
		
		this.nameLab = new JLabel();
		this.nameLab.setText("用户名：");
		this.nameLab.setFont(new Font("微软雅黑",Font.ITALIC,14));
		this.nameLab.setForeground(new Color(153,71,133));		
		this.nameLab.setBounds(50, 70, 80, 30);
		this.contentP.add(this.nameLab);
		
		this.pwdLab = new JLabel();
		this.pwdLab.setText("密   码：");
		this.pwdLab.setFont(new Font("微软雅黑",Font.ITALIC,14));
		this.pwdLab.setForeground(new Color(153,71,133));		
		this.pwdLab.setBounds(50, 130, 80, 30);
		this.contentP.add(this.pwdLab);
		
		
		this.nameTxt = new JTextField();
		this.nameTxt.setFont(new Font("微软雅黑",Font.ITALIC,18));
		this.nameTxt.setForeground(new Color(153,71,133));
		this.nameTxt.setBounds(135, 70, 150, 30);
		this.contentP.add(this.nameTxt);
		
		this.pwdTxt = new JPasswordField();
		this.pwdTxt.setFont(new Font("微软雅黑",Font.ITALIC,18));
		this.pwdTxt.setForeground(new Color(153,71,133));
		this.pwdTxt.setBounds(135, 130, 150, 30);
		this.contentP.add(this.pwdTxt);
		

		this.loginBtn = new JButton();
		this.loginBtn.setText("登录");
		this.loginBtn.setFont(new Font("微软雅黑",Font.BOLD,18));
		this.loginBtn.setForeground(new Color(153,71,133));
		this.loginBtn.setBounds(235, 200, 80, 30);
		this.contentP.add(this.loginBtn);
		
		this.loginBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				//先调用业务层方法进行登录判断
				if(true){
					new MainFrame();
					LoginFrame.this.dispose();
				}
			}
		});
		
	}
	
}
