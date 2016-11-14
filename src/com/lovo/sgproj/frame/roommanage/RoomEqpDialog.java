package com.lovo.sgproj.frame.roommanage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.lovo.netCRM.component.LovoButton;
import com.lovo.netCRM.component.LovoDate;
import com.lovo.netCRM.component.LovoTable;
import com.lovo.sgproj.frame.MainFrame;

public class RoomEqpDialog extends JDialog {

	private LovoTable recordTab;

	private LovoDate reportDate;// 报损日期
	private JLabel descriptLab;
	private JTextArea descriptArea;

	private LovoButton addRecordBtn;
	private LovoButton processBtn;
	private LovoButton exitBtn;

	public RoomEqpDialog(MainFrame frame) {
		// TODO Auto-generated constructor stub
		super(frame, "房间设施维护", true);
		this.setBounds(350, 250, 420, 400);
		this.setLayout(null);
		this.initTable();
		this.init();
		this.initBtn();

		this.setVisible(true);
	}

	private void initTable() {
		this.recordTab = new LovoTable(this, new String[] { "损坏描述", "报损日期",
				"是否解决" }, new String[] {},// 数组中应该是对应属性的属性名
				"");// 填入唯一标示属性
		this.recordTab.setSizeAndLocation(20, 10, 360, 150);
	}

	private void init() {
		// TODO Auto-generated method stub
		this.reportDate = new LovoDate("报损日期", 80, 180, this);

		this.descriptLab = new JLabel("损坏描述");
		this.descriptLab.setBounds(80, 220, 60, 30);
		this.add(this.descriptLab);

		this.descriptArea = new JTextArea();
		JScrollPane jsp = new JScrollPane(this.descriptArea);
		jsp.setBounds(150, 220, 220, 100);
		this.add(jsp);
	}

	private void initBtn() {
		// TODO Auto-generated method stub
		this.addRecordBtn = new LovoButton("添加设施损坏记录", 10, 330, this);
		this.addRecordBtn.setSize(120, 20);

		this.processBtn = new LovoButton("处理已损坏设备", 145, 330, this);
		this.processBtn.setSize(120, 20);

		this.exitBtn = new LovoButton("退出", 280, 330, this);
		this.exitBtn.setSize(120, 20);

		this.addRecordBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				RoomEqpDialog.this.dispose();
			}
		});
		this.processBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				RoomEqpDialog.this.dispose();
			}
		});
		this.exitBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				RoomEqpDialog.this.dispose();
			}
		});
	}

}
