package com.lovo.sgproj.frame.roommanage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JDialog;

import com.lovo.netCRM.component.LovoButton;
import com.lovo.netCRM.component.LovoComboBox;
import com.lovo.netCRM.component.LovoDate;
import com.lovo.netCRM.component.LovoTxt;
import com.lovo.sgproj.frame.MainFrame;
import com.lovo.sgproj.frame.studentmanage.StudentInDialog;

public class RoomAddDialog extends JDialog {
	
	private LovoTxt roomAddressTxt;
	private LovoTxt buildingTypeTxt;//户型
	private LovoTxt capNumTxt;//可容纳人数
	private LovoComboBox<String> roomTypeComb;
	private LovoTxt rentPriceTxt;
	private LovoTxt payTypeTxt;
	private LovoTxt roomHostTxt;//房东
	private LovoTxt hostTelTxt;
	private LovoComboBox<String> roomStatusCmb;//房间状态
	private LovoDate rentDate;
	
	private LovoButton addBtn;
	private LovoButton cancelBtn;
	
	
	public RoomAddDialog(MainFrame frame) {
		// TODO Auto-generated constructor stub
		super(frame,"添加房间",true);
		this.setBounds(350, 250, 520, 400);
		this.setLayout(null);
		this.init();

		this.setVisible(true);
	}

	private void init() {
		// TODO Auto-generated method stub
		this.roomAddressTxt = new LovoTxt("房间地址", 20, 20, this);
		this.buildingTypeTxt = new LovoTxt("房间户型", 270, 20, this);
		this.capNumTxt = new LovoTxt("可容纳人数", 20, 80, this);
		
		ArrayList<String> roomTypeLst = new ArrayList<String>();
		roomTypeLst.add("男生寝室");
		roomTypeLst.add("女生寝室");
		this.roomTypeComb = new LovoComboBox<String>(roomTypeLst, "房间类型", 270, 80, this);
		
		this.rentPriceTxt = new LovoTxt("房租", 20, 140, this);
		this.payTypeTxt = new LovoTxt("支付方式", 270, 140, this);
		this.roomHostTxt = new LovoTxt("房东", 20, 200, this);
		this.hostTelTxt = new LovoTxt("房东电话", 270, 200, this);
		
		ArrayList<String> roomStatusLst = new ArrayList<String>();
		roomStatusLst.add("正常");
		roomStatusLst.add("设施损坏");
		this.roomStatusCmb = new LovoComboBox<String>(roomStatusLst, "房间状态", 20, 260, this);
		
		this.rentDate = new LovoDate("租房日期", 270, 260, this);
		
		this.addBtn = new LovoButton("添加", 120, 320, this);
		this.cancelBtn = new LovoButton("取消", 270, 320, this);
		this.addBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				RoomAddDialog.this.dispose();
			}
		});

		this.cancelBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				RoomAddDialog.this.dispose();
			}
		});
		
	}
	
}
