package Kafka.pullmodel;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.util.Bytes;


public class PutData {
	
	public static final String HBaseConfig = "HBase.config";
	
	
	public void putData(String key, String message){
		try{

			// HBase original configuration + internal
			Configuration conf = HBaseLoader.getConfiguration(); // co PutExample-1-CreateConf Create the required configuration.
			HBaseLoader load = HBaseLoader.loadHBase(HBaseConfig);

			HBaseHelper helper = HBaseHelper.getHelper(conf);
			
			//helper.dropTable(HBaseLoader.tableName);
			if(!helper.existsTable(HBaseLoader.tableName)){
				helper.createTableBest(HBaseLoader.tableName, HBaseLoader.coloumnFamily);
			}
			
			// vv PutExample
			@SuppressWarnings("resource")
			HTable table = new HTable(conf, HBaseLoader.tableName); // co PutExample-2-NewTable Instantiate a new client.

			
			
			Put put = new Put(Bytes.toBytes("row1")); // co PutExample-3-NewPut Create put with specific row.
			put.add(Bytes.toBytes("F1"), Bytes.toBytes(key), Bytes.toBytes(message)); // co PutExample-4-AddCol1 Add a column, whose name is "colfam1:qual1", to the put.
			//put.add(Bytes.toBytes("F1"), Bytes.toBytes("qual2"), Bytes.toBytes("val2")); // co PutExample-4-AddCol2 Add another column, whose name is "colfam1:qual2", to the put.

			
			table.put(put); // co PutExample-5-DoPut Store row with column into the HBase table.
			System.out.println("Inserted Data");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Error in"+ PutData.class);
		}
	}

	public static void main(String[] args) {

		new PutData().putData("w3r","varun");
	}
}
