package softUni;

/*
        * Next lexicographical permutation algorithm (Java)
        * by Project Nayuki, 2014. Public domain.
        * https://www.nayuki.io/page/next-lexicographical-permutation-algorithm
        */
public class Labor3_31 {

         // main
         public static int count;
            public static void main(String[] args) {
                //List<String> myarray = Arrays.asList("A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z");


                stringPermuteAndPrint("", "ABCD");
                System.out.println (" Combination: "+count );
            }

            private static void stringPermuteAndPrint(String prefix, String str) {

                int n = str.length();
                if (n == 0) {
                    System.out.print(prefix + " ");
                     count++;

                } else {

                    for (int i = 0; i < n; i++) {
                        stringPermuteAndPrint(prefix + str.charAt(i), str.substring(i + 1, n) + str.substring(0, i));
                    }
                }
            }

    }

