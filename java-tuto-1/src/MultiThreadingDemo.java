//Java code for thread creation by extending 
//the Thread class 
class MultithreadingDemo extends Thread 
{ 
 public void run() 
 { 
     try
     { 
         // Displaying the thread that is running 
    	 for (int i = 0; i <= 10; i++ ) {
    		 System.out.println ("Thread " + 
    				 Thread.currentThread().getId() + 
    				 " is running");
    		 Thread.sleep(1000);
    	 }

     } 
     catch (Exception e) 
     { 
         // Throwing an exception 
         System.out.println ("Exception is caught"); 
     } 
 } 
} 

