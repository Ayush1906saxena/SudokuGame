import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class PlaceListener implements ActionListener
{
    
    int num;
    public void actionPerformed(ActionEvent evt)
    {
	Va.bc=(MButton)evt.getSource();
	String txt=Va.bc.getText();
	if(Va.numc==null || !txt.equals("") || checkDuplicacy())
	{
		Va.main.clip2.play();
		return;
	}
	Va.bc.setText(Va.numc);
	Va.total++;
	Va.num[Va.bc.r][Va.bc.c]=num;
	Va.numc=null;
	Va.bc.setForeground(Color.red);
	Va.msg.setText("Select a number and click on a square");
	Va.prevbc.setBackground(Va.ob);
	Va.prevbc.setForeground(Va.of);
	Va.undo.setEnabled(true);
	if(Va.total==81)
	{
	  Va.notdone=false;
	  Va.msg.setText("Congratulations!!! you did it");
	  Va.undo.setEnabled(false);
	}
	dehighlightNumbers();
    }
    void dehighlightNumbers()
    {
	for(int i=0;i<9;i++)
	{
	  for(int j=0;j<9;j++)
	  {
	        Va.bt[i][j].setBorder(Va.bold);
	  }
	}
    }
    boolean checkDuplicacy()
    {
  	num=Integer.parseInt(Va.numc);
	if(Numbers.inBox(num,Va.bc.b) || Numbers.inRow(num,Va.bc.r,Va.bc.c)||Numbers.inCol(num,Va.bc.r,Va.bc.c))
	 return true;
	return false;
    }
}