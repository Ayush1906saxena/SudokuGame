import java.awt.event.*;
import javax.swing.*;
class LevelListener implements ItemListener
{
   public void itemStateChanged(ItemEvent evt)
   {
      if(evt.getStateChange()==ItemEvent.SELECTED)
      { 	
	ResetNumbers.reset();
      } 	
   }
}