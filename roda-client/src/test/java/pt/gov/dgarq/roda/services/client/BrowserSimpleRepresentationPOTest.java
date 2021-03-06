package pt.gov.dgarq.roda.services.client;

import java.net.URL;

import pt.gov.dgarq.roda.core.RODAClient;
import pt.gov.dgarq.roda.core.data.RODAObject;
import pt.gov.dgarq.roda.core.data.RepresentationPreservationObject;
import pt.gov.dgarq.roda.core.data.SimpleRepresentationPreservationObject;
import pt.gov.dgarq.roda.core.data.adapter.filter.Filter;
import pt.gov.dgarq.roda.core.data.adapter.filter.SimpleFilterParameter;
import pt.gov.dgarq.roda.core.stubs.Browser;

/**
 * Test class for Browser service.
 * 
 * @author Rui Castro
 */
public class BrowserSimpleRepresentationPOTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {

			RODAClient rodaClient = null;

			if (args.length == 3) {

				// http://localhost:8180/
				String hostUrl = args[0];
				String username = args[1];
				String password = args[2];
				rodaClient = new RODAClient(new URL(hostUrl), username,
						password);

			} else {
				System.err
						.println(BrowserSimpleROTest.class.getSimpleName()
								+ " protocol://hostname:port/core-service [username password]");
				System.exit(1);
			}

			Browser browserService = rodaClient.getBrowserService();

			System.out.println("\n**************************************");
			System.out.println("Number of Representation Preservation Objects");
			System.out.println("**************************************");

			int count = browserService
					.getSimpleRepresentationPreservationObjectCount(null);
			System.out.println(count
					+ " representation preservation objects in the repository");

			System.out.println("\n**************************************");
			System.out
					.println("Number of Representation Preservation Objects (Inactive)");
			System.out.println("**************************************");

			Filter filterInactive = new Filter();
			filterInactive.add(new SimpleFilterParameter("state",
					RODAObject.STATE_INACTIVE));

			count = browserService
					.getSimpleRepresentationPreservationObjectCount(filterInactive);
			System.out
					.println(count
							+ " inactive representation preservation objects in the repository");

			SimpleRepresentationPreservationObject[] rposList = browserService
					.getSimpleRepresentationPreservationObjects(null);

			System.out.println("\n**************************************");
			System.out.println("List of Representation Preservation Objects");
			System.out.println("**************************************");

			for (int i = 0; rposList != null && i < rposList.length; i++) {
				System.out.println(rposList[i]);
			}

			if (rposList != null && rposList.length > 0) {

				System.out
						.println("\n*********************************************");
				System.out
						.println("Getting RepresentationPreservationObject of the first representation ("
								+ rposList[0].getPid() + ")");
				System.out
						.println("*********************************************");

				RepresentationPreservationObject rObject = browserService
						.getRepresentationPreservationObject(rposList[0]
								.getPid());
				System.out.println(rObject);

			}

		} catch (Throwable e) {
			e.printStackTrace();
			if (e.getCause() != null) {
				System.err.println("Cause exception:");
				e.getCause().printStackTrace();
			}
		}
	}
}
