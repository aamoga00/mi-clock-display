
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String horaActual;
    /**
     * Constructor sin parametros de la clase ClockDisplay, reloj a 00:00
     */
    public ClockDisplay()
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        horaActual = (hours.getDisplayValue()+":"+minutes.getDisplayValue());
        
        
    }
    /**
     * Constructor con parametros de la clase ClockDisplay
     */
    public ClockDisplay(int hours2, int minutes2)
    {   
        hours = new NumberDisplay(24);
        hours.setValue(hours2);
        minutes = new NumberDisplay(60);
        minutes.setValue(minutes2);
        horaActual = (hours.getDisplayValue()+":"+minutes.getDisplayValue());
    }  
    /**
     * Metodo que fija unas horas y minutos a la hora actual
     */
    public void setTime(int newHours, int newMinutes)
    {
        if((newHours < 24) && (newHours >= 0)&&(newMinutes < 60) && (newMinutes >= 0))
        {
            
            horaActual = newHours + ":"+ newMinutes;
        
        }
    }
    /**
     * Metodo que muestra en una cadena de caracteres la hora actual.
     */
    public String getTime() 
    {
    
       return horaActual;
    }
}
