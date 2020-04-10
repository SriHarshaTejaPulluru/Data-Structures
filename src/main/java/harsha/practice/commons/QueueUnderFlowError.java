package harsha.practice.commons;

public class QueueUnderFlowError extends Error {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6507858041585045081L;

	/**
	 * 
	 */

	public QueueUnderFlowError() {
		super(CommonConstants.QUEUE_UNDER_FLOW_ERROR);
	}
}
