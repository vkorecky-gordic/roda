/**
 * 
 */
package pt.gov.dgarq.roda.wui.common.client;

import java.util.Map;

import pt.gov.dgarq.roda.core.common.LoggerException;
import pt.gov.dgarq.roda.core.common.LoginException;
import pt.gov.dgarq.roda.core.common.RODAClientException;
import pt.gov.dgarq.roda.core.common.RODAException;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

/**
 * @author Luis Faria
 * 
 */
public interface UserLoginService extends RemoteService {

	/**
	 * Service URI
	 */
	public static final String SERVICE_URI = "/userlogin";

	/**
	 * Utilities
	 */
	public static class Util {

		/**
		 * Get service instance
		 * 
		 * @return
		 */
		public static UserLoginServiceAsync getInstance() {

			UserLoginServiceAsync instance = (UserLoginServiceAsync) GWT
					.create(UserLoginService.class);
			ServiceDefTarget target = (ServiceDefTarget) instance;
			target.setServiceEntryPoint(GWT.getModuleBaseURL() + SERVICE_URI);
			return instance;
		}
	}

	/**
	 * Get the authenticated user
	 * 
	 * @return
	 * @throws RODAException
	 */
	public AuthenticatedUser getAuthenticatedUser() throws RODAException;

	/**
	 * Login into RODA Core
	 * 
	 * @param username
	 * @param password
	 * @return
	 * @throws RODAException
	 */
	public AuthenticatedUser login(String username, String password)
			throws RODAException;

	/**
	 * Logout from RODA Core
	 * 
	 * @return
	 * @throws RODAException 
	 */
	public AuthenticatedUser logout() throws RODAException;

	/**
	 * Get RODA properties
	 * 
	 * @return
	 */
	public Map<String, String> getRodaProperties();

}
