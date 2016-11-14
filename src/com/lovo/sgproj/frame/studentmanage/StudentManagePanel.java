package com.lovo.sgproj.frame.studentmanage;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.lovo.netCRM.component.LovoButton;
import com.lovo.netCRM.component.LovoComboBox;
import com.lovo.netCRM.component.LovoTable;
import com.lovo.netCRM.component.LovoTxt;
import com.lovo.sgproj.frame.MainFrame;

public class StudentManagePanel extends JPanel {

	private LovoTable stuTab;

	private LovoButton stuInBtn;
	private LovoButton stuOutBtn;
	private LovoButton stuChgBtn;
	private LovoButton stuInfoBtn;

	private JPanel queryPanel;
	private JLabel nameLab;
	private JLabel classLab;
	private JLabel roomLab;
	private JTextField nameTxt;
	private JTextField classTxt;
	private JTextField roomTxt;
	private JButton queryBtn;

	private MainFrame frame;

	public StudentManagePanel(MainFrame frame) {
		this.frame = frame;
		this.setBackground(Color.WHITE);
		this.setLayout(null);
		this.initTable();
		this.initBtn();
		this.initQueryPanel();

	}

	private void initTable() {
		// TODO Auto-generated method stub
		this.stuTab = new LovoTable(this, new String[] { "学生姓名", "性别", "班级",
				"所在房间", "联系电话" }, new String[] {},// 数组中应该是对应属性的属性名
				"");// 填入唯一标示属性
		this.stuTab.setSizeAndLocation(20, 0, 750, 300);

	}

	private void initBtn() {
		// TODO Auto-generated method stub
		this.stuInBtn = new LovoButton("学生入住", 80, 380, this);
		this.stuOutBtn = new LovoButton("学生退房", 240, 380, this);
		this.stuChgBtn = new LovoButton("学生换房", 80, 450, this);
		this.stuInfoBtn = new LovoButton("学生详细信息", 240, 450, this);

		this.stuInBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new StudentInDialog(StudentManagePanel.this.frame);
			}
		});

		this.stuOutBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new StudentOutDialog(StudentManagePanel.this.frame);
			}
		});

		this.stuChgBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new StudentChgDialog(StudentManagePanel.this.frame);
			}
		});
		
		this.stuInfoBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new StudentShowDialog(StudentManagePanel.this.frame);
			}
		});

	}

	private void initQueryPanel() {
		// TODO Auto-generated method stub
		this.queryPanel = new JPanel();
		this.queryPanel.setBorder(BorderFactory.createTitledBorder("查询学生信息"));
		this.queryPanel.setBackground(Color.WHITE);
		this.queryPanel.setLayout(null);
		this.queryPanel.setBounds(380, 310, 300, 180);
		this.add(this.queryPanel);

		// 标签
		this.nameLab = new JLabel("姓名");
		this.nameLab.setBounds(40, 20, 30, 30);
		this.queryPanel.add(this.nameLab);
		this.classLab = new JLabel("班级");
		this.classLab.setBounds(40, 60, 30, 30);
		this.queryPanel.add(this.classLab);
		this.roomLab = new JLabel("房间");
		this.roomLab.setBounds(40, 100, 30, 30);
		this.queryPanel.add(this.roomLab);

		// 文本框
		this.nameTxt = new JTextField();
		this.nameTxt.setBounds(80, 27, 140, 20);
		this.queryPanel.add(this.nameTxt);
		this.classTxt = new JTextField();
		this.classTxt.setBounds(80, 67, 140, 20);
		this.queryPanel.add(this.classTxt);
		this.roomTxt = new JTextField();
		this.roomTxt.setBounds(80, 107, 140, 20);
		this.queryPanel.add(this.roomTxt);

		// 查询按钮
		this.queryBtn = new JButton("查询");
		this.queryBtn.setBounds(200, 140, 80, 20);
		this.queryPanel.add(this.queryBtn);
	}

}
