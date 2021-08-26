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

    @Test
    public void newWalletHasZeroBalance() throws Exception {
        Wallet wallet = new Wallet();

        assertThat(wallet.balance())
                .isZero();
    }

    @Test
    public void newWalletAdd8ThenBalanceIs8() throws Exception {
        Wallet wallet = new Wallet();

        wallet.addMoney(8);

        assertThat(wallet.balance())
                .isEqualTo(8);
    }

    @Test
    public void newWalletAdd17AndAdd18HasBalanceOf35() throws Exception {
        Wallet wallet = new Wallet();

        wallet.addMoney(17);
        wallet.addMoney(18);

        assertThat(wallet.balance())
                .isEqualTo(17 + 18);
    }

}
