package com.devPractice.queueDataStructure;
 
public class CircularQueue {
     
private static int[] queue ;
private     int front; 
private     int rear;  
private int queueSize;
 
public CircularQueue(int queueCapacity){
 
      queue = new int [queueCapacity];
      rear = 0;
      front = 0 ;
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
     
      public void enqueue(int queueItem){
           
            isQueueFull();
           
            queue[rear] = queueItem;
            rear = (rear + 1) % queue.length;
             queueSize++;
      }
     
      public int  dequeue(){
           
            isQueueEmpty();
           
            //Object item = queue[front];
        //queue[front] = null;
        front = (front + 1) % queue.length;
        queueSize--;
      return front;
            }
     
     
      public static void main(String[] args) {
           
    	  CircularQueue queueJob = new CircularQueue(5);
           
        queueJob.enqueue(10);
        queueJob.enqueue(20);
        queueJob.enqueue(30);      
        queueJob.enqueue(40);
        queueJob.enqueue(50);
        System.out.println(queueJob.dequeue());
        queueJob.enqueue(60);
        System.out.println(queueJob.dequeue());
        System.out.println(queueJob.dequeue());
        System.out.println(queueJob.dequeue());
        System.out.println(queueJob.dequeue());
        
        for (int i =0; i<queue.length;i++){
        	
        	System.out.println(queue[i]);
        }
     
      }
 
}
