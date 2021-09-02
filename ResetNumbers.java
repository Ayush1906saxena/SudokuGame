import java.awt.*;
class ResetNumbers
{
  static void reset()
  {
	Va.leveli=Va.level.getSelectedIndex();
	Va.msg.setText("Select a number and click on a square");
	Numbers.genNos();
        Va.total=81;
	Va.dlevelv.setText(Va.level.getSelectedItem().toString());
	Va.mm=Va.ss=0;
	for(int i=0;i<9;i++)
	{
	  for(int j=0;j<9;j++)
	  {
	    Va.bt[i][j].setText(String.valueOf(Va.num[i][j]));
	    Va.bt[i][j].setForeground(Color.black);
	    Va.bt[i][j].setBorder(Va.bold);
	    int n=Va.ra.nextInt(Va.leveli+3);
	    int x=Va.ra.nextInt(7);
	    if(Va.leveli==0 && x>2)
	     n=0;
	    if(Va.leveli==1 && x>3)
	     n=0;
	    if(Va.leveli==2 && x>4)
	     n=0;
	    if(n>0)
	    {
	      Va.total--;
	      Va.bt[i][j].setText("");
	      Va.num[i][j]=0;
	    }
          }
        }
	if(!Va.notdone)
	 new TimerThread().start();
  }
} 