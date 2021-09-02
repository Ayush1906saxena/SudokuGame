import javax.swing.*;
import javax.swing.border.*;
import java.util.*;
import java.awt.*;
class Va
{
  static MButton [][]bt=new MButton[9][9];
  static int [][]num=new int[9][9];
  static int [][][]box={{{0,0},{0,1},{0,2},{1,0},{1,1},{1,2},{2,0},{2,1},{2,2}},
                        {{0,3},{0,4},{0,5},{1,3},{1,4},{1,5},{2,3},{2,4},{2,5}},
	                {{0,6},{0,7},{0,8},{1,6},{1,7},{1,8},{2,6},{2,7},{2,8}},
			{{3,0},{3,1},{3,2},{4,0},{4,1},{4,2},{5,0},{5,1},{5,2}},
			{{3,3},{3,4},{3,5},{4,3},{4,4},{4,5},{5,3},{5,4},{5,5}},
			{{3,6},{3,7},{3,8},{4,6},{4,7},{4,8},{5,6},{5,7},{5,8}},
			{{6,0},{6,1},{6,2},{7,0},{7,1},{7,2},{8,0},{8,1},{8,2}},
			{{6,3},{6,4},{6,5},{7,3},{7,4},{7,5},{8,3},{8,4},{8,5}},
			{{6,6},{6,7},{6,8},{7,6},{7,7},{7,8},{8,6},{8,7},{8,8}}};
  static Random ra=new Random();
  static int ctr=0,leveli=0,total=81,mm,ss;
  static JButton []ubt=new JButton[9];
  static Font fo=new Font("stencil",0,25);	
  static Font fo1=new Font("elephant",0,23);	
  static Font fo2=new Font("stencil",0,20);
  static Font fo3=new Font("arial",0,18);
  static String numc=null;
  static Suduko main;
  static JLabel difficulty=new JLabel("<html><h1><u>Difficulty<h1><html></u>");
  static JLabel dlevelv=new JLabel("Easy");
  static JLabel timer=new JLabel("<html><h1><u>Timer<h1><html></u>");
  static JLabel timerv=new JLabel("00:00");
  static JLabel nummsg=new JLabel("Number selected:");
  static JLabel msg=new JLabel("Select a number and click on a square");
  static JLabel numvalue=new JLabel("None");
  static Border bold=BorderFactory.createLineBorder(Color.black,1);
  static JButton prevbc;
  static Color of,ob;
  static JComboBox <String>level=new JComboBox<String>();
  static JButton newgame=new JButton("Start Game");
  static JButton undo=new JButton("Undo");
  static MButton bc;
  static boolean notdone=true;
}