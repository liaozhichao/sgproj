package com.lovo.sgproj.frame.roommanage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;

import com.lovo.netCRM.component.LovoButton;
import com.lovo.netCRM.component.LovoComboBox;
import com.lovo.netCRM.component.LovoDate;
import com.lovo.netCRM.component.LovoLabel;
import com.lovo.netCRM.component.LovoTable;
import com.lovo.netCRM.component.LovoTxt;
import com.lovo.sgproj.frame.MainFrame;

public class RoomInfoDialog extends JDialog {
	
	private LovoLabel roomAddressLab;
	private LovoLabel buildingTypeLab;//户型	
	private LovoLabel capNumLab;//可容纳人数
	private LovoLabel inNumLab;//已住人数	
	private LovoLabel rentPriceLab;
	private LovoLabel payTypeLab;
	private LovoLabel roomHostLab;//房东
	private LovoLabel hostTelLab;
	private LovoLabel roomStatusLab;//房间状态
	private LovoLabel roomTypeComb;
	private LovoLabel rentDateLab;
	
	private LovoTable stuTab;
	
	private LovoButton confirmBtn;
	
	
	public RoomInfoDialog(MainFrame frame) {
		// TODO Auto-generated constructor stub
		super(frame,"添加房间",true);
		this.setBounds(350, 220, 520, 450);
		this.setLayout(null);
		this.init();
		this.initTable();
		
		this.setVisible(true);
	}

	private void init() {
		// TODO Auto-generated method stub
		this.roomAddressLab = new LovoLabel("房间地址", "新南路10号",20, 20, this);
		this.buildingTypeLab = new LovoLabel("房间户型", "3室2厅",270, 20, this);		
		this.capNumLab = new LovoLabel("可容纳人数", "10",20, 60, this);
		this.inNumLab = new LovoLabel("已住人数", "6",270, 60, this);
		this.rentPriceLab = new LovoLabel("房租", "1600/月",20, 100, this);
		this.payTypeLab = new LovoLabel("支付方式", "季付",270, 100, this);
		this.roomStatusLab = new LovoLabel("房间状态", "正常",20, 140, this);
		this.roomTypeComb = new LovoLabel("房间类型", "男生寝室",270, 140, this);
		this.rentDateLab = new LovoLabel("租房日期", "2012-1-12",20, 180, this);
		
		this.confirmBtn = new LovoButton("确定", 220, 390, this);
		this.confirmBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				RoomInfoDialog.this.dispose();
			}
		});
	}
	
	private void initTable() {
		// TODO Auto-generated method stub
		this.stuTab = new LovoTable(this, new String[]{"学生姓名","所在班级","联系电话"},
				new String[]{},//数组中应该是对应属性的属性名 
				"");//填入唯一标示属性
		this.stuTab.setSizeAndLocation(20, 220, 480, 150);
	}
}
