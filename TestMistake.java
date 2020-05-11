package mathcomp.oletsky.bayes;

public class TestMistake {
    public static void main(String[] args) {
        double pSuccess=0.995;
        double pIll=0.01;
        double pTest= (pSuccess*pIll)+(1-pSuccess)*(1-pIll);
        System.out.printf("Probability of test is %6.3f\n",pTest);
        double pApostIll=(pSuccess*pIll)/pTest;
        System.out.printf("Probability of being ill is %6.3f\n",pApostIll);

    }
}
