package ch10.ex11_UserDefineException;

public class BalanceInsufficientException extends RuntimeException{
	BalanceInsufficientException() { }

	BalanceInsufficientException(String message) {
		super(message);
	}
}
