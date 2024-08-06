package core.basesyntax.transaction.impl;

import core.basesyntax.transaction.OperationHandler;

public class PurchaseHandler implements OperationHandler {
    @Override
    public int perform(int balance, int quantity) {
        if (balance < quantity) {
            throw new RuntimeException("Insufficient balance: " + balance);
        }
        return balance - quantity;
    }
}
