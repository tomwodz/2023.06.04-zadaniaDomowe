package pl.camp.it.tomwodz.zadania.core;

public interface IBlackjackVer {
    int verification(String str);

    int verificationAce(String str);
    int verificationFinish(int sumPlusCounterAce, int counterAce);
}
