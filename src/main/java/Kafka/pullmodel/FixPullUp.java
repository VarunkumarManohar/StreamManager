package Kafka.pullmodel;

import producerConsumer.Consumer;

public class FixPullUp {

	
	public static void main(String[] args) {
		

		
	    Consumer consumerThread = new Consumer(KafkaProperties.topic);
	    consumerThread.start();
	}
}
