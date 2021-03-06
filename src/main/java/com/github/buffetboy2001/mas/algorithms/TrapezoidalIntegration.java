/**
 * 
 */
package com.github.buffetboy2001.mas.algorithms;

/**
 * Perform fixed step trapezoidal integration.
 * 
 * See Chapra and Canale, Numerical Methods for Engineers, 2nd Ed., pg 478
 * 
 * @author SBOWMAN
 * @param <NUMERICTYPE>
 *            The data type to be used for input and output.
 */
public class TrapezoidalIntegration<NUMERICTYPE extends Number> extends FixedStepIntegrator<NUMERICTYPE, TrapezoidalIntegrationArguments<NUMERICTYPE>> {

    /**
     * Constructor.
     * 
     * @param clazz
     *            The numeric class, must extend from {@link Number}. The
     *            numeric class used for input and output.
     * @param fixedStepArgs
     *            The fixed step argument used for all evaluations of
     *            integrate().
     */
    public TrapezoidalIntegration(final Class<NUMERICTYPE> clazz, final FixedStepIntegrationArguments<NUMERICTYPE> fixedStepArgs) {
        super(clazz, fixedStepArgs);
    }

    @Override
    public NUMERICTYPE integrate(TrapezoidalIntegrationArguments<NUMERICTYPE> integratorArgs, NUMERICTYPE integralOfThis) {
        if (this.performCalculationsAsDoublePrimitive) {
            double intermediateCalculation = this.getFixedStepSize().doubleValue() * (integralOfThis.doubleValue() + integratorArgs.getPreviousFunctionValue().doubleValue()) / 2;
            super.incrementTotal(this.convertToOutputType(intermediateCalculation));
            return super.getTotalIntegrationValue();
        } else {
            long intermediateCalculation = this.getFixedStepSize().longValue() * (integralOfThis.longValue() + integratorArgs.getPreviousFunctionValue().longValue()) / 2;
            super.incrementTotal(this.convertToOutputType(intermediateCalculation));
            return super.getTotalIntegrationValue();
        }
    }

}
