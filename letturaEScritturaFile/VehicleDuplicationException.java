package letturaEScritturaFile;

public class VehicleDuplicationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -226161753936769567L;

	public VehicleDuplicationException() {
		
	}
	
	public VehicleDuplicationException(String message) {
		super("Stringa gia presente");
		
	}
	
}
