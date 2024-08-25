package LLDChainResponsibilityDesignPattern;

public class DebugLogProcessor extends LogProcessor {
	public DebugLogProcessor(LogProcessor logProcessor) {
		super(logProcessor);
	}

	public void log(int logId, String message) {
		if (logId == LogProcessor.DEBUG) {
			System.out.println("DEBUG: " + message);
		} else {
			super.log(logId, message);
		}
	}
}
