import java.util.ArrayList;
import java.util.Iterator;


public class CricketData implements Subject {

    int runs;
    int wickets;
    float overs;

    ArrayList<Observer> observerList;

    public CricketData(){
        observerList = new ArrayList<Observer>();
    }

    @Override
    public void RegisterObserver(Observer observer){
        observerList.add(observer);
    }
    @Override
    public void RemoveObserver(Observer observer){
        observerList.remove(observer);
    }
    @Override
    public void NotifyObservers(){
        for (Iterator<Observer> it =
            observerList.iterator(); it.hasNext();){
            Observer o = it.next();
            o.Update(runs, wickets, overs);
        }
    }

    private int getLatestRuns()
    {
        
        return 90;
    }
  
    
    private int getLatestWickets()
    {
        
        return 2;
    }
    private float getLatestOvers()
    {
        return (float)10.2;
    }
  
    public void dataChanged()
    {
        runs = getLatestRuns();
        wickets = getLatestWickets();
        overs = getLatestOvers();
  
        NotifyObservers();
    }
}
