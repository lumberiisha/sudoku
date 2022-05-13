package Soduko;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        int [][] matrica= {{1,	3,	3,	4,	5,	6,	7,	7,	9},
        {4,	5,	6,	7,	7,	9,	1,	3,	3},
        {7,	7,	9,	1,	3,	3,	4,	5,	6},
        {9,	1,	3,	3,	4,	5,	6,	7,	7},
        {3,	4,	5,	6,	7,	7,	9,	1,	3},
        {6,	7,	7,	9,	1,	3,	3,	4,	5},
        {7,	9,	1,	3,	3,	4,	5,	6,	7},
        {3,	3,	4,	5,	6,	7,	7,	9,	1},
        {5,	6,	7,	7,	9,	1,	3,	3,	4}};
                          

        if(check3x3(matrica)&&checkColumn(matrica)&&checkRow(matrica)&&outOfRange(matrica)){
            System.out.println("valid");
        }else System.out.println("not valid");

    }
    public static boolean checkRow(int [][] matrica){
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j <9; j++) {
                if(!map.containsKey(matrica[i][j])){
                    map.put(matrica[i][j], 1);
                }else{
                    return false;
                }
            }
            map=new HashMap<>();
        }
        return true;
    }

    public static boolean checkColumn(int [][] matrica){
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < matrica.length; i++) {
            for (int j = 0; j <matrica[i].length; j++) {
                if(!map.containsKey(matrica[j][i])){
                    map.put(matrica[j][i], 1);
                }
                else{
                    return false;
                }
            }
            map=new HashMap<>();
        }
        return true;
    }

    public static boolean check3x3(int[][] matrica){
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < 9; i++) {
            for (int j=i/3*3;j<i/3*3+3;j++) {
                for (int k = i%3*3; k < i%3*3+3; k++) {
                    if(!map.containsKey(matrica[j][k])){
                        map.put(matrica[j][k], 1);
                    }else{
                        return false;
                    }
                }
            }
            map=new HashMap<>();
        }
        return true;
    }
    public static boolean outOfRange(int[][]matrica){
        for (int i = 0; i < matrica.length; i++) {
            for (int j = 0; j < matrica.length; j++) {
                if(matrica[i][j]>9||matrica[i][j]<1){
                    return false;
                }
            }
        }
        return true;
    }
}

/**basicGrid
 * {{1,2,	3,	4,	5,	6,	7,	8,	9},
        {4,	5,	6,	7,	8,	9,	1,	2,	3},
        {7,	8,	9,	1,	2,	3,	4,	5,	6},
        {9,	1,	2,	3,	4,	5,	6,	7,	8},
        {3,	4,	5,	6,	7,	8,	9,	1,	2},
        {6,	7,	8,	9,	1,	2,	3,	4,	5},
        {8,	9,	1,	2,	3,	4,	5,	6,	7},
        {2,	3,	4,	5,	6,	7,	8,	9,	1},
        {5,	6,	7,	8,	9,	1,	2,	3,	4}};
 */

/**
 * basicGrid2
 * {{4,	3,	5,	2,	6,	9,	7,	8,	1,},
    {6,	8,	2,	5,	7,	1,	4,	9,	3},
    {1,	9,	7,	8,	3,	4,	5,	6,	2},
    {8,	2,	6,	1,	9,	5,	3,	4,	7},
    {3,	7,	4,	6,	8,	2,	9,	1,	5},
    {9,	5,	1,	7,	4,	3,	6,	2,	8},
    {5,	1,	9,	3,	2,	6,	8,	7,	4},
    {2,	4,	8,	9,	5,	7,	1,	3,	6},
    {7,	6,	3,	4,	1,	8,	2,	5,	9}};

 */

 /**columnError
   {{4,	3,	5,	2,	6,	9,	7,	8,	1,},
    {6,	8,	2,	5,	7,	1,	4,	9,	3},
    {1,	9,	7,	8,	3,	4,	5,	6,	2},
    {8,	2,	6,	1,	9,	5,	3,	4,	7},
    {3,	7,	4,	6,	8,	2,	9,	1,	5},
    {1,	5,	9,	7,	4,	3,	6,	2,	8},
    {5,	1,	9,	3,	2,	6,	8,	7,	4},
    {2,	4,	8,	9,	5,	7,	1,	3,	6},
    {7,	6,	3,	4,	1,	8,	2,	5,	9}};
  */

/** OutOfRangeError
*  {{4,	3,	5,	2,	6,	9,	7,	8,	1},
    {6,	8,	2,	5,	7,	1,	4,	9,	3},
    {1,	9,	7,	8,	3,	4,	5,	6,	2},
    {8,	2,	6,	1,	9,	10,	3,	4,	7},
    {3,	7,	4,	6,	8,	2,	9,	1,	5},
    {9,	5,	1,	7,	4,	3,	6,	2,	8},
    {5,	1,	9,	3,	2,	6,	8,	7,	4},
    {2,	4,	8,	9,	5,	7,	1,	3,	6},
    {7,	6,	3,	4,	1,	8,	2,	5,	9}};
*/

/**OutOfRangeError2
 * {{4,	3,	5,	2,	6,	9,	7,	8,	1},
    {6,	8,	2,	5,	7,	1,	4,	9,	3},
    {1,	9,	7,	8,	3,	4,	5,	6,	2},
    {8,	2,	6,	1,	9,	5,	3,	4,	7},
    {3,	7,	4,	6,	8,	2,	9,	1,	5},
    {9,	5,	1,	-7,	4,	3,	6,	2,	8},
    {5,	1,	9,	3,	2,	6,	8,	7,	4},
    {2,	4,	8,	9,	5,	7,	1,	3,	6},
    {7,	6,	3,	4,	1,	8,	2,	5,	9}};

 */

/** rowError
 * {{4,	3,	2,	2,	6,	9,	7,	8,	1},
    {6,	8,	5,	5,	7,	1,	4,	9,	3},
    {1,	9,	7,	8,	3,	4,	5,	6,	2},
    {8,	2,	6,	1,	9,	5,	3,	4,	7},
    {3,	7,	4,	6,	8,	2,	9,	1,	5},
    {9,	5,	1,	7,	4,	3,	6,	2,	8},
    {5,	1,	9,	3,	2,	6,	8,	7,	4},
    {2,	4,	8,	9,	5,	7,	1,	3,	6},
    {7,	6,	3,	4,	1,	8,	2,	5,	9}};

*/

/**rubbishError
 * {{5,	9,	6,	1,	4,	2,	5,	3,	7},
    {6,	1,	4,	3,	5,	8,	2,	4,	8},
    {5,	6,	9,	4,	1,	2,	5,	3,	6},
    {1,	9,	5,	3,	6,	8,	4,	1,	6},
    {5,	9,	3,	6,	3,	4,	8,	2,	1},
    {5,	9,	5,	3,	2,	1,	4,	5,	6},
    {1,	3,	6,	4,	8,	6,	5,	2,	5},
    {4,	1,	2,	3,	6,	8,	4,	9,	2},
    {3,	6,	8,	7,	4,	1,	5,	6,	3}};

 */

 /**subGridError
   {{4,	3,	5,	2,	6,	9,	7,	8,	1},
    {6,	8,	2,	5,	7,	1,	4,	9,	3},
    {8,	9,	7,	1,	3,	4,	5,	6,	2},
    {1,	2,	6,	8,	9,	5,	3,	4,	7},
    {3,	7,	4,	6,	8,	2,	9,	1,	5},
    {9, 5,	1,	7,	4,	3,	6,	2,	8},
    {5,	1,	9,	3,	2,	6,	8,	7,	4},
    {2,	4,	8,	9,	5,	7,	1,	3,	6},
    {7,	6,	3,	4,	1,	8,	2,	5,	9}};

  */

/**sumValidationError
 * {{1,	3,	3,	4,	5,	6,	7,	7,	9},
    {4,	5,	6,	7,	7,	9,	1,	3,	3},
    {7,	7,	9,	1,	3,	3,	4,	5,	6},
    {9,	1,	3,	3,	4,	5,	6,	7,	7},
    {3,	4,	5,	6,	7,	7,	9,	1,	3},
    {6,	7,	7,	9,	1,	3,	3,	4,	5},
    {7,	9,	1,	3,	3,	4,	5,	6,	7},
    {3,	3,	4,	5,	6,	7,	7,	9,	1},
    {5,	6,	7,	7,	9,	1,	3,	3,	4}};

 */
