import java.awt.event.*;
class NewGameListener implements ActionListener
{
    public void actionPerformed(ActionEvent evt)
    {
	if(Va.newgame.getText().equals("Start Game"))
	{
	  for(int i=0;i<9;i++)
    	  {
	     Va.ubt[i].setEnabled(true);
	  } 
	  new TimerThread().start();
	  Va.newgame.setText("New Game");
	  return;
	}
	ResetNumbers.reset(); 
    }
}