/**
 * 
 */
package com.github.buffetboy2001.mas.algorithms;

import com.github.buffetboy2001.mas.interfaces.IFixedStepIntegratorArguments;

/**
 * This class does not contain a setter, so the value cannot be updated within
 * the lifetime of the object.
 * 
 * @author SBOWMAN
 * 
 */
public class FixedStepIntegrationArguments<NUMERICTYPE extends Number> extends FixedStepIterativeAlgorithmArguments<NUMERICTYPE> implements
        IFixedStepIntegratorArguments<NUMERICTYPE> {

    /**
     * Constructor.
     * 
     * @param clazz
     *            The numeric class, must extend from {@link Number}.
     * @param fixedStepSize
     *            The step size to be used for integration arguements.
     */
    public FixedStepIntegrationArguments(Class<NUMERICTYPE> clazz, NUMERICTYPE fixedStepSize) {
        super(clazz, fixedStepSize);
    }

}
