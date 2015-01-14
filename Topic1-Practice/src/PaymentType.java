
/**
 * @author DiegoT
 *
 */
public interface PaymentType {

	public double calculateDiscount(Cart cart);
	public String toString();
}
