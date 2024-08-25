package LLDChainResponsibilityDesignPattern;

public abstract class LogProcessor {
	private LogProcessor nextLogProcessor;

	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;

	public LogProcessor(LogProcessor logProcessor) {
		this.nextLogProcessor = logProcessor;
	}

	public void log(int logId, String message) {
		if (nextLogProcessor != null) {
			nextLogProcessor.log(logId, message);
		}
	}
}
