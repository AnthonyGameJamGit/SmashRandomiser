
package smashrandomiser;



public abstract class Randomiser {
    private String[] smashers;
    private String[] selected;
    private int numSmash;
    private int ranNum;
    private int[] prevRans;
    

    protected abstract void popSmashers();
    private void makeUnique()
    {
         for (int i = 0;i< prevRans.length;i++)
        {
            if (getRanNum() == prevRans[i])
            {
                genRanNum(0,smashers.length);
                i =0;
            }
        }
    }
public void getRanChars(int amt)
{
    setSizePrevRans(amt);
    setSizeSelected(amt);
     for (int i =0;i < amt;i++)
     {
         genRanNum(0,smashers.length);
         makeUnique();
         setPrevRan(i,getRanNum());
         setSelected(i,getSmasher(getRanNum()));
     }
}
public void genRanNum(int min,int max)
{
   ranNum = min + (int)(Math.random() * ((max - min) + 1));
}
public void setSizeSmashers(int size)
{
    smashers = new String[size];
}
public void setSizeSelected(int size)
{
    selected = new String[size];
}
public void setSizePrevRans(int size)
{
    prevRans = new int[size];
}
public void setSelected(int index,String value)
{
   selected[index] = value;
}
public void setNumSmash(int numSmash)
{
    this.numSmash = numSmash;
}
public void setPrevRan(int index,int value)
{
    prevRans[index] = value;
}
public void setSmashers(int index,String value)
{
    smashers[index] = value;
}
public String getSmasher(int index)
{
    return smashers[index];
}
public int getPrevRan(int index)
{
    return prevRans[index];
}
public int getRanNum()
{
    return ranNum;
}
public int getNumSmash()
{
    return numSmash;
}
public String getSelected(int pos)
{
    return selected[pos];
}
}

