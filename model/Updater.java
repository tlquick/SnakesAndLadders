package model;

import java.util.*;

public class Updater 
{   
    private LinkedList<MyObserver> views = new LinkedList<MyObserver>();
    
    public void attach(MyObserver o)
    {   
        if (views == null)
            views = new LinkedList<MyObserver>();
        views.add(o);   
    } 
    public void detach(MyObserver o)
    {   
        views.remove(o);   
    }             
    public void updateViews()
    {   
        if(views != null)
        {
            Iterator<MyObserver> it = views.iterator();
            while (it.hasNext())
                it.next().update();
        }
    }
}
