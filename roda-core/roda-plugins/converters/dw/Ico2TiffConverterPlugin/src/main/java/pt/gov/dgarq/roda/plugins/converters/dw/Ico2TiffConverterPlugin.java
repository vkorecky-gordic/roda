package pt.gov.dgarq.roda.plugins.converters.dw;

import org.apache.log4j.Logger;

import pt.gov.dgarq.roda.core.data.RepresentationObject;
import pt.gov.dgarq.roda.core.plugins.Plugin;
import pt.gov.dgarq.roda.plugins.converters.common.AbstractRodaMigratorPlugin;

/**
 * @author Rui Castro
 */
public class Ico2TiffConverterPlugin extends AbstractRodaMigratorPlugin {
	private static Logger logger = Logger
			.getLogger(Ico2TiffConverterPlugin.class);

	private final String name = "Converter/Ico to TIFF";
	private final float version = 1.0f;
	private final String description = "Digitalized Work Ico representations normalizer plugin. "
			+ "Convert DigitalizedWork representations with Ico images to uncompressed TIFFs using RODA Migrator service DW2Tiff.";

	/**
	 * 
	 * @see Plugin#getName()
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @see Plugin#getVersion()
	 */
	public float getVersion() {
		return version;
	}

	/**
	 * @see Plugin#getDescription()
	 */
	public String getDescription() {
		return description;
	}

	@Override
	protected String getConfigurationFile() {
		return "ico2tiff-converter.properties";
	}

	/**
	 * 
	 * @see AbstractRodaMigratorPlugin#getRepresentationType ()
	 */
	@Override
	protected String getRepresentationType() {
		return RepresentationObject.DIGITALIZED_WORK;
	}

	/**
	 * 
	 * @see AbstractRodaMigratorPlugin#isNormalization()
	 */
	@Override
	protected boolean isNormalization() {
		return true;
	}

}
