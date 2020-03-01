package org.apache.fineract.accounting.closure.bookoffincomeandexpense.domain;

import org.apache.fineract.accounting.closure.domain.GLClosure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface IncomeAndExpenseBookingRepository  extends JpaRepository<IncomeAndExpenseBooking, Long>, JpaSpecificationExecutor<IncomeAndExpenseBooking> {
   IncomeAndExpenseBooking findByGlClosureAndReversedIsFalse(final GLClosure glClosure);
}
