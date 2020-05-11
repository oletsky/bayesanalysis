package mathcomp.oletsky.bayes;

public class PositiveNegative {
    public static void main(String[] args) {
        double pPositive=0.01;
        double pNegative=1.-pPositive;
        double pTruePositive=0.95;
        double pFalsePositive=0.05;
        double pTrueNegative=0.95;
        double pFalseNegative=1.-pTruePositive;
        double pTestPositive=pPositive*pTruePositive+
                pNegative*pFalsePositive;
        double pTestNegative=pPositive*pFalseNegative+
                pNegative*pTrueNegative;
        System.out.printf("Probability of positive test: %6.4f\n",
                pTestPositive);
        System.out.printf("Probability of negative test: %6.4f\n",
                pTestNegative);
        double pAposterioriPositive = (pTruePositive*pPositive)/
                pTestPositive;
        System.out.printf("Aposteriori prob of positive: %6.4f\n",
                pAposterioriPositive);
    }
}
