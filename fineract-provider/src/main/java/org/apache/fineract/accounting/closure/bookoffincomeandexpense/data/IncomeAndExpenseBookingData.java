package org.apache.fineract.accounting.closure.bookoffincomeandexpense.data;

import org.joda.time.LocalDate;

import java.util.List;

public class IncomeAndExpenseBookingData {
    private final LocalDate bookingDate;

    private final String comments;

    private List<JournalEntry> journalEntries;

    public IncomeAndExpenseBookingData(final LocalDate bookingDate, final String comments, final List<JournalEntry> journalEntries) {
        this.bookingDate = bookingDate;
        this.comments = comments;
        this.journalEntries = journalEntries;
    }

    public LocalDate getBookingDate() {return this.bookingDate;}

    public String getComments() {return this.comments;}

    public List<JournalEntry> getJournalEntries() {return this.journalEntries;}
}
