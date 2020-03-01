package org.apache.fineract.accounting.closure.bookoffincomeandexpense.service;

import org.joda.time.LocalDate;
import org.apache.fineract.accounting.closure.bookoffincomeandexpense.data.IncomeAndExpenseJournalEntryData;

import java.util.List;

public interface IncomeAndExpenseReadPlatformService {
    List<IncomeAndExpenseJournalEntryData> retrieveAllIncomeAndExpenseJournalEntryData(Long officeId,LocalDate date,String currencyCode);
}
