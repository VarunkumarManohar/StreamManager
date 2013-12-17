/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package Kafka.pullmodel;

public class KafkaConsumerProducerDemo implements KafkaProperties
{
	
public static void sleep()
{
	try
	{
		Thread.currentThread();
		Thread.sleep(1200);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
	
  public static void main(String[] args) throws InterruptedException
  {
    
    int count =0;
    
//    PutData obj = new PutData();
//    obj.putData("1","Narendra");
//    obj.putData("2", "Varun");
//    obj.putData("3", "IPhone");
//    
    //while(count<3){
    Producer producerThread = new Producer("topic1");
//        
//        
     producerThread.start();
//    	
    	Thread.currentThread().sleep(1000);
       
    	Consumer consumerThread = new Consumer("topic1");
     	
        consumerThread.start();
      // consumerThread.consume();
    	 //count++;
        
      //  System.out.println(("--------------------------------------------- "+count));
    //}
    
//    
  }
}
