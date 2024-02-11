package loggerproject;


public class SpacedLogger implements Logger{
	
	
    public void log(String log) {
       char[] chars = log.toCharArray();
      for (int i = 0; i < chars.length; i++) {
         System.out.print(chars[i] + " ");
    }
	}

    @Override
    public void error(String error) {
    	
    	char[] chars = error.toCharArray();
    	System.out.println("\n" + "ERROR:");
	      for (int i = 0; i < chars.length; i++) {
	         System.out.print(chars[i] + " ");
	    }
	  }
  


}