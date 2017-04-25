package org.modelexecution.operationalsemantics.ad.benchmark;

import java.io.IOException;

public class BenchmarkTest1 {
	public static void main(String[] args) throws IOException {
		new Benchmark().start("testperformance_variant1", 50, 500, null, null);
	}
}
