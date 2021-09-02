class MButton extends javax.swing.JButton
{
  int r,c,b;
  public MButton(String str,int r,int c)
  {
	super(str);
	this.r=r;
	this.c=c;
  }
  public void setBox(int b)
  {
	this.b=b;
  }
}