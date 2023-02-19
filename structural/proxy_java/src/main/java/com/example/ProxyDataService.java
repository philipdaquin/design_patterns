package com.example;


/*
    3.  The ProxyDataService class that also implements the Dataservice interface
        The proxy class has a reference tot he RealDataService object, and it handles the interaction 
        with the RealDataService object on behalf of the client
    
    It can also do some additional processing or logging before and after calling the processData method 
    of the RealDataService Object

    Doing this, reduces the number of requests that the RealDataService object needs to handle, 
    and it allows for additional functionality to be added to the processong of the data 

*/  
public class ProxyDataService implements Dataservice {

    private RealDataService realDataService;

    @Override
    public void processData() {
        // TODO Auto-generated method stub

        // Check if the dataservice has already been initialised 
        // Else it creates a new one 
        if (realDataService == null) realDataService = new RealDataService();

        
        realDataService.processData();

    }
    
}
