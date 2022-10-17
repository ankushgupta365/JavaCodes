class p19
   {
   public static void main(String a[])
	{
	if(a.length==0)
	  {
	  System.out.println("There is no command line argument");
	  }
	else
	  {
	  String str=a[0];
	  int c=str.charAt(0);
	  if(c>=65  &&  c<=90)
	     {
	     System.out.println("The string starts with capital letter :"+str);
             }
	  else
	     {
	     System.out.println("The string is not starts with capital letter :"+str);
	     }
	  }
	}
   }
