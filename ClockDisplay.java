
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    //Nos guarda las horas
    private NumberDisplay hours;
    //Nos guarda los minutos
    private NumberDisplay minutes;
    //Un string de 5 caracteres: la hora, dos puntos y los minutos
    private String displayString;
    /**
     * Constructor sin parametros de la clase ClockDisplay, reloj a 00:00
     */
    public ClockDisplay()
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        updateDisplay();
        
        
    }
    /**
     * Constructor con parametros de la clase ClockDisplay
     */
    public ClockDisplay(int newHours, int newMinutes)
    {   
        hours = new NumberDisplay(24);
        hours.setValue(newHours);
        minutes = new NumberDisplay(60);
        minutes.setValue(newMinutes);
        updateDisplay();
    }  
    /**
     * Metodo que fija unas horas y minutos a la hora actual
     */
    public void setTime(int new2Hours, int new2Minutes)
    {
        hours.setValue(new2Hours);
        minutes.setValue(new2Minutes);
        updateDisplay();
    }
    /**
     * Metodo que muestra en una cadena de 5 caracteres con la hora y los minutos separados por dos puntos, en formato de 12 horas
     */
    public String getTime() 
    {
       if (hours.getValue()<12)
       {
           displayString = (hours.getDisplayValue()+":"+minutes.getDisplayValue()+" am");
       }
       else if (hours.getValue()==12)
       {
           displayString = (hours.getDisplayValue()+":"+minutes.getDisplayValue()+" pm");
       }
       else if (hours.getValue()>12)
       {
           hours.setValue(hours.getValue()-12);
           displayString = (hours.getDisplayValue()+":"+minutes.getDisplayValue()+" pm");
       }
       return displayString;
    }
    /**
     * Metodo que hace avanzar un minuto la hora actual que marca el reloj
     */
    public void timeTick()
    {
        minutes.increment();
        if(minutes.getValue()==0)   
        {
            hours.increment();
        }
        updateDisplay();
    }
    /**
     * Actualiza el atributo displayString
     */
    private void updateDisplay()
    {
        displayString = (hours.getDisplayValue()+":"+minutes.getDisplayValue());
    }
}
