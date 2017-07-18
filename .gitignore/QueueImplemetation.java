package com.devPractice.queueDataStructure;
 
public class QueueImplemetation {
     
private int[] queue ;

private int queueSize;

private int  queueElement;
 
public QueueImplemetation(int queueCapacity){
 
      queue = new int [queueCapacity];
   
}
 
   public  boolean isQueueEmpty(){
        
        if(queueSize == 0){
             
              System.out.println("Queue is empty");
             
              return true;
             
        }else{
          
              return false; 
   }
        }
  
   public boolean isQueueFull(){
        
         if(queueSize == queue.length){
              
               System.out.println("Queue is full");
         }
      return false;
        
   }
     
   public void enqueue(int itemData) {
	   isQueueFull();
       queue[queueSize]= itemData;
       queueSize++;
   }
     
   public int dequeue() {
	   isQueueEmpty();
  
       queueElement=queue[0];
       for(int i =0; i<queueSize-1; i++){
       	queue[i]=queue[i+1];
       }
          queueSize--;
        return queueElement;
   }
 
     public int head(){
    	 
    	 return queue[0];
     }
     
     public int tail(){
    	 isQueueEmpty();
    	 return queue[queueSize-1];
     }
     
     public void clearQueue(){
    	 
    			for(int i = 0; i < queue.length; i++) 
    				queue[i] = 0;
    			    queueSize = 0;
    		}
    	     
      public static void main(String[] args) {
           
    QueueImplemetation queueJob = new QueueImplemetation(5);
           
        queueJob.enqueue(10);
        queueJob.enqueue(20);
        queueJob.enqueue(30);      
        queueJob.enqueue(40);
        queueJob.enqueue(50);
    //    queueJob.clearQueue();
      //  System.out.println(queueJob.head());
        System.out.println(queueJob.dequeue());
        System.out.println(queueJob.dequeue());
       
}
      }
