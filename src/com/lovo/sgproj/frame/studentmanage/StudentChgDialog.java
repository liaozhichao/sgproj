package com.lovo.sgproj.frame.studentmanage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JDialog;

import com.lovo.netCRM.component.LovoButton;
import com.lovo.netCRM.component.LovoComboBox;
import com.lovo.netCRM.component.LovoLabel;
import com.lovo.sgproj.frame.MainFrame;

public class StudentChgDialog extends JDialog {
	
	private LovoLabel nameLab;
	private LovoLabel genderLab;
	private LovoLabel classLab;
	private LovoLabel oldRoomLab;
	private LovoComboBox<String> newRoomCmb;//后期换做房间Bean
	
	private LovoButton chgBtn;
	private LovoButton cancelBtn;
	
	
	public StudentChgDialog(MainFrame frame){
		super(frame, "学生换房", true);
		this.setBounds(450, 350, 450, 280);
		this.setLayout(null);
		this.init();

		this.setVisible(true);
	}

	private void init() {
		// TODO Auto-generated method stub
		this.nameLab = new LovoLabel("姓名", "孙军", 20, 20, this);
		this.genderLab = new LovoLabel("性别", "男", 220, 20, this);
		this.classLab = new LovoLabel("班级", "J126", 20, 80, this);
		this.oldRoomLab = new LovoLabel("原房间", "美洲花园10号", 220, 80, this);
		
		ArrayList<String> roomLst = new ArrayList<String>();
		roomLst.add("马家花园1号");
		roomLst.add("正黄上岭5号");
		roomLst.add("近水楼台10号");
		this.newRoomCmb = new LovoComboBox<String>(roomLst, "房间", 20, 140, this);
		
		
		this.chgBtn = new LovoButton("确定", 120, 200, this);
		this.cancelBtn = new LovoButton("取消", 270, 200, this);
		this.chgBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				StudentChgDialog.this.dispose();
			}
		});

		this.cancelBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				StudentChgDialog.this.dispose();
			}
		});
		
	}
}
