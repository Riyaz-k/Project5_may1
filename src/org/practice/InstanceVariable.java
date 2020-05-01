package org.practice;

public class InstanceVariable {
	
	
		 int data;  
		  
		public void change(int data){  
		 this.data=69;//changes will be in the local variable only  
		 }  
		     
		 public static void main(String args[]){  
			 InstanceVariable iv=new InstanceVariable();  
		  
		   System.out.println("before change "+iv.data);  
		  iv.change(50);
		   System.out.println("after change " +iv.data);  
		  
		 }  
		}  


