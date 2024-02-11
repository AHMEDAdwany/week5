package loggerproject;

public class AsteriskLogger implements Logger {

	
		    @Override
		    public void log(String log) {
		    	System.out.println("***" + log + "***");
		    }

			@Override
			public void error(String error) {
				// TODO Auto-generated method stub
		
			String border = "**********************";
					
					System.out.println(border);
				System.out.println("***Error: " + error + "***");
				System.out.println(border);
			}

		

	}

