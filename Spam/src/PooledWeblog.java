import java.io.*;
import java.util.*;
import java.util.concurrent.*;
// Requires Java 7 for try-with-resources and multi-catch
public class PooledWeblog {
	private final static int NUM_THREADS = 60;
	public static void main(String[] args) throws IOException {
		
		long start = System.currentTimeMillis();
		
		ExecutorService executor = Executors.newFixedThreadPool(NUM_THREADS);
		Queue<LogEntry> results = new LinkedList<LogEntry>();
		try (BufferedReader in = new BufferedReader(
				new InputStreamReader(new FileInputStream(args[0]), "UTF-8"));) {
			for (String entry = in.readLine(); entry != null; entry = in.readLine()) {
				LookupTask task = new LookupTask(entry);
				
				Future<String> future = executor.submit(task);
				
				LogEntry result = new LogEntry(entry, future);
				
				results.add(result);
			}
		}
		// Start printing the results. This blocks each time a result isn't ready.
		for (LogEntry result : results) {
			try {
				System.out.println(result.future.get());
			} catch (InterruptedException | ExecutionException ex) {
				System.out.println(result.original);
			}
		}
		executor.shutdown();
		
		long end = System.currentTimeMillis();
		System.out.println("경과 시간 : " + (end - start) / 1000.0);
	}
	private static class LogEntry {
		String original;
		Future<String> future;
		LogEntry(String original, Future<String> future) {
			this.original = original;
			this.future = future;
		}
	}
}