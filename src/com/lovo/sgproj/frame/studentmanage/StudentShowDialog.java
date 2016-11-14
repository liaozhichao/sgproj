package com.lovo.sgproj.frame.studentmanage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;

import com.lovo.netCRM.component.LovoButton;
import com.lovo.netCRM.component.LovoLabel;
import com.lovo.sgproj.frame.MainFrame;

public class StudentShowDialog extends JDialog {
	
	private LovoLabel nameLab;
	private LovoLabel genderLab;
	private LovoLabel classLab;
	private LovoLabel roomLab;
	private JLabel headPicLab;
	private LovoLabel stuTelLab;
	private LovoLabel stuInTimeLab;
	
	private LovoButton okBtn;
	
	public StudentShowDialog(MainFrame frame) {
		// TODO Auto-generated constructor stub
		super(frame, "添加学生", true);
		this.setBounds(350, 250, 500, 400);
		this.setLayout(null);
		this.init();

		this.setVisible(true);
	}

	private void init() {
		// TODO Auto-generated method stub
		this.nameLab = new LovoLabel("姓名","孙军", 20, 40, this);
		this.genderLab = new LovoLabel("性别", "男",20, 120, this);
		this.classLab = new LovoLabel("班级", "J126",20, 200, this);
		this.roomLab = new LovoLabel("房间","新南路10号", 20, 260, this);
		
		this.headPicLab = new JLabel(new ImageIcon("image/defaultHead.JPG"));
		this.headPicLab.setBounds(300, 40, 73, 106);
		this.add(this.headPicLab);
		
		this.stuTelLab = new LovoLabel("联系电话", "13982172351",250, 200, this);
		this.stuInTimeLab = new LovoLabel("入住时间", "2016-7-1",250, 260, this);
		
		this.okBtn = new LovoButton("确定", 180, 320, this);
		this.okBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				StudentShowDialog.this.dispose();
			}
		});
	}
	
}
