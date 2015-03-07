public class CharCount{
    
    public static void main(String args[]){
    
    String str = "thhssstt";  
    
    
    StringBuilder finalstring = new StringBuilder();
    int count = 0;
    char prevchar = str.charAt(0);
    for(int i=0;i<str.length();i++){
        char currchar = str.charAt(i);
       if(prevchar == currchar){
       count++;
       }
       else if(prevchar != currchar  && count ==1){
    	   
    	   finalstring.append(prevchar);
           count = 1;
          } 
          
          
       else  if(prevchar != currchar && count >1)
        {
    	   finalstring.append(count).append(prevchar);
           count = 1;
         }     
         
        prevchar = currchar;
        
        }
    finalstring.append(count).append(prevchar);
    
    System.out.println("FInal string is: "+finalstring);
    }
    }
    
    
    
