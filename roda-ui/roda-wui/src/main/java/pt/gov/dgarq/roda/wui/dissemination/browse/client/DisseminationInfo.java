/**
 * 
 */
package pt.gov.dgarq.roda.wui.dissemination.browse.client;

import java.io.Serializable;

/**
 * @author Luis Faria
 * 
 */
public class DisseminationInfo implements Serializable {

	// TODO set this in properties
	public final static String DOWNLOAD_DISSEMINATOR_ID = "AIPDownload";

	private String id;

	private String url;

	private String windowName;

	private String windowFeatures;

	private String iconURL;

	/**
	 * Create a new dissemination info
	 */
	public DisseminationInfo() {

	}

	/**
	 * Create a new dissemination info
	 * 
	 * @param id
	 *            the dissemination id
	 * @param url
	 *            the dissemination URL
	 * @param window_name
	 *            the name where to open the window (e.g. "_self", "_top" or
	 *            "_blank")
	 * @param window_features
	 *            the window features (e.g. "fullscreen=yes, menubar=no,
	 *            scrollbars=yes")
	 * @param iconURL
	 *            the URL of the dissemination icon, null for none
	 */
	public DisseminationInfo(String id, String url, String window_name,
			String window_features, String iconURL) {
		this.id = id;
		this.url = url;
		this.windowName = window_name;
		this.windowFeatures = window_features;
		this.iconURL = iconURL;
	}

	/**
	 * Get dissemination id
	 * 
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Set dissemination id
	 * 
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Get dissemination URL
	 * 
	 * @return the URL
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Set dissemination URL
	 * 
	 * @param url
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * Get target window features
	 * 
	 * @return the window features
	 */
	public String getWindowFeatures() {
		return windowFeatures;
	}

	/**
	 * Set target window features
	 * 
	 * @param windowFeatures
	 */
	public void setWindowFeatures(String windowFeatures) {
		this.windowFeatures = windowFeatures;
	}

	/**
	 * Get target window name
	 * 
	 * @return "_blank", "_self", "_top", etc.
	 */
	public String getWindowName() {
		return windowName;
	}

	/**
	 * Set target window name
	 * 
	 * @param windowName
	 *            "_blank", "_self", "_top", etc.
	 */
	public void setWindowName(String windowName) {
		this.windowName = windowName;
	}

	/**
	 * Get dissemination icon URL
	 * 
	 * @return an URL pointing to the icon image
	 */
	public String getIconURL() {
		return iconURL;
	}

	/**
	 * Set dissemination icon URL
	 * 
	 * @param iconURL
	 *            URL pointing to the icon image
	 */
	public void setIconURL(String iconURL) {
		this.iconURL = iconURL;
	}

	/**
	 * Does this disseminator return the download of the AIP
	 * 
	 * @return true if this disseminator returns the download of the AIP
	 */
	public boolean isDownloadDisseminator() {
		return DOWNLOAD_DISSEMINATOR_ID.equals(id);
	}

}
