package org.apache.fineract.accounting.closure.bookoffincomeandexpense.exception;

import org.apache.fineract.infrastructure.core.exception.AbstractPlatformDomainRuleException;

public class RunningBalanceNotCalculatedException extends AbstractPlatformDomainRuleException {
    public RunningBalanceNotCalculatedException(final Long officeId) {
        super("error.msg.running.balance.not.calculated", "Office with identifier " + officeId + " running balance is not calculated");
    }

}
