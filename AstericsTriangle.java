package ChapterFour;

public class AstericsTriangle {
        public static void main(String[] args) {

            for (int mh=1;mh <= 7;mh++){
                for (int i=1; i <= mh;i++){
                    System.out.print(i);
                }
                System.out.println();
            }


        System.out.println();
            for (int mh=7; mh>=1; mh--){
                for (int i =1; i<=mh;i++){
                    System.out.print(i);
                }
                System.out.println();
            }System.out.println();
            int blank =7;
            for (int nh=1; nh<=7; nh++){
                for (int space =1; space<=blank; space++){
                    System.out.print(" ");
                }
                for (int i =1; i<=nh; i++){
                    System.out.print(i);
                }
                System.out.println();
                blank--;
            }
            for (int lh=1; lh<2;);
            System.out.println(blank);
        }
}

