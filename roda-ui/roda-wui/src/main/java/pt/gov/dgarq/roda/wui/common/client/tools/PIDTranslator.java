/**
 * 
 */
package pt.gov.dgarq.roda.wui.common.client.tools;

/**
 * @author Luis Faria
 * 
 */
public class PIDTranslator {

	// TODO externalize domain
	private static final String domain = "roda";

	private static final char separator = ':';

	/**
	 * Translate PID to a external presentation form
	 * 
	 * @param internal
	 *            the internal PID presentation form
	 * @return the external presentation form
	 */
	public static String translatePID(String internal) {
		return internal.substring(internal.indexOf(separator) + 1);
	}

	/**
	 * Translate PID to a internal presentation form
	 * 
	 * @param external
	 *            the external presentation form
	 * @return the internal presentation form
	 */
	public static String untranslatePID(String external) {
		return domain + separator + external;
	}

}
