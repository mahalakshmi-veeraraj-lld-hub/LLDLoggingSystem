package LLDChainResponsibilityDesignPattern;

public class InfoLogProcessor extends LogProcessor {
	public InfoLogProcessor(LogProcessor logProcessor) {
		super(logProcessor);
	}

	public void log(int logId, String message) {
		if (logId == LogProcessor.INFO) {
			System.out.println("INFO: " + message);
		} else {
			super.log(logId, message);
		}
	}
}
