class Numbers
{
  static void genNos()
  {
      int ctr=0;
      resetNum();	
      for(int i=0;i<9;i++)
      {	
	for(int j=0;j<9;j++)
	{
	    int []x=Va.box[i][j];	
	    int c=x[0];
	    int d=x[1];
	    do
	    { 
 	      int n=Va.ra.nextInt(9)+1;
	      if(inBox(n,i) || inCol(n,c,d) || inRow(n,c,d))
	      {
	        ctr++;
	        if(ctr>=1000)
	        {
		  i=ctr=0;
		  j=-1;
		  resetNum();
		  break;
                }  
	        continue;
	      }
	      ctr=0;
	      Va.num[c][d]=n;
	      break;
	    }while(true); 
	}
      }
  }
  static void resetNum()
  {
	for(int i=0;i<9;i++)
	  for(int j=0;j<9;j++)
	    Va.num[i][j]=0;
  }
  static boolean inBox(int n,int i)
  {
	for(int c=0;c<9;c++)
	{
	  int []x=Va.box[i][c];
	  if(Va.num[x[0]][x[1]]==n)
	    return true;
	}
	return false;
  }
  static boolean inRow(int n,int i,int j)
  {
	for(int c=j+1;c<9;c++)
	{
	 if(Va.num[i][c]==n) 
	   return true; 
	}
	for(int c=j-1;c>=0;c--)
	{
	 if(Va.num[i][c]==n) 
	   return true; 
	}
	return false;
  }
  static boolean inCol(int n,int i,int j)
  {
	for(int c=i+1;c<9;c++)
	{
	 if(Va.num[c][j]==n) 
	   return true;
	}
	for(int c=i-1;c>=0;c--)
	{
	 if(Va.num[c][j]==n) 
	   return true;
	}
	return false;
  }
}