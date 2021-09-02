import javax.swing.*;
import java.awt.*;
class TimerThread extends Thread
{
    public void run()
    {
	Va.notdone=true;
	while(Va.notdone)
	{
	  Va.ss++;
	  if(Va.ss==60)
	  {
		Va.mm++;
		Va.ss=0;
	  }
	  Va.timerv.setText((Va.mm<10?"0"+Va.mm:Va.mm)+":"+(Va.ss<10?"0"+Va.ss:Va.ss));			
	  try{
	     Thread.sleep(1000);
	  }catch(Exception ex){}
	
	}
    }
}