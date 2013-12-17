package Kafka.pullmodel;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.util.Bytes;


public class GetData {
	
	public static final String HBaseConfig = "HBase.config";

	
	public void getData(){
		try{

			// HBase original configuration + internal
			Configuration conf = HBaseLoader.getConfiguration(); // co PutExample-1-CreateConf Create the required configuration.
			HBaseLoader load = HBaseLoader.loadHBase(HBaseConfig);

			HBaseHelper helper = HBaseHelper.getHelper(conf);
			
			if(helper.existsTable(HBaseLoader.tableName)){
				//helper.createTableBest(HBaseLoader.tableName, HBaseLoader.coloumnFamily);
				HTable table = new HTable(conf, HBaseLoader.tableName); // co GetExample-2-NewTable Instantiate a new table reference.
				Scan dd = new Scan();
			    Get get = new Get(Bytes.toBytes("row1")); // co GetExample-3-NewGet Create get with specific row.

			//    get.addColumn(Bytes.toBytes("F1"), Bytes.toBytes("qual1")); // co GetExample-4-AddCol Add a column to the get.
			    
			    get.addFamily(Bytes.toBytes("F1"));

			    Result result = table.get(get); // co GetExample-5-DoGet Retrieve row with selected columns from HBase.

			    //System.out.println(result);

				byte[] val;
				for (int i = 0; i <= 10; i++) {
					val = result.getValue(Bytes.toBytes("F1"),
							Bytes.toBytes(i+"")); // co GetExample-6-GetValue Get
													// a specific value for the
													// given column.

					System.out.println("Value: " + Bytes.toString(val)); // co
																			// GetExample-7-Print
																			// Print
																			// out
																			// the
																			// value
																			// while
																			// converting
																			// it
																			// back.
				}
			    
			    }else{
				System.out.println("No table exists");
			}
			
			
			
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Error in " + GetData.class);
		}
	}
	public static void main(String[] args) {
			new GetData().getData();
	
	}

}
