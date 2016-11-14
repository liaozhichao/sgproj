package com.lovo.sgproj.frame.roommanage;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.lovo.netCRM.component.LovoButton;
import com.lovo.netCRM.component.LovoComboBox;
import com.lovo.netCRM.component.LovoTable;
import com.lovo.netCRM.component.LovoTxt;
import com.lovo.sgproj.frame.MainFrame;

public class RoomManagePanel extends JPanel {

	private MainFrame frame;

	private LovoTable roomTab;

	private LovoButton addRoomBtn;
	private LovoButton delRoomBtn;
	private LovoButton roomInfoBtn;
	private LovoButton roomEqpBtn;

	private JPanel queryPanel;
	private JLabel roomAddressLab;
	private JTextField roomAddressTxt;
	private LovoComboBox<String> roomStatCmb;
	private LovoComboBox<String> liveableCmb;
	private LovoComboBox<String> roomTypeCmb;
	private JButton queryBtn;

	public RoomManagePanel(MainFrame frame) {
		this.frame = frame;
		this.setBackground(Color.WHITE);
		this.setLayout(null);
		this.initTable();
		this.initBtn();
		this.initQueryPanel();
	}

	private void initTable() {
		// TODO Auto-generated method stub
		this.roomTab = new LovoTable(this, new String[] { "房间地址", "可容纳人数",
				"已住人数", "房租", "房间状态", "房东", "房东电话", "房间类型" }, new String[] {},// 数组中应该是对应属性的属性名
				"");// 填入唯一标示属性
		this.roomTab.setSizeAndLocation(0, 0, 800, 300);
	}

	private void initBtn() {
		// TODO Auto-generated method stub
		this.addRoomBtn = new LovoButton("添加房间", 15, 380, this);
		this.delRoomBtn = new LovoButton("删除房间", 160, 380, this);
		this.roomInfoBtn = new LovoButton("查看房间信息", 15, 450, this);
		this.roomEqpBtn = new LovoButton("查看房间设施", 160, 450, this);

		this.addRoomBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new RoomAddDialog(RoomManagePanel.this.frame);
			}
		});

		this.delRoomBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new RoomDelDialog(RoomManagePanel.this.frame);
			}
		});

		this.roomInfoBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new RoomInfoDialog(RoomManagePanel.this.frame);
			}
		});

		this.roomEqpBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new RoomEqpDialog(RoomManagePanel.this.frame);
			}
		});
	}

	private void initQueryPanel() {
		// TODO Auto-generated method stub
		this.queryPanel = new JPanel();
		this.queryPanel.setBorder(BorderFactory.createTitledBorder("查询房间信息"));
		this.queryPanel.setBackground(Color.WHITE);
		this.queryPanel.setLayout(null);
		this.queryPanel.setBounds(300, 310, 480, 180);
		this.add(this.queryPanel);

		this.roomAddressLab = new JLabel("房间地址");
		this.roomAddressLab.setBounds(20, 20, 60, 20);
		this.queryPanel.add(this.roomAddressLab);
		this.roomAddressTxt = new JTextField();
		this.roomAddressTxt.setBounds(100, 20, 120, 20);
		this.queryPanel.add(this.roomAddressTxt);

		ArrayList<String> statLst = new ArrayList<String>();
		statLst.add("不限");
		statLst.add("正常");
		statLst.add("损坏");
		this.roomStatCmb = new LovoComboBox<String>(statLst, "房间状态", 260, 20,
				this.queryPanel);

		ArrayList<String> liveLst = new ArrayList<String>();
		liveLst.add("不限");
		liveLst.add("可住房间");
		this.roomStatCmb = new LovoComboBox<String>(liveLst, "可住房间", 20, 80,
				this.queryPanel);

		ArrayList<String> typeLst = new ArrayList<String>();
		typeLst.add("不限");
		typeLst.add("男生寝室");
		typeLst.add("女生寝室");
		this.roomTypeCmb = new LovoComboBox<String>(typeLst, "房间类型", 260, 80,
				this.queryPanel);

		this.queryBtn = new JButton("查找");
		this.queryBtn.setBounds(220, 130, 80, 20);
		this.queryPanel.add(this.queryBtn);
	}

}
