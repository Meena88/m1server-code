package org.apache.fineract.accounting.closure.bookoffincomeandexpense.service;

import org.apache.fineract.accounting.closure.bookoffincomeandexpense.data.IncomeAndExpenseBookingData;
import org.apache.fineract.infrastructure.core.api.JsonQuery;

import java.util.Collection;

public interface CalculateIncomeAndExpenseBooking {
    Collection<IncomeAndExpenseBookingData> CalculateIncomeAndExpenseBookings(JsonQuery query);
}
