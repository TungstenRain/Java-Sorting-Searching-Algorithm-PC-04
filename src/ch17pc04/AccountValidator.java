package ch17pc04;

/**
 * 
 * @author frank
 */
public class AccountValidator {
    
    public static boolean validated(int value) {
        int[] validNumbers = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 8080152, 4562555, 5552012, 5050552, 7825877, 1250255, 1005231, 6545231, 3852085, 7576651, 7881200, 4581002};
        if (search(validNumbers, value) != -1){
           return true; 
        } else {
            return false;
        }
    }
    
    private static int search(int[] array, int value) {
        int index = 0;
        int position = -1;
        boolean found = false;
        
        while (!found && index < array.length) {
            if (array[index] == value) {
                found = true;
                position = index;
            } else {
                index++;
            }
        }
        return position;
    }
}
