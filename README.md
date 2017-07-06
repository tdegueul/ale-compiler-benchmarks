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

1. Follows the Ale installation steps: https://github.com/manuelleduc/ale-compiler#installation
2. Loading the content of the project into the Language workbench workspace
3. Executing the BenchmarkGeneric class of the benchmark project of your choice (one per implementation folder). BenchmarkGeneric's main function expect 3 parameters:
  4. The path to a folder with the xmi of the benchmark
  5. The name of the test to run (testperformance_variant1, testperformance_variant2, or testperformance_variant3_1)
  6. A file name prefix (where the execution times are saved)

Each benchmark executes the test 500 times with 50 warmups executions.

## Running the tests
1. Following the Ale installation steps: https://github.com/manuelleduc/ale-compiler#installation
2. Loading the content of the project into the Language workbench workspace
3. Executing the unit tests provided in the test project of each implementation.
