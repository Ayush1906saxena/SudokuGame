import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.awt.*;
class NumberListener implements ActionListener
{
    Border bred=BorderFactory.createLineBorder(Color.red,2);
    public void actionPerformed(ActionEvent evt)
    {
	JButton bc=(JButton)evt.getSource();
	Va.numc=bc.getText();
	Va.msg.setText("<html><p style='font-size:25'><b>You have selected:"+Va.numc+"<b></p></html>");
	bc.setForeground(Color.white);
	bc.setBackground(new Color(125,125,255));
  	Va.undo.setEnabled(false);
	if(Va.prevbc!=null)
	{
	  Va.prevbc.setBackground(Va.ob);
	  Va.prevbc.setForeground(Va.of);
	}
	Va.prevbc=bc;
	highlightNumbers();	
    }
    void highlightNumbers()
    {
	for(int i=0;i<9;i++)
	{
	  for(int j=0;j<9;j++)
	  {
	        Va.bt[i][j].setBorder(Va.bold);
		if(Va.num[i][j]==Integer.parseInt(Va.numc))
		  Va.bt[i][j].setBorder(bred);
	  }
	}
    }
}