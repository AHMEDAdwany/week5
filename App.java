package loggerproject;


public class App {

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		  
		// Instantiating Logger instances
        Logger logger = new AsteriskLogger();
        logger.log("hola"); 
        
       
        logger.error("Hope all is good");
   
         
        
        Logger logger2  = new SpacedLogger();

   
      logger2.log("Spaced");
      logger2.error("heelllo");
      
        
        	
}

 }
