package fr.inria.diverse.ad.visitor2.benchmark;

import java.io.IOException;

public class BenchmarkTest2 {

	public static void main(String[] args) throws IOException {
		final String xmiPath = args[0];
		new Benchmark().start("testperformance_variant2", 50, 500, xmiPath, "");
	}
}
