public class WithdrawalException extends Exception
{
	public WithdrawalException() {
        super();
    }

    public WithdrawalException(String message) {
        super(message);
    }

    
    public WithdrawalException(String message, Throwable cause) {
        super(message, cause);
    }

    
    public WithdrawalException(Throwable cause) {
        super(cause);
    }

    
    protected WithdrawalException(String message, Throwable cause,
                        boolean enableSuppression,
                        boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}