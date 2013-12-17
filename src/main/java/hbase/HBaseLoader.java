package hbase;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
 

public class HBaseLoader {

	public static String tableName ;
	public static String[] coloumnFamily ;
	public int coloumLength;

	public static HBaseLoader hBaseLoader = null;
	public static HBaseLoader loadHBase(String str){
		
		if(hBaseLoader==null){
			synchronized (HBaseLoader.class) {
				if(hBaseLoader == null){
					hBaseLoader = new HBaseLoader(str);
					return hBaseLoader;
				}
			}
			
		}
		return hBaseLoader;
	}
	
	public static Configuration configuration = null;
	public static Configuration getConfiguration(){
		
		if(configuration==null){
			synchronized (HBaseLoader.class) {
				if(configuration == null){
					configuration = HBaseConfiguration.create();
					return configuration;
				}
			}
			
		}
		return configuration;
	}
	
	private HBaseLoader(String str){
		loadProperties(str);
	}

	public void loadProperties(String str){
		Properties props = new Properties();
		FileInputStream fis = null;
		try  {
			fis = new FileInputStream(str);
			props.load(fis);
			coloumLength = Integer.parseInt(props.getProperty("coloumnLength"));
			tableName = props.getProperty("tableName");
			coloumnFamily = new String[coloumLength];
			for(int i=0;i<coloumLength;i++){
				coloumnFamily[i]=props.getProperty("coloumnFamily"+i);
			}
			 

			fis.close();
		} 
		catch (Exception e) 
		{
			System.out.println("Error in parsing the file.");
		}
	}

}
