package LLDChainResponsibilityDesignPattern;

public class ErrorLogProcessor extends LogProcessor {
	public ErrorLogProcessor(LogProcessor logProcessor) {
		super(logProcessor);
	}

	public void log(int logId, String message) {
		if (logId == LogProcessor.ERROR) {
			System.err.println("ERROR: " + message);
		} else {
			super.log(logId, message);
		}
	}
}
