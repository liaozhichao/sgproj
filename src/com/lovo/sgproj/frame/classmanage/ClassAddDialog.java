package com.lovo.sgproj.frame.classmanage;

import javax.swing.JDialog;

import com.lovo.netCRM.component.LovoButton;
import com.lovo.netCRM.component.LovoDate;
import com.lovo.netCRM.component.LovoTxt;
import com.lovo.sgproj.frame.MainFrame;

public class ClassAddDialog extends JDialog {
	
	private LovoTxt classTxt;
	private LovoTxt teacherTxt;
	private LovoDate classOpenTime;
	private LovoButton addBtn;
	private LovoButton cancelBtn;
	
	public ClassAddDialog(MainFrame frame){
		super(frame, "学生换房", true);
		this.setBounds(550, 300, 300, 280);
		this.setLayout(null);
		this.init();

		this.setVisible(true);
	}

	private void init() {
		// TODO Auto-generated method stub
		this.classTxt = new LovoTxt("开班时间", 20, 20, this);
		this.teacherTxt = new LovoTxt("带班老师", 20, 80, this);
		this.classOpenTime = new LovoDate("开班时间", 20, 140, this);
		this.addBtn = new LovoButton("添加", 40, 200, this);
		this.cancelBtn = new LovoButton("取消", 150, 200, this);
	}
	
}
