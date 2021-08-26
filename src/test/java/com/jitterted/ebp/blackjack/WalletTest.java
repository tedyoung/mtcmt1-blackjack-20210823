package com.jitterted.ebp.blackjack;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class WalletTest {

    @Test
    public void newWalletIsEmpty() throws Exception {
        // GIVEN
        // WHEN
        Wallet wallet = new Wallet();

        // THEN
        assertThat(wallet.isEmpty())
                .isTrue();
    }

    @Test
    public void addMoneyToNewWalletIsNotEmpty() throws Exception {
        Wallet wallet = new Wallet();

        wallet.addMoney(1);

        assertThat(wallet.isEmpty())
                .isFalse();
    }

}
