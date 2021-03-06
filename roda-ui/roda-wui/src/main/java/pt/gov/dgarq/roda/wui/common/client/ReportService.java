package pt.gov.dgarq.roda.wui.common.client;

import pt.gov.dgarq.roda.core.common.RODAException;
import pt.gov.dgarq.roda.core.data.Report;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

/**
 * Report service interface
 * 
 * @author Luis Faria
 * 
 */
public interface ReportService extends RemoteService {

	/**
	 * Service URI
	 */
	public static final String SERVICE_URI = "reportservice";

	/**
	 * Access implementation
	 */
	public static class Util {

		/**
		 * Get report implementation instance
		 * 
		 * @return
		 */
		public static ReportServiceAsync getInstance() {

			ReportServiceAsync instance = (ReportServiceAsync) GWT
					.create(ReportService.class);
			ServiceDefTarget target = (ServiceDefTarget) instance;
			target.setServiceEntryPoint(GWT.getModuleBaseURL() + SERVICE_URI);
			return instance;
		}
	}

	/**
	 * Get report
	 * 
	 * @param reportId
	 *            the report id
	 * @return
	 * @throws RODAException
	 */
	public Report getReport(String reportId) throws RODAException;

}
