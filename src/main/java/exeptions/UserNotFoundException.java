/*
 * Date : 7/16/2021
 * File Name: UserNotFoundException.Java
 *Author : Hamed
 *
 */

package exeptions;

/**
 * Class Description :
 *
 * @author Hamed
 * @version 1.0 16 Jul 2021
 * @contact:
 */
public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(String message) {
        super(message);
    }
}
