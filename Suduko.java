import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.applet.*;
public class Suduko extends JFrame
{
  JPanel board=new JPanel();
  JPanel userp=new JPanel();
  JPanel levelp=new JPanel();
  JPanel msgp=new JPanel();
  JPanel insp=new JPanel();
  JPanel []pa=new JPanel[9];
  GridLayout gl=new GridLayout(3,3);
  AudioClip clip2=Applet.newAudioClip(getClass().getResource("sounds/s4.wav"));
  ImageIcon sud=new ImageIcon(getClass().getResource("images/s4.jpg"));
  public Suduko()
  {
	super("Suduko");
  	Va.main=this;
	setSize(700,700);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLocationRelativeTo(null);
	setResizable(false);
	setLayout(null);
	getContentPane().setBackground(new Color(200,255,200));
	board.setBounds(150,30,400,400);
	add(board);
	board.setBorder(BorderFactory.createLineBorder(Color.blue,3));
	board.setLayout(gl);
	userp.setBounds(150,500,400,45);
	add(userp);
	addUserBt();
	addPanels();
   	addIns();
	addLevel();
	setVisible(true);
  }
  void addPanels()
  {
     Border pab=BorderFactory.createLineBorder(Color.blue,1);
     for(int i=0;i<9;i++)
     {
	pa[i]=new JPanel();
	pa[i].setBorder(pab);
	pa[i].setLayout(gl);
	board.add(pa[i]);
     }  
     addButtons();		
  }
  void addButtons()
  {	
    Numbers.genNos(); 	
    PlaceListener listener=new PlaceListener();
    for(int i=0;i<9;i++)
    {
	for(int j=0;j<9;j++)
	{
	  Va.bt[i][j]=new MButton(String.valueOf(Va.num[i][j]),i,j);
	  int n=Va.ra.nextInt(2);
	  int x=Va.ra.nextInt(7);
	  if(Va.leveli==0 && x>2)
	     n=0;
	  if(n!=0)
	  {
	   Va.total--;
	   Va.bt[i][j].setText("");
	   Va.num[i][j]=0;
	  }
	  Va.bt[i][j].setFont(Va.fo);
	  Va.bt[i][j].setBorder(Va.bold);
	  Va.bt[i][j].addActionListener(listener);
	}
    }
    for(int i=0;i<9;i++)
    {
      for(int j=0;j<9;j++)
      {	
         int []x=Va.box[i][j];
         pa[i].add(Va.bt[x[0]][x[1]]);
	 Va.bt[x[0]][x[1]].setBox(i);
	 if(i%2==0)
	   Va.bt[x[0]][x[1]].setBackground(Color.white);
	 else
	   Va.bt[x[0]][x[1]].setBackground(Color.lightGray);
      }
    }
  }
  void addUserBt()
  {
    userp.setLayout(new GridLayout()); 
    NumberListener listener=new NumberListener();
    Insets ins=new Insets(0,0,0,0);
    Border bb=BorderFactory.createLineBorder(Color.black,1,true);
    for(int i=0;i<9;i++)
    {
	Va.ubt[i]=new JButton(String.valueOf(i+1));
	Va.ubt[i].setFont(Va.fo1);
	Va.ubt[i].setMargin(ins);
	Va.ubt[i].setBorder(bb);
	Va.ubt[i].addActionListener(listener);
	Va.ubt[i].setEnabled(false);
	userp.add(Va.ubt[i]);
    } 
    Va.of=Va.ubt[0].getForeground();
    Va.ob=Va.ubt[0].getBackground();  	
  }
  void addIns()
  {
	msgp.setBounds(150,450,400,35);
	msgp.setBackground(Color.white);
	add(msgp);
	Va.msg.setFont(new Font("arial",0,20));
	Va.msg.setForeground(new Color(0,0,200));
	msgp.add(Va.msg);
	JLabel ins=new JLabel("<html><h3 style='color:#FF00AA'>A sudoku puzzle has 9 columns, 9 rows and 9 boxes of 3x3 squares. To solve a puzzle, you should fill in the table so that the numbers from 1 to 9 will be in each column, each row and each 3x3 box only once. Every sudoku puzzle can have only one correct solution.</h3></html>");
	ins.setBounds(30,600,650,60);
	add(ins);
	JLabel img1=new JLabel(sud);
	img1.setBounds(30,100,100,300);
	add(img1);
	JLabel img2=new JLabel(sud);
	img2.setBounds(570,100,100,300);
	add(img2);
	Va.difficulty.setBounds(30,20,110,30);
	add(Va.difficulty);
	Va.dlevelv.setBounds(30,60,110,30);
	Va.dlevelv.setFont(Va.fo1);
	Va.dlevelv.setForeground(Color.blue);
	add(Va.dlevelv);
	Va.timer.setBounds(575,20,100,30);
	add(Va.timer);
	Va.timerv.setBounds(575,60,110,30);
	Va.timerv.setFont(Va.fo1);
	Va.timerv.setForeground(Color.blue);
	add(Va.timerv);
  }
  void addLevel()
  {
	levelp.setBounds(150,560,400,35);
	levelp.setLayout(new FlowLayout(FlowLayout.CENTER,30,0));
	add(levelp);
	String []str={"Easy","Medium","Hard"};
	for(int i=0;i<3;i++)
	{
	  Va.level.addItem(str[i]);
	}	
	Va.level.setFont(Va.fo2);
	Va.level.setForeground(Color.blue);
	Va.level.addItemListener(new LevelListener());
	levelp.add(Va.level);
	Va.newgame.addActionListener(new NewGameListener());
	Va.newgame.setFont(Va.fo3);
	levelp.add(Va.newgame);
	Va.undo.addActionListener(new UndoListener());
	Va.undo.setFont(Va.fo3);
	Va.undo.setEnabled(false);
	levelp.add(Va.undo);

  }
  public static void main(String []args)
  {
	setDefaultLookAndFeelDecorated(true);
	new Suduko();
  }
}

