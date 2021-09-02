import java.awt.event.*;
class UndoListener implements ActionListener
{
    public void actionPerformed(ActionEvent evt)
    {
	if(Va.bc!=null)
	{
	  Va.total++;
	  Va.num[Va.bc.r][Va.bc.c]=0;
	  Va.bc.setText("");
	  Va.numc=null;
  	  Va.undo.setEnabled(false);
	}
    }
}