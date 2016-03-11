import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main (String[] args) throws java.lang.Exception
	
	{
		
		Box bigbox =  new Box();
		bigbox.setDepth(5);
		bigbox.setHeight(2);
		bigbox.setWidth(5);
		
		int summa = bigbox.getSum();
		System.out.println(summa);
		
	}


}
