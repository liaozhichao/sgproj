package com.lovo.sgproj.frame.studentmanage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JLabel;

import com.lovo.netCRM.component.LovoButton;
import com.lovo.sgproj.frame.MainFrame;

public class StudentOutDialog extends JDialog {

	private JLabel infoLab;
	private LovoButton delBtn;
	private LovoButton cancelBtn;

	public StudentOutDialog(MainFrame frame) {
		super(frame, "学生退房", true);
		this.setBounds(550, 400, 300, 150);
		this.setLayout(null);
		this.init();

		this.setVisible(true);
	}

	private void init() {
		// TODO Auto-generated method stub
		this.infoLab = new JLabel("确定要退房吗？");
		this.infoLab.setBounds(100, 30, 100, 30);
		this.add(this.infoLab);

		this.delBtn = new LovoButton("确定", 50, 80, this);
		this.cancelBtn = new LovoButton("取消", 150, 80, this);

		this.delBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				StudentOutDialog.this.dispose();
			}
		});

		this.cancelBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				StudentOutDialog.this.dispose();
			}
		});
	}

}
