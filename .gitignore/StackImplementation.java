package com.devPractice.queueDataStructure;

public class StackImplementation {
	     
	private int[] stack ;

	private int stackSize;

	public StackImplementation(int stackCapacity){
	 
		stack = new int [stackCapacity];
	   
	}
	 
	   public  boolean isStackEmpty(){
	        
	        if(stackSize == 0){
	             
	              System.out.println("Stack is empty");
	             
	              return true;
	             
	        }else{
	          
	              return false; 
	   }
	        }
	  
	   public boolean isStackFull(){
	        
	         if(stackSize == stack.length){
	              
	               System.out.println("Stack is full");
	         }
	      return false;
	        
	   }
	     
	   public void push(int itemData) {
		   isStackFull();
		   stack[stackSize]= itemData;
	       stackSize++;
	   }
	     
	   public int pop() {
		   isStackEmpty();
	  
		   return   stack[--stackSize];
	         
	   }
	 
	     public int bottom(){
	    	 
	    	 return stack[0];
	     }
	     
	     public int top(){
	    	 isStackEmpty();
	    	 return stack[stackSize-1];
	     }
	     
	     public void clearStack(){
	    	 
	    			for(int i = 0; i < stack.length; i++) 
	    				stack[i] = 0;
	    			    stackSize = 0;
	    		}
	    	     
	      public static void main(String[] args) {
	           
	    	  StackImplementation stackJob = new StackImplementation(5);
	           
	    	  stackJob.push(10);
	    	  stackJob.push(20);
	    	  stackJob.push(30);      
	    	  stackJob.push(40);
	    	  stackJob.push(50);
	    	 // stackJob.clearStack();
	    	 // System.out.println(stackJob.top());
		        System.out.println(stackJob.pop());
	    	  stackJob.push(60);
	        System.out.println(stackJob.pop());
	        System.out.println(stackJob.pop());
	        System.out.println(stackJob.pop());
	        System.out.println(stackJob.pop());
	        System.out.println(stackJob.pop());
//	        stackJob.push(50);
	       
	       
	}
	      }

