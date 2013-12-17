package Kafka.pullmodel;

public class FixPullUp {

	
	public static void main(String[] args) {
		

		
	    Consumer consumerThread = new Consumer(KafkaProperties.topic);
	    consumerThread.start();
	}
}
