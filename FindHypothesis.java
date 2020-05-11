package mathcomp.oletsky.bayes;

import mathcomp.oletsky.mathhelper.VectMatr;

public class FindHypothesis {
    public static void main(String[] args) {
        double[] pH={0.5, 0.4, 0.1};
        double[] pYH={0.1, 0.3, 0.7};
        int n = pH.length;
        double pY= VectMatr.calculateScalarProduct(pH,pYH);
        System.out.printf("Probability of Y is %5.3f\n",pY);
        double[] pHY=new double[n];
        for (var i=0; i<n; i++) {
            pHY[i]=(pYH[i]*pH[i])/pY;
        }
        System.out.println("Probabilities of hypotheses:");
        VectMatr.defaultOutputVector(pHY);
        int recHyp=0;
        double recProb=pHY[0];
        for (int i=1; i<n; i++){
            if (pHY[i]>recProb) {
                recHyp=i;
                recProb=pHY[i];
            }
        }
        System.out.println("The most probable hypothesis is "+recHyp);
        System.out.printf("Its probability is %5.3f\n",recProb);
    }
}
