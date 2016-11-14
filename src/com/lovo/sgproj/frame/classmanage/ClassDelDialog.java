package com.lovo.sgproj.frame.classmanage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JLabel;

import com.lovo.netCRM.component.LovoButton;
import com.lovo.sgproj.frame.MainFrame;
import com.lovo.sgproj.frame.studentmanage.StudentOutDialog;

public class ClassDelDialog extends JDialog {
	
	private JLabel infoLab;
	private LovoButton comfirmBtn;
	
	public ClassDelDialog(MainFrame frame) {
		super(frame, "删除班级", true);
		this.setBounds(550, 400, 300, 150);
		this.setLayout(null);
		this.init();

		this.setVisible(true);
	}

	private void init() {
		// TODO Auto-generated method stub
		this.infoLab = new JLabel("该班级还有学生，不能删除！");
		this.infoLab.setBounds(50, 30, 200, 30);
		this.add(this.infoLab);
		
		this.comfirmBtn = new LovoButton("确定", 100, 80, this);

		this.comfirmBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				ClassDelDialog.this.dispose();
			}
		});
	}
	
}
