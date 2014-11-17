
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
     * Constructor sin parametros de la clase ClockDisplay
     */
    public ClockDisplay()
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        horaActual = "00:00";
        
        
    }
    /**
     * Constructor con parametros de la clase ClockDisplay
     */
    public ClockDisplay(int newHours, int newMinutes)
    {   
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        horaActual = newHours + ":" + newMinutes;
        
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
}
