package ScreenRecod;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import javax.swing.*;


public class test extends JFrame implements ActionListener,MouseListener{
 
	JButton browseBtn,exit,browseBtn1 ;
	/**
	 * @param args
	 */

	// command constants
	public final static String BROWSE_CMD = "��ʼ¼��";
	public final static String BROWSE_CMD1 = "�����ļ�";
	public test() {
		JLayeredPane l=getLayeredPane();
		//JFrame JF = new JFrame("");
		//JF.setLocation(200,200);
		 //setUndecorated(true);
		browseBtn = new JButton("��ʼ¼��");
		browseBtn1 = new JButton("�����ļ�");
		//browseBtn.setFont(new Font("����", Font.PLAIN, 18));
		//browseBtn.setBorderPainted(false);//���ޱ߿�
		browseBtn.setContentAreaFilled(false);//͸������
		browseBtn.setBounds(50,20,100,30);
		browseBtn1.setContentAreaFilled(false);//͸������
		browseBtn1.setBounds(50,60,100,30);
		//browseBtn.setFont( new Font("�����п�", Font.BOLD, 18));
		browseBtn.addActionListener(this);
		browseBtn1.addActionListener(this);
		exit = new JButton("�˳�");
		//exit.setFont( new Font("�����п�", Font.BOLD, 15));
		//exit.setBorderPainted(false);//���ޱ߿�
		exit.setContentAreaFilled(false);//͸������
		exit.setBounds(50,100,100,30);
		exit.addMouseListener(this);
		// buttons
		
		
		// setup listener...
		
	
		
		l.add(browseBtn, new Integer(10));//�����Ĭ�ϸ���λ��
		l.add(browseBtn1, new Integer(10));//�����Ĭ�ϸ���λ��
		l.add(exit, new Integer(10));//�����Ĭ�ϸ���λ��
		//JF.setLayout(new FlowLayout());
		
		this.setTitle("java¼�Ƴ���");
		this.setSize(200,200);//���ڴ�С
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new test();
	}
	public void actionPerformed(ActionEvent e) {
		if(BROWSE_CMD.equals(e.getActionCommand())) {
			JFileChooser jfc=new JFileChooser();
			jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY );
	        jfc.showDialog(new JLabel(), "ѡ��");
	        File f=jfc.getSelectedFile();
	        
			//JFileChooser chooser = new JFileChooser();
			//chooser.setAcceptAllFileFilterUsed(false);
			//chooser.showOpenDialog(null);
			/*ʹ��showOpenDialog()��������ʾ����ѡ���ļ��Ĵ��ڣ���ѡ����ĳ���ļ��󣬻��߹رմ˴�����ô���᷵��һ��
                                          ������ֵ��������ص���0�������Ѿ�ѡ����ĳ���ļ����������1����ѡ����ȡ����ť����ֱ�ӹر��˴���*/
			//File f = chooser.getSelectedFile();//���·��
			if(f == null) return;
			this.setVisible(false);
			new MainFrame(f);
		}
		if(BROWSE_CMD1.equals(e.getActionCommand())) {
			JFileChooser jfc=new JFileChooser();
			jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
	        jfc.showDialog(new JLabel(), "����");
	        File f=jfc.getSelectedFile();
	        
			//JFileChooser chooser = new JFileChooser();
			//chooser.setAcceptAllFileFilterUsed(false);
			//chooser.showOpenDialog(null);
			/*ʹ��showOpenDialog()��������ʾ����ѡ���ļ��Ĵ��ڣ���ѡ����ĳ���ļ��󣬻��߹رմ˴�����ô���᷵��һ��
                                          ������ֵ��������ص���0�������Ѿ�ѡ����ĳ���ļ����������1����ѡ����ȡ����ť����ֱ�ӹر��˴���*/
			//File f = chooser.getSelectedFile();//���·��
			if(f == null) return;
			this.setVisible(false);
			//System.out.println(f.getPath());
			new MainFrame(f);
		}
		
	}
	public void mouseClicked(MouseEvent e) {
		
		if (e.getSource()==exit) {
			System.exit(0);
		}
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
		

}
 