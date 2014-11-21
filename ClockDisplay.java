
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
    //Nos guarda el año.
    private NumberDisplay year;
    //Nos guarda los dias
    private NumberDisplay day;
    //Nos guarda el mes
    private NumberDisplay month; 
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
    public ClockDisplay(int newHours, int newMinutes, int newYear, int newDay, int newMonth)
    {   
        hours = new NumberDisplay(24);
        hours.setValue(newHours);
        minutes = new NumberDisplay(60);
        minutes.setValue(newMinutes);
        day = new NumberDisplay(30);
        day.setValue(newDay);
        month = new NumberDisplay(12);
        month.setValue(newMonth);
        year = new NumberDisplay(3000);
        year.setValue(newYear);
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
      int actualHora = hours.getValue();
      if(actualHora < 12)
      {
          if (actualHora == 0)
          {
              displayString = "12"+ ":" + minutes.getDisplayValue() + " am";
          }
          else
          {
             displayString = hours.getDisplayValue() + ":" + minutes.getDisplayValue() + " am";
          }

      }
      else
      {
          if (actualHora == 12)
          {
              displayString = actualHora + ":" + minutes.getDisplayValue() + " pm";
          }
          else
          { 
              if((actualHora-12) <10 )
              {
                  displayString = "0" + (actualHora-12) + ":" + minutes.getDisplayValue() + " pm";
              }
              else
              {
                  displayString = (actualHora-12) + ":"  + minutes.getDisplayValue() + " pm";
              }
          }
      }
    
       
    }
}
