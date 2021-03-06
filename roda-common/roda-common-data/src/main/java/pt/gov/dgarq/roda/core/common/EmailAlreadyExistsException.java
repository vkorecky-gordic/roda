package pt.gov.dgarq.roda.core.common;

/**
 * Thrown to indicate that the specified email was is already used.
 * 
 * @author Rui Castro
 */
public class EmailAlreadyExistsException extends UserRegistrationException {
	private static final long serialVersionUID = 3392813159441368655L;

	/**
	 * Constructs a new {@link EmailAlreadyExistsException}.
	 */
	public EmailAlreadyExistsException() {
	}

	/**
	 * Construct a new {@link EmailAlreadyExistsException} with the error
	 * message.
	 * 
	 * @param message
	 *            the error message.
	 */
	public EmailAlreadyExistsException(String message) {
		super(message);
	}

	/**
	 * Constructs a new {@link EmailAlreadyExistsException} with the given cause
	 * exception.
	 * 
	 * @param cause
	 *            the cause exception.
	 */
	public EmailAlreadyExistsException(Throwable cause) {
		super(cause);
	}

	/**
	 * Constructs a new {@link EmailAlreadyExistsException} with the given error
	 * message and cause exception.
	 * 
	 * @param message
	 *            the error message.
	 * @param cause
	 *            the cause exception.
	 */
	public EmailAlreadyExistsException(String message, Throwable cause) {
		super(message, cause);
	}

}
