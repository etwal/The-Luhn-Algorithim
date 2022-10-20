package cpen221practice;

import java.util.ArrayList;

class LuhnValidator {

    boolean isValid(String candidate) {

        if(candidate.length() <=1){
            return false;
        }

        char[] candi = candidate.toCharArray();

        ArrayList<Integer> stripped= new ArrayList<>();

        for (int i =0; i< candi.length; i++){
            if(candi[i] != ' '){
                switch (candi[i]){
                    case '1':
                        stripped.add(1);
                        break;

                    case '2':
                        stripped.add(2);
                        break;

                    case '3':
                        stripped.add(3);
                        break;
                    case '4':
                        stripped.add(4);
                        break;

                    case '5':
                        stripped.add(5);
                        break;

                    case '6':
                        stripped.add(6);
                        break;

                    case '7':
                        stripped.add(7);
                        break;

                    case '8':
                        stripped.add(8);
                        break;

                    case '9':
                        stripped.add(9);
                        break;

                    case '0':
                        stripped.add(0);
                        break;
                    default:
                       return false;

                }

            }
        }

        if(stripped.size() <= 1){
            return false;
        }

        int []strip = new int[stripped.size()];

        for (int i = 0; i<stripped.size(); i++){
            strip[i] = stripped.get(i);
        }

        int sum =0;

        for (int i = strip.length-2; i>= 0; i -= 2 ){

            int newInt;

            newInt = strip[i]*2;

            if (newInt > 9){
                newInt -= 9;
            }

            strip[i] = newInt;

        }

        for (int i =0; i< strip.length; i++){
            sum+= strip[i];
        }

        if(sum %10 == 0){
            return true;
        }else {
            return false;
        }

    }

}
