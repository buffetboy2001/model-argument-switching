/**
 * 
 */
package com.github.buffetboy2001.mas.algorithms;

import com.github.buffetboy2001.mas.interfaces.IIntegrationArguments;

/**
 * A blank integrator args object. Returns zero for the step size.
 * 
 * @author SBOWMAN
 * 
 */
public class NoIntegrationArguments<NUMERICTYPE extends Number> extends ParameterizedExtendsNumber<NUMERICTYPE> implements IIntegrationArguments<NUMERICTYPE> {

    public NoIntegrationArguments(Class<NUMERICTYPE> clazz) {
        super(clazz);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.github.buffetboy2001.mas.interfaces.IIntegrationArguments#getStepSize()
     */
    @Override
    public NUMERICTYPE getStepSize() {
        return this.getZeroAsCorrectType();
    }

}
