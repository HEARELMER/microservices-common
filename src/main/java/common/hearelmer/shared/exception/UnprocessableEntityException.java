package common.hearelmer.shared.exception;

public class UnprocessableEntityException extends DomainException {
    public UnprocessableEntityException(String message) {
        super(message);
    }
}