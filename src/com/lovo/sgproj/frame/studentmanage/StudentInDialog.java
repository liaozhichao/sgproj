package com.lovo.sgproj.frame.studentmanage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JDialog;

import com.lovo.netCRM.component.LovoButton;
import com.lovo.netCRM.component.LovoComboBox;
import com.lovo.netCRM.component.LovoDate;
import com.lovo.netCRM.component.LovoFileChooser;
import com.lovo.netCRM.component.LovoRadioButton;
import com.lovo.netCRM.component.LovoTxt;
import com.lovo.sgproj.frame.MainFrame;

public class StudentInDialog extends JDialog {

	private LovoTxt nameTxt;

	private LovoRadioButton genderBtn;

	private LovoComboBox<String> classCmb;// 后期需要把String改为班级Bean

	private LovoComboBox<String> roomCmb;// 后期需要把String改为房间Bean

	private LovoFileChooser headPic;

	private LovoTxt stuTelTxt;

	private LovoDate stuInTime;

	private LovoButton addBtn;

	private LovoButton cancelBtn;

	public StudentInDialog(MainFrame frame) {
		super(frame, "添加学生", true);
		this.setBounds(350, 250, 500, 400);
		this.setLayout(null);
		this.init();

		this.setVisible(true);
	}

	private void init() {
		// TODO Auto-generated method stub
		this.nameTxt = new LovoTxt("姓名", 20, 40, this);
		this.genderBtn = new LovoRadioButton("性别", new String[] { "男", "女" },
				20, 120, this);

		ArrayList<String> classLst = new ArrayList<String>();
		classLst.add("J125");
		classLst.add("J126");
		classLst.add("J127");
		classLst.add("J128");
		this.classCmb = new LovoComboBox<String>(classLst, "班级", 20, 200, this);

		ArrayList<String> roomLst = new ArrayList<String>();
		roomLst.add("马家花园1号");
		roomLst.add("正黄上岭5号");
		roomLst.add("近水楼台10号");
		this.roomCmb = new LovoComboBox<String>(roomLst, "房间", 20, 260, this);

		this.headPic = new LovoFileChooser(this);
		this.headPic.setBounds(320, 20, 100, 150);

		this.stuTelTxt = new LovoTxt("联系电话", 250, 200, this);
		this.stuInTime = new LovoDate("入住时间", 250, 260, this);

		this.addBtn = new LovoButton("添加", 120, 320, this);
		this.cancelBtn = new LovoButton("取消", 270, 320, this);

		this.addBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				StudentInDialog.this.dispose();
			}
		});

		this.cancelBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				StudentInDialog.this.dispose();
			}
		});
	}

}
