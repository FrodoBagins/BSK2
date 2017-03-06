/**
 * Created by Kamil_2 on 2017-02-24.
 */
public class FirstClass {


    public static void main(String [] args) {

        String cleartext="CRYPTOGRAPHYOSA";
        String encrypt = "";

        int d = 4;
        int letternumb = 0;

        int height = cleartext.length() / d;

        if ((cleartext.length() % (height * d)) > 0)
            height = height + 1;

        int[] key ={3,1,4,2};

        char[][] text = new char[height][d];


        for(int i=0;i<height;i++){

            for(int j=0; j<d ;j++){

                if(letternumb<cleartext.length())
                text[i][j]=cleartext.charAt(letternumb);

                letternumb+=1;

                if(letternumb>cleartext.length())
                    text[i][j]=' ';
            }

            for(int j=0; j<d; j++){

                int number = key[j]-1;
                System.out.println(text[i][number]);

                if(!(text[i][number]==' '))
                encrypt = encrypt + text[i][number];
            }
        }

        System.out.println(encrypt);



    }
}
