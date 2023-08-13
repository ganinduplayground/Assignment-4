public class Algo8 {
    
    public static void main(String[] args) {
        int[] numA = { 5, 7, -2, 3, 4, 6, -8 };
        int[] numB = { 7, 8, -8, 2, 1, -9, 6 };


        /* numA intersect numB */
        String intersect = "Intersection: ";

        int x;
        for (int i = 0; i < numA.length; i++) {

            x = numA[i];
            for (int j = 0; j < numB.length; j++) {
                if(x==numB[j]){
                    intersect+= x+",";
                }
            }
        }
        System.out.println(intersect+"\b ");

        /*numA union numB */

        String union = "Union: ";
        for (int i = 0; i < numA.length; i++) {
            union+=numA[i]+",";
        }

        for (int i = 0; i < numB.length; i++) {
            union+=numB[i]+",";
        }

        System.out.println(union+"\b ");

        // /* numA/numB */

        // String diffAB = "numA/numB: ";

        // int p;
        // for (int i = 0; i < numA.length; i++) {

        //     p = numA[i];
        //     for (int j = 0; j < numB.length; j++) {
        //         if(p!=numB[j]){
        //             diffAB+= p+",";
        //         }
        //     }
        // }
        // System.out.println(diffAB+"\b ");

        // // String divisionAB = "Division A/B: ";

        // // for (int i = 0; i < numB.length; i++) {
        // //     divisionAB += numA[i]/(numB[i]*1.0) + ", ";
        // // }

        // // System.out.println(divisionAB + "\b\b ");

        // /* numB/numA */

        // // String divisionBA = "Division B/A: ";

        // // for (int i = 0; i < numB.length; i++) {
        // //     divisionBA += numB[i]/(numA[i]*1.0) + ", ";
        // // }

        // // System.out.println(divisionBA + "\b\b ");

        // String diffBA = "numB/numA: ";

        // int q;
        // for (int i = 0; i < numA.length; i++) {

        //     q = numB[i];
        //     for (int j = 0; j < numB.length; j++) {
        //         if(q!=numA[j]){
        //             diffBA+= q+",";
        //         }
        //     }
        // }
        // System.out.println(diffBA+"\b ");
    }
}
