package sort;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
 
public class GenerateCsv
{
	String file_name;
	int N[];
	int comparisons[];
	
   public GenerateCsv(String name, int N[], int comparisons[])
   {
	   this.file_name = name + ".csv";
	   this.N = N;
	   this.comparisons = comparisons;
   }
 
   public void generateCsvFile()
   {
	   File file = new File(file_name);
	   if(file.exists()){
		   file.delete();
	   }
	try
	{
	    FileWriter writer = new FileWriter(file_name);
 
	    writer.append("N");
	    writer.append(',');
	    writer.append("Comparisons");
	    writer.append('\n');
 
	    for(int i = 0 ; i < this.N.length; i ++){
		    writer.append(N[i] + "");
		    writer.append(',');
		    writer.append(comparisons[i]+ "");
		    writer.append('\n');

	    }
	    
	    //generate whatever data you want
 
	    writer.flush();
	    writer.close();
	}
	catch(IOException e)
	{
	     e.printStackTrace();
	} 
    }
}
