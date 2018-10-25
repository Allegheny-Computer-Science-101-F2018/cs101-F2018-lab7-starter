package labseven.experiment;

import labseven.computation.ArithmeticComputation;
import labseven.data.ResultsTable;

/**
 * A Campaign interface used to run an experiment.
 *
 * @author Gregory M. Kapfhammer
 */

public interface Campaign {

  /** Require that any Campaign implementer can run an ArithmeticComputation in an experiment. */
  public ResultsTable run(ArithmeticComputation computation, int campaignLength);

}
