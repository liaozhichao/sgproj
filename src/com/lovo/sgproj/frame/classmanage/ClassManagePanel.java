package com.lovo.sgproj.frame.classmanage;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import com.lovo.netCRM.component.LovoButton;
import com.lovo.netCRM.component.LovoTable;
import com.lovo.sgproj.frame.MainFrame;

public class ClassManagePanel extends JPanel {
	private MainFrame frame;
	
	private LovoTable classTab;
	
	private LovoButton classInBtn;
	private LovoButton classOutBtn;
	
	public ClassManagePanel(MainFrame frame){
		this.frame = frame;
		this.setBackground(Color.WHITE);
		this.setLayout(null);
		this.initTable();
		this.initBtn();
	}

	private void initTable() {
		// TODO Auto-generated method stub
		this.classTab = new LovoTable(this, new String[]{"班级名称","开班时间","带班老师"},
				new String[]{},//数组中应该是对应属性的属性名 
				"");//填入唯一标示属性
		this.classTab.setSizeAndLocation(20, 0, 750, 300);
	}

	private void initBtn() {
		// TODO Auto-generated method stub
		this.classInBtn = new LovoButton("添加班级", 220, 380, this);
		this.classOutBtn = new LovoButton("删除班级", 450, 380, this);
		
		this.classInBtn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new ClassAddDialog(frame);
			}
		});
		
		this.classOutBtn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new ClassDelDialog(frame);
			}
		});
	}
	
}
