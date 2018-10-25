package labseven.experiment;

import labseven.computation.IterativeFibonacciComputation;
import labseven.computation.RecursiveFibonacciComputation;
import labseven.data.ResultsTable;

/**
 * An Experiment class that can run a campaign of experiments.
 * Note that this class supports running campaigns of experiments for a
 * different number of rounds depending on the strategy.
 *
 * @author Gregory M. Kapfhammer
 */

public class Experiment {

  /** The campaign length for the RecursiveFibonacciComputation. */
  // TODO: Make sure that you try a value at least one bigger than
  // the default value. Warning, this may take a very long time!
  private static final int RECURSIVE_FIBONACCI_CAMPAIGN_LENGTH = 6;

  /** The campaign length for the IterativeFibonacciComputation. */
  private static final int ITERATIVE_FIBONACCI_CAMPAIGN_LENGTH = 23;

  /** Run the recursive experiment. */
  public static void runRecursiveExperiment() {
    RunCampaign runComputationCampaign = new RunCampaign();
    // Create a RecursiveFibonacciComputation and run it in a campaign
    RecursiveFibonacciComputation recursiveFibonacci = new RecursiveFibonacciComputation();
    ResultsTable recursiveFibonacciResultsTable =
        runComputationCampaign.run(recursiveFibonacci, RECURSIVE_FIBONACCI_CAMPAIGN_LENGTH);
    System.out.println();
    System.out.println("Results of an experiment campaign with "
                       + recursiveFibonacci.getName() + ":\n");
    System.out.println(recursiveFibonacciResultsTable.toString());
    System.out.println();
  }

  /** Run the iterative experiment. */
  public static void runIterativeExperiment() {
    // TODO: Add the full implementation for running the iterative experiment
  }

  /** Run the experiment campaigns for a different number of rounds. */
  public static void main(String[] args) {
    runIterativeExperiment();
    runRecursiveExperiment();
  }

}
