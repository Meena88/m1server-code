package org.apache.fineract.accounting.closure.bookoffincomeandexpense.exception;

import org.apache.fineract.infrastructure.core.exception.AbstractPlatformDomainRuleException;

public class RunningBalanceZeroException extends AbstractPlatformDomainRuleException {
    public RunningBalanceZeroException(final String officeName) {
        super("error.msg.running.balance.is.zero", officeName + " running balance is zero");
    }
}
