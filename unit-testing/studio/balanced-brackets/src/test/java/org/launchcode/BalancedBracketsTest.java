package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void balancedBracketFullReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void balanceBracketsPartialReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));

    }

    @Test
    public void balanceBracketsPartialFirstBracketOnlyTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void balanceBracketsEmptyStringTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void balanceBracketsOpenBracketOnlyFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));

    }

    @Test
    public void balanceBracketsWrongOrderFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void balancedBracketsClosedBracketOnlyFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void unbalancedBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void unbalancedBracketsUnevenOpenReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode[]"));
    }

    @Test
    public void unbalancedBracketsUnevenClosedReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]LaunchCode[]"));
    }

}