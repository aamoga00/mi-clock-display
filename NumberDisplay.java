
/**
 * Write a description of class NumberDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
    public class NumberDisplay
{
    // instance variables - replace the example below with your own
    private int value;
    private int limit;
/**
     * Constructor for objects of class NumberDisplay
     */
    public NumberDisplay(int newLimit)
    {
        // initialise instance variables
        value = 0;
        limit = newLimit;
    }
/**
  * Method tha add a new value  
  */
   public void setValue(int newValue)
   {
     if((newValue < limit) && (newValue >=0))
     {
        value = newValue;
     }
   }
 /**
     * Devuelve por pantalla una cadena de dos caracteres con el valor del atributo value
     */
    public String getDisplayValue()
    {
        String returnedValue ="";
        if(value < 10)
        {
            returnedValue= "0" + value;
        }
    
        else
        {
            returnedValue =  "" + value;
        
        }
        return returnedValue; // intentar en cada metodo solo utilizar un return (obligatorio en junio)
    }
}
