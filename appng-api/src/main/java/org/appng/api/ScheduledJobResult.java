package org.appng.api;

/**
 * A {@link ScheduledJobResult} can be provided by a {@link ScheduledJob}. The {@link ScheduledJobResult} contains some
 * information which will be stored by the scheduler application in the appNG database per job execution.
 * 
 * @author Claus Stümke
 *
 */
public class ScheduledJobResult {

	private ExecutionResult result;
	private String customData;

	/**
	 * simple enum reflecting the results a {@link ScheduledJob} execution can have.
	 * 
	 * @author Claus Stümke
	 *
	 */
	public enum ExecutionResult {
		FAIL, SUCCESS;
	}

	/**
	 * returns the general result of the job in a semantic manner. Job abortions, because of thrown Exceptions, are
	 * handles another way.
	 * 
	 * @return execution result as {@code enum} {@link ExecutionResult}
	 */
	public ExecutionResult getResult() {
		return result;
	}

	/**
	 * a {@link ScheduledJob} can provide some application specific custom information such as statistics or log
	 * messages to be stored in the appNG Database. Serialization and de-serialization has to be done by the
	 * {@link ScheduledJob} and any application that consumes the custom information. The size is limited to the size of
	 * a TEXT field in the database type used by the running appNG instance. (~64kB on MySQL)
	 * 
	 * @return customData as {@code String}
	 */
	public String getCustomData() {
		return customData;
	}

	/**
	 * sets the general semantic result of the {@link ScheduledJob}
	 * 
	 * @param result
	 *            {@code result}
	 */
	public void setResult(ExecutionResult result) {
		this.result = result;
	}

	/**
	 * sets the custom data of a {@link ScheduledJob} execution
	 * 
	 * @param customData
	 *            {@code customData}
	 */
	public void setCustomData(String customData) {
		this.customData = customData;
	}

}