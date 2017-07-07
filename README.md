# Ale compiler benchmarks

[Examples](./Examples): Small examples of Ale operational semantics.

**Benchmarks:**

All the following projects are implementations of the 8th Transformation Tool Contest - [Model Execution use case](http://www.transformation-tool-contest.eu/2015/solutions_execution.html).

 - [EMF Switch](./EMF%20Switch): EMF Switch based implementation
 - [Interpreter](./Interpreter): The reference implementation, inspired by the Interpreter pattern
 - [Visitor](./Visitor): Visitor pattern based implementation
 - [MonolithicRevisitor](./MonolithicRevisitor): Revisitor based implementation using a monolithic metamodel where the runtime concepts are already merged.
 - [ModularRevisitor](./ModularRevisitor): Revisitor based implementation where the runtime concepts are defined separatly from the activity diagram concepts.

## Running the benchmarks

1. Follow the Ale installation steps: https://github.com/manuelleduc/ale-compiler#installation
2. Load the content of the project into the Language workbench workspace
3. Execute the BenchmarkGeneric class of the benchmark project of your choice (one per implementation folder). BenchmarkGeneric's main function expect 3 parameters:
  1. The path to a folder with the xmi of the benchmark.
  2. The name of the test to run (testperformance_variant1, testperformance_variant2, or testperformance_variant3_1)
  3. A file name prefix (where the execution times are saved)

Each benchmark's folder has a readme with the detail of the specific configuration for it execution.
Each benchmark executes the test 500 times with 50 warmups executions.

## Running the tests
1. Follow the Ale installation steps: https://github.com/manuelleduc/ale-compiler#installation
2. Load the content of the project into the Language workbench workspace
3. Execute the unit tests provided in the test project of each implementation.
