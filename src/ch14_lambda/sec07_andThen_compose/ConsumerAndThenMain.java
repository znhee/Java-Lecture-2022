package ch14_lambda.sec07_andThen_compose;

import java.util.function.Consumer;

public class ConsumerAndThenMain {

	public static void main(String[] args) {
		Consumer<Member> consumerA = m -> System.out.println("Consumer A" + m.getName());
		Consumer<Member> consumerB = m -> System.out.println("Consumer B" + m.getId());
		
		Consumer<Member> consumerAB = consumerA.andThen(consumerB);
		consumerAB.accept(new Member("홍길동", "hong", null));
	}

}
