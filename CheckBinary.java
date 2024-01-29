class GfG
{
  static	boolean isBinary(String str)
	{
	  for(int i=0;i<str.length();i++){
	      
	   char ch=str.charAt(i);
	   if(ch!='0'&&ch!='1'){
	       
	       
	       return false;
	   }
	   
	      
	  }
	  return true;
	  }
      
      public static void main(String[]args){
     
    boolean s= isBinary("101");
      if(s==true){
      System.out.print(1);
      }else{
      
      
      System.out.print(0);}
	}
}
