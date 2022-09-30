class Main
{
    public static void main(String args[])
    {
        // create objects for testing
        AverageScoreDisplay averageScoreDisplay =
                          new AverageScoreDisplay();
        CurrentScoreDisplay currentScoreDisplay =
                          new CurrentScoreDisplay();
  
        // pass the displays to Cricket data
        CricketData cricketData = new CricketData();
  
        // register display elements
        cricketData.RegisterObserver(averageScoreDisplay);
        cricketData.RegisterObserver(currentScoreDisplay);
  
        // in real app you would have some logic to
        // call this function when data changes
        cricketData.dataChanged();
  
        //remove an observer
        cricketData.RemoveObserver(averageScoreDisplay);
  
        // now only currentScoreDisplay gets the
        // notification
        cricketData.dataChanged();
    }
}
